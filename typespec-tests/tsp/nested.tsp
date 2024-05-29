import "@typespec/http";
import "@typespec/rest";
import "@azure-tools/typespec-azure-core";
import "@azure-tools/typespec-azure-resource-manager";

using TypeSpec.Http;
using TypeSpec.Rest;
using Azure.Core;
using Azure.ResourceManager;
using TypeSpec.OpenAPI;

namespace Azure.Arm.Models.Resources;

@doc("Nested child of Top Level Tracked Resource.")
@parentResource(TopLevelTrackedResource)
model NestedProxyResource is ProxyResource<NestedProxyResourceProperties> {
  @key("nextedProxyResourceName")
  @doc("Name of the nested resource.")
  @visibility("read")
  @path
  @segment("nestedProxyResources")
  @pattern("^[A-Za-z0-9]([A-Za-z0-9-_.]{0,62}[A-Za-z0-9])?$")
  name: string;
}

@doc("Nested Proxy Resource Properties.")
model NestedProxyResourceProperties {
  @visibility("read")
  @doc("Provisioning State of the nested child Resource")
  provisioningState?: ProvisioningState;

  @doc("Nested resource description.")
  description?: string;
}

@armResourceOperations
interface NestedProxyResources {
  get is ArmResourceRead<NestedProxyResource>;

  createOrReplace is ArmResourceCreateOrReplaceAsync<NestedProxyResource>;

  update is ArmResourcePatchAsync<NestedProxyResource, NestedProxyResourceProperties>;

  delete is ArmResourceDeleteWithoutOkAsync<NestedProxyResource>;

  listByParent is ArmResourceListByParent<NestedProxyResource>;
}
