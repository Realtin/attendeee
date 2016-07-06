(ns attendeee.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [attendeee.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[attendeee started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[attendeee has shut down successfully]=-"))
   :middleware wrap-dev})
