# Proflog miniKanren 2026 Artifact

This repository contains the executable Proflog artifact and paper materials
for the miniKanren 2026 submission, "Proflog: A Tableau-Based Logic Programming
Kernel in miniKanren."

## Layout

- `code/` contains the Proflog Clojure source, tests, and Leiningen project.
- `paper/` contains the paper source, bibliography, build file, and generated
  PDF.

## Proflog Requirements

- Java
- Leiningen

The Proflog project in `code/` was prepared against Clojure 1.11.1 and
core.logic 1.0.1. Leiningen fetches those dependencies into the local Maven
cache when needed.

## Proflog Commands

From `code/`, start an interactive REPL in the reviewer-facing `proflog`
namespace:

```sh
lein repl
```

Run the focused paper test gate:

```sh
lein test-proflog-paper
```

Run the core smoke suite:

```sh
lein test-proflog-core-smoke
```

Print the evaluated paper example catalog:

```sh
lein run-fitting-catalog
```

Try the focused paper test gate with core.logic 1.1.1:

```sh
lein with-profile core-logic-1.1.1 test-proflog-paper
```

## Paper Build

From `paper/`, build the paper with:

```sh
make
```

The paper uses the workshop-required `acmart` document class. On Debian-like
systems, install the class through the TeX Live publishers collection, for
example `texlive-publishers`, or otherwise make `acmart.cls` available to TeX.
