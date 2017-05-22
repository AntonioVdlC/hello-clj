(defproject hello-clj "0.1.0-SNAPSHOT"
  :description "My first program in Clojure!"
  :url "https://github.com/AntonioVdlC/hello-clj"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot hello-clj.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
