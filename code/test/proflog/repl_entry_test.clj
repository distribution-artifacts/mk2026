(ns proflog.repl-entry-test
  (:require [clojure.test :refer [deftest is]]
            [proflog :as repl]))

(deftest top-level-namespace-supports-reviewer-repl-workflow
  (let [program (repl/p1-program)
        query (repl/q (even zero))
        proofs (doall (repl/query-succeeds program query 1 8))
        catalog-result (repl/evaluate-case :p1-even-0-succeeds)]
    (is (seq proofs))
    (is (= :succeeds (:outcome catalog-result)))))
