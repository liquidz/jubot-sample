(ns myjubot.sample.brain-test
  (:require
    [myjubot.sample.brain :refer :all]
    [jubot.test :refer :all]
    [clojure.test :refer :all]))

(deftest test-brain-handler
  (with-test-brain
    (are [x y] (= x (brain-handler y))
      nil   {}
      "OK"  {:text "set foo bar"}
      "bar" {:text "get foo"}
      nil   {:text "get bar"})))
