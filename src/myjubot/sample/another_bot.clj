(ns myjubot.sample.another-bot
  (:require [jubot.adapter :refer [out]]))

(def ^:const BOT_NAME "foo")

(defn echo-handler
  [{:keys [to text]}]
  (when (= BOT_NAME to)
    (out text :as BOT_NAME)
    nil))
