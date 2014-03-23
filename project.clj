(defproject func-clojure "0.1.0-SNAPSHOT"
  :description "MOOC on Functional Programming with Clojure"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [iloveponies.tests/training-day "0.1.0-SNAPSHOT"]
                 [iloveponies.tests/structured-data "0.1.0-SNAPSHOT"]
                 [iloveponies.tests/i-am-a-horse-in-the-land-of-booleans "0.1.0-SNAPSHOT"]]
  :profiles {:dev {:plugins [[lein-midje "3.1.1"]]}})
