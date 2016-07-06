(ns attendeee.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[attendeee started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[attendeee has shut down successfully]=-"))
   :middleware identity})
