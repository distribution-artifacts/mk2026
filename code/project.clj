(defproject proflog-artifact "0.1.0-SNAPSHOT"
  :description "Anonymous artifact for the miniKanren 2026 Proflog paper"
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [org.clojure/core.logic "1.0.1"]]
  :source-paths ["src"]
  :test-paths ["test"]
  :test-selectors
  {:slow (fn [m & _] (:slow m))
   :constructor-recursive (fn [m & _] (:constructor-recursive m))}
  :repl-options {:init-ns proflog}
  :aliases {"run-fitting-catalog" ["run" "-m" "proflog.fitting-programs"]
            "test-proflog-fitting-programs" ["test"
                                             "proflog.fitting-programs-test"]
            "test-proflog-paper" ["test"
                                  "proflog.fitting-programs-test"]
            "test-proflog-core-smoke" ["test"
                                       "proflog.ast-test"
                                       "proflog.language-test"
                                       "proflog.normalize-test"
                                       "proflog.subst-test"
                                       "proflog.equality-test"
                                       "proflog.kernel-test"
                                       "proflog.query-test"
                                       "proflog.frontend-test"
                                       "proflog.repl-entry-test"]}
  :profiles {:core-logic-1.1.1
             {:dependencies ^:replace [[org.clojure/clojure "1.11.1"]
                                       [org.clojure/core.logic "1.1.1"]]}})
