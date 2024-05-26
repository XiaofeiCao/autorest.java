import "@typespec/http";
import "@typespec/rest";
import "@azure-tools/typespec-azure-core";
import "@azure-tools/typespec-azure-resource-manager";
import "./toplevel.tsp";

using TypeSpec.Http;
using TypeSpec.Rest;
using Azure.Core;
using Azure.ResourceManager;
using TypeSpec.OpenAPI;

namespace Arm.Models.Resources;

@doc("Nested child of Top Level Arm Resource.")
@parentResource(TopLevelArmResource)
model NestedChildResource is TrackedResource<NestedChildResourceProperties> {
  @key("childResourceName")
  @doc("ChildResources")
  @visibility("read")
  @path
  @segment("childResources")
  @pattern("^[A-Za-z0-9]([A-Za-z0-9-_.]{0,62}[A-Za-z0-9])?$")
  name: string;
}

@doc("Nested child Resource Properties.")
model NestedChildResourceProperties {
  @visibility("read")
  @doc("Provisioning State of Top Level Arm Resource")
  provisioningState?: ProvisioningState;
}

@armResourceOperations
interface NestedChildResources {
  get is ArmResourceRead<NestedChildResource>;

  createOrReplace is ArmResourceCreateOrReplaceAsync<NestedChildResource>;

  update is ArmResourcePatchAsync<NestedChildResource, NestedChildResourceProperties>;

  delete is ArmResourceDeleteWithoutOkAsync<NestedChildResource>;

  listByResourceGroup is ArmResourceListByParent<NestedChildResource>;

  listBySubscription is ArmListBySubscription<NestedChildResource>;
}
