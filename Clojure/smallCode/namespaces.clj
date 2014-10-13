(ns joy.ch2)

(defn hello []
  (str "Hello"))

(hello)

; include other namespace in program with :require
(ns joy.req
  (:require clojure.set))
(clojure.set/intersection #{1 2 3} #{3 4 5})

; create alias for other namespace
(ns joy.req
  (:require [clojure.set :as s]))
; can now replace "clojure.set" with "s"
(s/intersection #{1 2 3} #{2 3 4})


; :refer to load and create mappings
(ns joy.use-ex
  (:require [clojure.string :refer (capitalize)]))
(map capitalize ["kilgore" "trout"])
