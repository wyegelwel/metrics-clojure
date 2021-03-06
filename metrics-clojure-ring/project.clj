(defproject metrics-clojure-ring "2.6.0-SNAPSHOT"
  :description "Various things gluing together metrics-clojure and ring."
  :url "https://github.com/sjl/metrics-clojure"
  :license {:name "MIT"}
  :dependencies [[cheshire "5.3.1"]
                 [metrics-clojure "2.6.0-SNAPSHOT"]]
  :profiles {:dev {:dependencies [[ring "1.3.0"]]}})
