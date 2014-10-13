(defn xors [max-x max-y]
  (for [x (range max-x)
        y (range max-y)]
    [x y (rem (bit-xor x y) 256)]))

(defn f-values [f xs ys]
  (for [x (range xs)
        y (range ys)]
    [x y (rem (f x y) 256)]))

(def frame (java.awt.Frame.))

(.setVisible frame true)

(def gfx (.getGraphics frame))

(defn clear [g] (.clearRect g 0 0 200 200))

(defn draw-values [f xs ys]
  (clear gfx)
  (.setSize frame (java.awt.Dimension. 200 200))
  (doseq [[x y v] (f-values f xs ys)]
    (.setColor gfx (java.awt.Color. v v v))
    (.fillRect gfx x y 1 1)))

(draw-values bit-and 256 256)


