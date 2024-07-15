import "@typespec/http";
import "@typespec/rest";
import "@typespec/versioning";
import "@azure-tools/typespec-azure-core";
import "@azure-tools/typespec-azure-resource-manager";
import "@azure-tools/typespec-client-generator-core";

using TypeSpec.Http;
using TypeSpec.Rest;
using TypeSpec.Versioning;
using Azure.Core;
using Azure.ResourceManager;
using TypeSpec.OpenAPI;
using Azure.ClientGenerator.Core;

@armProviderNamespace
@service({
  title: "ArmResource",
})
@versioned(Versions)
@doc("Arm Resource Provider management API.")
namespace Cadl.ArmResourceProvider2;

@doc("Azure API versions.")
enum Versions {
  @useDependency(Azure.Core.Versions.v1_0_Preview_2)
  @useDependency(Azure.ResourceManager.Versions.v1_0_Preview_1)
  @doc("Preview API version 2022-06-01-preview.")
  v2022_06_01_preview: "2022-06-01-preview",

  @useDependency(Azure.Core.Versions.v1_0_Preview_2)
  @useDependency(Azure.ResourceManager.Versions.v1_0_Preview_1)
  @doc("Preview API version 2022-09-01-preview.")
  v2022_09_01_preview: "2022-09-01-preview",

  @useDependency(Azure.Core.Versions.v1_0_Preview_2)
  @useDependency(Azure.ResourceManager.Versions.v1_0_Preview_1)
  @doc("Public API version.")
  v2023_11_01: "2023-11-01",

  @useDependency(Azure.Core.Versions.v1_0_Preview_2)
  @useDependency(Azure.ResourceManager.Versions.v1_0_Preview_1)
  @doc("Preview API version 2023-12-01-preview.")
  v2023_12_01_preview: "2023-12-01-preview",
}

//----------------------- Top Level Arm Resource -----------------------
@resource("topLevelArmResources")
model TopLevelArmResource is ProxyResource<TopLevelArmResourceProperties> {
  @key("topLevelArmResourceName")
  @path
  @segment("topLevelArmResources")
  @doc("arm resource name for path")
  @pattern("^[A-Za-z0-9]([A-Za-z0-9-_.]{0,62}[A-Za-z0-9])?$")
  name: string;
}

@doc("Top Level Arm Resource Properties.")
model TopLevelArmResourceProperties {
}

//----------------------- Paths -----------------------
@armResourceOperations
interface TopLevelArmResourceInterface {
 get is ArmResourceRead<TopLevelArmResource>;
 createOrReplace is ArmResourceCreateOrReplaceSync<TopLevelArmResource>;
 update is ArmResourcePatchSync<TopLevelArmResource, TopLevelArmResourceProperties>;
}
