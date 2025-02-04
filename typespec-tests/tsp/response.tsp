import "@typespec/rest";
import "@azure-tools/typespec-azure-core";
import "@azure-tools/typespec-client-generator-core";

using TypeSpec.Http;
using TypeSpec.Rest;
using TypeSpec.Versioning;
using Azure.Core;
using Azure.Core.Traits;
using Azure.ClientGenerator.Core;

@service({
  title: "Response",
  version: "1.0.0",
})
@useDependency(Azure.Core.Versions.v1_0_Preview_2)
namespace Cadl.Response;

@Foundations.Private.needsRoute
op RpcOperationWithAdditionalResponse<
  TParams,
  TResponse extends TypeSpec.Reflection.Model,
  TAdditionalResponse extends object,
  Traits extends object = {},
  TErrorResponse = Azure.Core.Foundations.ErrorResponse
> is Foundations.Operation<
  TParams & Azure.Core.Traits.Private.TraitProperties<Traits, TraitLocation.Parameters>,
  (TResponse & Azure.Core.Traits.Private.TraitProperties<Traits, TraitLocation.Response>) | TAdditionalResponse,
  Traits,
  TErrorResponse
>;

@resource("resources")
model Resource {
  @visibility("read")
  id: string;

  @key
  @visibility("read")
  name: string;
  description?: string;
  type: string;
}

model ResourceArray is Resource[];

@Azure.ClientGenerator.Core.client({
  name: "ResponseClient",
  service: Cadl.Response,
})
@doc("Response")
@route("/response")
interface ResponseOp {
  // binary
  @route("/get-binary")
  @get
  getBinary(): OkResponse & {
    @header("content-type") contentType: "image/png";
    @body body: bytes;
  };

  @route("/get-array")
  getArray(): ResourceArray;

  @route("/get-another-array")
  getAnotherArray(): ResourceArray;

  // response with headers
  @route("/create-with-headers")
  @put
  createWithHeaders(): CreatedResponse & {
    @header("operation-location")
    operationLocation: ResourceLocation<Resource>;

    @body
    body: Resource;
  };

  @route("/delete-with-headers")
  @delete
  deleteWithHeaders(): NoContentResponse & {
    @header("operation-location")
    operationLocation: ResourceLocation<Resource>;
  };

  @route("/exists")
  @head
  exists is RpcOperationWithAdditionalResponse<
    {},
    {
      @doc("A response containing headers related to the Job Schedule, if it exists.")
      @statusCode
      code: "200";
    },
    {
      @doc("A response containing headers related to the Job Schedule, if it exists.")
      @statusCode
      code: "404";
    },
    {},
    Foundations.ErrorResponse
  >;
}
