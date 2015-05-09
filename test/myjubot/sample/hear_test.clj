(ns myjubot.sample.hear-test
  (:require
    [myjubot.sample.hear :refer :all]
    [jubot.test :refer :all]
    [clojure.test :refer :all]))

(deftest test-hear-handler
  (are [x y] (= x (hear-handler (merge {:username "jubot"} y)))
    nil           {}
    "hello jubot" {:text "..hello.."}))
