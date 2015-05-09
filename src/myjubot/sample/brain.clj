(ns myjubot.sample.brain
  (:require
    [jubot.handler :as handler]
    [jubot.brain   :as brain]))

(defn brain-handler
  "jubot set <key> <value> - store value to brain
   jubot get <key>         - restore value from brain"
  [{:keys [message-for-me?] :as arg}]
  (handler/regexp arg
    #"^set (.+?) (.+?)$" (fn [{[_ k v] :match}] (brain/set k v) "OK")
    #"^get (.+?)$"       (fn [{[_ k]   :match}] (brain/get k))))
