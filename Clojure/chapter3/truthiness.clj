;; Only false and nil are falsey values. All other values are truthy.

(if true :truthy :falsey)
(if [] :truthy :falsey)
(if nil :truthy :falsey)
(if false :truthy :falsey)

;; Don't create Boolean objects
(def evil-false (Boolean. "false"))
evil-false

; equals false, but doesn't return a false value
(= false evil-false)
(if evil-false :truthy :falsey)

;; Use Boolean/valueOf if need to parse string
(if (Boolean/valueOf "false") :truthy :falsey)


;; nil vs false
(when (nil? nil) "Actually nil, not false")
(false? nil)
(false? false)


;; nil punning
(seq [1 2 3])
(seq [])

;; nil punning used to terminate a sequence
(defn print-seq [s]
  (when (seq s)
    (prn (first s))
    (recur (rest s))))

(print-seq [1 3 5])

;; called punning because nil is used in a different manner than its typical meaning

