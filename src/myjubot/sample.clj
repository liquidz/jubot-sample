(ns myjubot.sample
  (:require
    [jubot.handler   :as handler]
    [jubot.scheduler :as scheduler]
    [jubot.brain     :as brain]))

(defn ping-handler
  [{text :text}]
  (if (= text "ping") "pong"))

(def brain-handler
  (handler/regexp
    #"^set (.+?) (.+?)$" (fn [{[_ k v] :match}] (brain/set k v) "OK")
    #"^get (.+?)$"       (fn [{[_ k]   :match}] (brain/get k))))
