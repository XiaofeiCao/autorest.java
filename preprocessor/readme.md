#### Preprocessor

``` yaml
pass-thru:
  - model-deduplicator
  - subset-reducer

use-extension:
  "@autorest/modelerfour": "4.21.4"

pipeline:

# --- extension remodeler ---

  # "Shake the tree", and normalize the model
  modelerfour:
    input: openapi-document/multi-api/identity     # the plugin where we get inputs from

    seal-single-value-enum-by-default: true

  # allow developer to do transformations on the code model.
  modelerfour/new-transform:
    input: modelerfour

  preprocessor:
    input: modelerfour/identity
```

```yaml !$(low-level-client)
pipeline:
  modelerfour:
    flatten-models: true
    flatten-payloads: true
    group-parameters: true
```

```yaml $(low-level-client)
license-header: MICROSOFT_MIT_SMALL
generate-client-interfaces: false
generate-client-as-impl: true
generate-sync-async-clients: true
add-context-parameter: true
context-client-method-parameter: true
sync-methods: all
polling: {}

pipeline:
  modelerfour:
    flatten-models: false
    flatten-payloads: false
    group-parameters: false
    lenient-model-deduplication: true

    naming:
      choiceValue: upper
      preserve-uppercase-max-length: 2
      override:
        ip: Ip
        id: Id
```

```yaml $(low-level-client) && $(sdk-integration)
regenerate-pom: true
```

```yaml $(testmodeler)
use-extension:
  "@autorest/testmodeler": "C:\\Users\\xiaofeicao\\projects\\autorest.tests"
  # "@autorest/testmodeler": "1.0.4"


pipeline:
  test-modeler:
    input: modelerfour/identity
  test-modeler/identity:
    input: test-modeler
  preprocessor:
    input: test-modeler/identity

  
test-resources:
  - test: ..\..\azure-rest-api-specs\specification\signalr\resource-manager\Microsoft.SignalRService\preview\2020-07-01-preview\scenarios\signalR.yaml
  
  
input-file:
  - C:\Users\xiaofeicao\projects\fork\azure-rest-api-specs\specification\signalr\resource-manager\Microsoft.SignalRService\preview\2020-07-01-preview\signalr.json
```
