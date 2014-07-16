;; recur
(defn print-down-from [x]
  (when (pos? x) ; when positive x
    (println x)      ; print the current x
    (recur (dec x))))   ; recurse with decremented x

(print-down-from 5)


(defn sum-down-from [sum x]
  (if (pos? x)
    (recur (+ sum x) (dec x))
    sum))

(sum-down-from 0 10)

