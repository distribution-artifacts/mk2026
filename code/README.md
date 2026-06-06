# Proflog Artifact

This directory is the anonymous executable artifact for the miniKanren 2026
paper, "Proflog: A Tableau-Based Logic Programming Kernel in miniKanren."

It contains the Clojure source and tests needed to run the Proflog kernel and
the paper's example programs.

## Requirements

- Java
- Leiningen

The artifact was prepared against Clojure 1.11.1 and core.logic 1.0.1. Leiningen
will fetch those dependencies in the usual way if they are not already present
in the local Maven cache.

## Quick Start

From this directory:

```sh
lein test-proflog-paper
```

This runs the focused test gate for the paper's Fitting-program catalog. The
expected result is six tests with no failures or errors.

To print the evaluated catalog rows directly:

```sh
lein run-fitting-catalog
```

To start an interactive REPL in the reviewer-facing `proflog` namespace:

```sh
lein repl
```

That namespace refers the prefix frontend macros, query helpers, and paper
catalog functions, so reviewers can write and evaluate small programs
interactively.

To run a smaller smoke suite over the core AST, language, normalization,
substitution, equality, kernel, query, and frontend layers:

```sh
lein test-proflog-core-smoke
```

## Paper Examples

The paper's examples are implemented in:

- `src/proflog/fitting_programs.clj`
- `test/proflog/fitting_programs_test.clj`

The catalog includes:

- Fitting P1 even/odd examples
- Fitting P2 one-or-two-token Nim examples
- Fitting's auxiliary-move warning case
- finite-domain examples
- list-program answer and partial-synthesis rows
- finite group-verifier examples

The public Clojure entry point is `proflog.fitting-programs/-main`, which is
what `lein run-fitting-catalog` calls.

## Compatibility

This artifact is the reviewer-facing distribution for the miniKanren paper. It
includes the reviewer commands above and a small compatibility profile for
trying core.logic 1.1.1:

```sh
lein with-profile core-logic-1.1.1 test-proflog-paper
```
