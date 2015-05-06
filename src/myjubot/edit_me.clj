(ns myjubot.edit-me
  (:require
    [jubot.handler :as handler]))

(defn your-first-handler
  "Welcome to jubot!"
  [{:keys [text message-for-me?]}]
  (if (and message-for-me? (= text "foo")) "bar"))
