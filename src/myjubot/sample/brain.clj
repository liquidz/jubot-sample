(ns myjubot.sample.brain
  (:require
    [jubot.handler :as handler]
    [jubot.brain   :as brain]))

(def ^{:doc (str "jubot set <key> <value> - store value to brain\n"
                 "jubot get <key> - restore value from brain")}
  brain-handler
  (handler/regexp
    #"^set (.+?) (.+?)$" (fn [{[_ k v] :match}] (brain/set k v) "OK")
    #"^get (.+?)$"       (fn [{[_ k]   :match}] (brain/get k))))
