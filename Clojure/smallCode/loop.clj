;; loop
(defn sum-down-from [initial-x]
  (loop [sum 0, x initial-x] ; loop function
    (if (pos? x) ; if x is positive
      (recur (+ sum x) (dec x)) ; recur over the loop with new parameters
      sum))) ; otherwise return the sum

(sum-down-from 10)
