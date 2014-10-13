; Access static methods
; java.util.Math#sqrt
(java.lang.Math/sqrt 9)
(Math/sqrt 25)


; create new object
(new java.awt.Point 0 1)
(new java.util.HashMap {"one" 1 "two" 2 "three" 3})
(java.util.HashMap. {"one" 1 "two" 2 "three" 3 "four" 4})

; accessing instance members
; Public instance variable starts field name with dot and hyphen (.-)
(.-x (java.awt.Point. 10 20))

; public instance methods
(.divide (java.math.BigDecimal. "42") 2M)

; setting instance fields with set!
(let [origin (java.awt.Point. 0 0)]
  (set! (.-x origin) 15)
  (str origin))

; chaining method calls with the .. operator
(.endsWith (.toString (java.util.Date.)) "2014")
; is equivalent to
(.. (java.util.Date.) toString (endsWith "2014"))


; using doto to initialize a map
(doto (java.util.HashMap.)
  (.put "HOME" "/home/me")
  (.put "SRC" "/home/me/src"))

