(ns myjubot.core
  "===================================
   YOU DO NOT NEED TO MODIFY THIS FILE
   ==================================="
  (:require
    [jubot.core :refer [jubot]]))

(def ns-prefix #"^myjubot\.")

(def -main (jubot :ns-regexp ns-prefix))
