all:

.PHONY: format
format:
	nix fmt

.PHONY: build
build:
	nix build

.PHONY: lock
lock: deps-lock.json

deps-lock.json: deps.edn
	nix run github:jlesquembre/clj-nix#deps-lock -- --deps-include $<
