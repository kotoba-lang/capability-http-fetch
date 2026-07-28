(ns kotoba.capability.http.fetch
  "Importable contract for http/fetch."
  (:require [kotoba.core.capability-repository :as repository]))

(def manifest
  (repository/repository-manifest "http/fetch"))
