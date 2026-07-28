(ns kotoba.capability.http.fetch-test
  (:require [clojure.test :refer [deftest is]]
            [kotoba.capability.http.fetch :as capability]
            [kotoba.core.capability-repository :as repository]))

(deftest manifest-conforms
  (is (= [] (repository/validate-manifest capability/manifest))))
