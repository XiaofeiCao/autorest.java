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

@resource("topLevelTrackedResources")
model TopLevelTrackedResource is TrackedResource<TopLevelTrackedResourceProperties> {
  @key("topLevelTrackedResourceName")
  @path
  @segment("topLevelTrackedResources")
  @doc("arm resource name for path")
  @pattern("^[A-Za-z0-9]([A-Za-z0-9-_.]{0,62}[A-Za-z0-9])?$")
  name: string;
}

@doc("Top Level Arm Resource Properties.")
model TopLevelTrackedResourceProperties {
  @visibility("read")
  @doc("The status of the last operation.")
  provisioningState?: ProvisioningState;

  @doc("The description of the resource.")
  description?: string;
}

@armResourceOperations
interface TopLevelTrackedResources {
  get is ArmResourceRead<TopLevelTrackedResource>;

  createOrReplace is ArmResourceCreateOrReplaceAsync<TopLevelTrackedResource>;

  delete is ArmResourceDeleteWithoutOkAsync<TopLevelTrackedResource>;

  update is ArmResourcePatchAsync<TopLevelTrackedResource, TopLevelTrackedResourceProperties>;

  listByResourceGroup is ArmResourceListByParent<TopLevelTrackedResource>;

  listBySubscription is ArmListBySubscription<TopLevelTrackedResource>;
}
