import "@typespec/http";
import "@typespec/rest";
import "@azure-tools/typespec-azure-core";
import "@azure-tools/typespec-azure-resource-manager";

using TypeSpec.Http;
using TypeSpec.Rest;
using Azure.Core;
using Azure.ResourceManager;
using TypeSpec.OpenAPI;

namespace Arm.Models.Resources;

@resource("topLevelArmResources")
model TopLevelArmResource is TrackedResource<TopLevelArmResourceProperties> {
  @key("topLevelArmResourceName")
  @path
  @segment("topLevelArmResources")
  @doc("arm resource name for path")
  @pattern("^[A-Za-z0-9]([A-Za-z0-9-_.]{0,62}[A-Za-z0-9])?$")
  name: string;
}

@doc("Top Level Arm Resource Properties.")
model TopLevelArmResourceProperties {
  @visibility("read")
  @doc("The status of the last operation.")
  provisioningState?: ProvisioningState;

  @doc("The description of the resource.")
  description?: string;
}

@armResourceOperations
interface TopLevelArmResources {
  get is ArmResourceRead<TopLevelArmResource>;

  createOrReplace is ArmResourceCreateOrReplaceAsync<TopLevelArmResource>;

  update is ArmResourcePatchAsync<TopLevelArmResource, TopLevelArmResourceProperties>;

  delete is ArmResourceDeleteWithoutOkAsync<TopLevelArmResource>;

  listByResourceGroup is ArmResourceListByParent<TopLevelArmResource>;

  listBySubscription is ArmListBySubscription<TopLevelArmResource>;
}
