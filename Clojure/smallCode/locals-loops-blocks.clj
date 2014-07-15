;; Blocks
(do
  (def x 5)
  (def y 4)
  (+ x y)
  [x y])


;; Locals
(let [r   5
      pi  3.1415
      r-squared (* r r)]
  (println "radius is " r)
  (* pi r-squared))


;; Loops

;; recur
(defn print-down-from [x]
  (when (pos? x) ; when positive x
    (println x)      ; print the current x
    (recur (dec x))))   ; recurse with decremented x

(print-down-from 5)

;;