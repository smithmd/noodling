;; Destructuring with vectors
(def guys-whole-name ["Guy" "Lewis" "Steele"])
(let [[f-name m-name l-name] guys-whole-name]
  (str l-name ", " f-name " " m-name))

;; positional destructuring doesn't work on sets and maps because they're
;; not logically aligned sequentially

(let [[a b c & more] (range 10 20)]
  (println "a b c are: " a b c)
  (println "more is: " more))


(let [range-vec (vec (range 10))
      [a b c & more :as all] range-vec]
  (println "2 a b c are: " a b c)
  (println "2 more is: " more)
  (println "2 all is: " all))


;; Destructuring with a map
(def guys-name-map
  {:f-name "Guy" :m-name "Lewis" :l-name "Steele"})

(let [{f-name :f-name, m-name :m-name, l-name :l-name} guys-name-map]
  (str l-name ", " f-name " " m-name))

;; uses keys of map to set values
(let [{:keys [f-name m-name l-name]} guys-name-map]
  (str l-name ", " f-name " " m-name))

;; stores the map as whole-name
(let [{f-name :f-name, :as whole-name} guys-name-map]
  (println "First name is" f-name)
  (println "Whole name is below:")
  whole-name)

;; use :or to assign anything that's nil to a value instead
(let [{:keys [title f-name m-name l-name],
       :or {title "Mr."}} guys-name-map]
  (println title f-name m-name l-name))

;; map functions also work on lists
(defn whole-name [& args]
  (let [{:keys [f-name m-name l-name]} args]
    (str l-name ", " f-name " " m-name)))

(whole-name :f-name "Guy" :m-name "Lewis" :l-name "Steele")


;; Destructuring in function parameters
(defn print-last-name [{:keys [l-name]}]
  (println l-name))

(print-last-name guys-name-map)
