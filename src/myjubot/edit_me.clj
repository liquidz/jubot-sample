(ns myjubot.edit-me
  (:require
    [jubot.handler :as handler]))

(defn your-first-handler
  "Welcome to jubot!"
  [{text :text}]
  (if (= text "foo") "bar"))
