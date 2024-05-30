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

@service({
  title: "Inheritance",
})
namespace Cadl.Inheritance;

@doc("This is base model for polymorphic multiple levels inheritance with a discriminator.")
@discriminator("kind")
model Fish {
  age: int32;

  @visibility("create", "read")
  dna: string;
}

@doc("The second level model in polymorphic multiple levels inheritance and it defines a new discriminator.")
@discriminator("sharktype")
model Shark extends Fish {
  kind: FishKind.Shark;
  sharktype: SharkType;
}

@doc("The second level model in polymorphic multiple levels inheritance which contains references to other polymorphic instances.")
model Salmon extends Fish {
  kind: FishKind.Salmon;
  friends?: Fish[];
  hate?: Record<Fish>;
  partner?: Fish;
}

@doc("The third level model SawShark in polymorphic multiple levels inheritance.")
model SawShark extends Shark {
  sharktype: SharkType.Saw;
}

@doc("The third level model GoblinShark in polymorphic multiple levels inheritance.")
model GoblinShark extends Shark {
  sharktype: SharkType.Goblin;
}

union SharkType {
  string,

  Saw: "saw",
  Goblin: "goblin"
}

union FishKind {
  string,

  Salmon: "salmon",
  Shark: "shark"
}

interface Fishes {
  @route("/model")
  @get
  getModel(): Fish;
}