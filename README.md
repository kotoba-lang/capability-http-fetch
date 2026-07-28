# capability-http-fetch

Atomic authority package for `http/fetch`.

- imports: `#{:http-fetch}`
- effects: `#{:network-read}`
- default policy: `:autonomous`
- semantic definition CID: `bafyreigwzveiuxfkyk7tgf2eu7suzkhyj4532gyvpc7hcsa6adzcag55va`
- hash contract CID: `bafkreiflhj3fslsbh7okdas2fzlhmogai64x6p3lkla6gtr7berbp7ftvi`
- provider status: `contract-only`

The repository name is a discovery alias. The semantic definition CID
is the immutable import identity. Importing it does not grant runtime
authority: Tamaki must request it explicitly and Kototama must admit
the sealed envelope.

```sh
clojure -M:test
```
