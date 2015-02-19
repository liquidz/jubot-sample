(ns myjubot.sample-test
  (:require
    [myjubot.sample :refer :all]
    [jubot.test :refer :all]
    [clojure.test :refer :all]))

(deftest test-ping-handler
  (are [x y] (= x (ping-handler y))
    nil    {}
    "pong" {:text "ping"}))

(deftest test-brain-handler
  (with-test-brain
    (are [x y] (= x (brain-handler y))
      nil   {}
      "OK"  {:text "set foo bar"}
      "bar" {:text "get foo"}
      nil   {:text "get bar"})))