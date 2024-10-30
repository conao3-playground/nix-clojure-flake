# nix-flake-clojure

Nix + flake + Clojure template.

Develop and Compile and Ship with Nix.

## Jobs

- `nix develop`: Enter dev-shell.
- `make test`: Run tests via kaocha.
- `make format`: Format files.
- `make build`: Compile project.  Then, you can find binary at `./result/bin/nix-flake-clojure`.
- `make lock`: Regenerate `deps-lock.json`.  This job is automatically run if lock is needed.

## Usage

Add `nix-flake-clojure` into `inputs`.

```nix
{
  inputs = {
    nix-flake-clojure = {
      url = "github:conao3-playground/nix-flake-clojure";
      inputs.nixpkgs.follows = "nixpkgs";
    };
  };
}
```

And use it like home-manager.

```nix
{
  home = {
    packages = [
      inputs.nix-flake-clojure.packages.${system}.default
    ];
  };
}
```
