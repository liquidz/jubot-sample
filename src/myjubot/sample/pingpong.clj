(ns myjubot.sample.pingpong)

(defn ping-handler
  "jubot ping - reply with 'pong'"
  [{text :text}]
  (if (= text "ping") "pong"))
