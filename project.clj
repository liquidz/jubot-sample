(defproject myjubot "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/tools.namespace "0.2.9"]
                 [jubot "0.0.1-SNAPSHOT-7"]]

  :uberjar-name "myjubot-standalone.jar"
  :min-lein-version "2.0.0"
  :profiles {:dev {:source-paths ["dev"]}}

  :aliases {"dev" ["run" "-m" "myjubot.core/-main"]})


