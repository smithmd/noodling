;; anonymous function to make a set

((fn [x y]
  (println "Making a set")
  #{x y})

 1 2)


;; create function with (def)
(def make-set-def
  (fn [x y]
    (println "Making a Set")
    #{x y}))

(make-set-def 2 3)


;; cumbersome so create function with (defn)
(defn make-set-defn
  "Takes two values and makes a set from them" ; allows doc string
  [x y]
  (println "Making a set")
  #{x y})

(make-set-defn 3 4)



;; Overloading based on arity (number of parameters) of a function
(defn make-set-mult
  ([x] #{x})
  ([x y] #{x y}))

(make-set-mult 3)
(make-set-mult 4 5)


;; multiple arity using & operator
(defn make-set-unlimited [& all]
  (into #{} all))

(make-set-unlimited 1 2 3 4 5 6 9 1 238789 1 23 5 2 32 56453 12 1 1 1)



;; in place function shorthand #()
(def make-list0 #(list))
(make-list0)

(def make-list2 #(list %1 %2))
(make-list2 1 2)

(def make-list2+ #(list %1 %2 %&))
(make-list2+ 1 2 3 4 6)
