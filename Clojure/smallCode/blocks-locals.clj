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
