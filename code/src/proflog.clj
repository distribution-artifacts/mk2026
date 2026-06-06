(ns proflog
  "Reviewer-facing REPL namespace for the paper artifact.

   The implementation namespaces remain organized by layer. This namespace
   gathers the small public surface a reviewer is likely to need while
   experimenting interactively: the prefix frontend, the query helpers, and the
   paper catalog constructors and evaluators."
  (:require [proflog.fitting-programs :as fitting]
            [proflog.frontend :as frontend]
            [proflog.query :as query]))

;; Frontend macro wrappers keep examples short in an interactive `lein repl`
;; while preserving the implementation boundary in `proflog.frontend`.
(defmacro language
  [& sections]
  `(frontend/language ~@sections))

(defmacro clauses
  [& source-forms]
  `(frontend/clauses ~@source-forms))

(defmacro proflog
  [frontend-language & source-forms]
  `(frontend/proflog ~frontend-language ~@source-forms))

(defmacro q
  [formula]
  `(frontend/q ~formula))

(defmacro answer-query
  [bindings formula]
  `(frontend/answer-query ~bindings ~formula))

(defmacro run
  ([program bindings formula]
   `(frontend/run ~program ~bindings ~formula))
  ([program bindings formula opts]
   `(frontend/run ~program ~bindings ~formula ~opts)))

;; Function vars are explicitly re-exported so reviewers can also require this
;; namespace from their own scratch namespaces and call `proflog/foo`.
(def app fitting/app)
(def numeral fitting/numeral)
(def p1-program fitting/p1-program)
(def p2-program fitting/p2-program)
(def factored-move-program fitting/factored-move-program)
(def finite-domain-program fitting/finite-domain-program)
(def fitting-cases fitting/fitting-cases)
(def case-by-id fitting/case-by-id)
(def evaluate-case fitting/evaluate-case)
(def evaluate-catalog fitting/evaluate-catalog)

(def query-succeeds query/query-succeeds)
(def query-fails query/query-fails)
(def query-succeeds-within query/query-succeeds-within)
(def query-fails-within query/query-fails-within)
(def query-status query/query-status)
