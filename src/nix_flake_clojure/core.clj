(ns nix-flake-clojure.core
  (:require
   [clojure.tools.logging :as log]
   [babashka.fs :as fs])
  (:gen-class))

(defn -main
  "The entrypoint."
  [& args]
  (log/info args)
  (log/info ["user.home" (System/getProperty "user.home")])
  (log/info ["fs/home" (str (fs/home))]))
