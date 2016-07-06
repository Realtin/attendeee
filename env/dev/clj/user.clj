(ns user
  (:require [mount.core :as mount]
            attendeee.core))

(defn start []
  (mount/start-without #'attendeee.core/repl-server))

(defn stop []
  (mount/stop-except #'attendeee.core/repl-server))

(defn restart []
  (stop)
  (start))


