(ns myjubot.core
  (:require
    [jubot.core :refer [jubot]]))

(def ns-prefix #"^myjubot\.")

(def -main (jubot :ns-regexp ns-prefix))
