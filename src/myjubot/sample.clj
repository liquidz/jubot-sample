(ns myjubot.sample
  (:require
    [jubot.handler   :as handler]
    [jubot.brain     :as brain]))

(defn ping-handler
  "jubot ping - reply with 'pong'"
  [{text :text}]
  (if (= text "ping") "pong"))


(def ^{:doc (str "jubot set <key> <value> - store value to brain\n"
                 "jubot get <key> - restore value from brain")}
  brain-handler
  (handler/regexp
    #"^set (.+?) (.+?)$" (fn [{[_ k v] :match}] (brain/set k v) "OK")
    #"^get (.+?)$"       (fn [{[_ k]   :match}] (brain/get k))))
