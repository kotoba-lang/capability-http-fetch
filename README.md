# capability-http-fetch

Atomic authority package for `http/fetch`.

- imports: `#{:http-fetch}`
- effects: `#{:network-read}`
- default policy: `:autonomous`
- provider status: `contract-only`

Importing this package does not grant runtime authority. Tamaki must
request it explicitly and Kototama must admit the sealed envelope.

```sh
clojure -M:test
```
