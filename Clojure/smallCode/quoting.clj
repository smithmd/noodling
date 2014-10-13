(cons 1 [2 3]) ;=> (1 2 3)

(def age 9)
(quote age) ;=> age NOT 9 becauge quote prevents age from being evaluated
(quote (cons 1 [2 3])) ;=> (cons 1 [2 3]) .. cons is not evaluated because it is quoted

;=> doesn't work because clojure will try to evaluate the 2 as a function call
(cons 1 (2 3))
(cons 1 (quote (2 3))) ;=> clojure doesn't try to evaluate & execute the 2 so we get (1 2 3)

(cons 1 '(2 3)) ;=> can also use ' instead of (quote ..)

; quote affects all arguments
[1 (+ 2 3)] ;=> [1 5]
'(1 (+ 2 3)) ;=> (1 (+ 2 3))


; syntax quote (`)
; I don't entirely understand the point of this, but hopefully I will some day
`(1 2 3)

`map
`Integer


`(map even? [1 2 3])

; unquote (~)
; Evaluates data inside a quoted block
`(+ 10 ~(* 3 2))

`(1 ~(2 3))


; auto-gensym
; Automatically generate a unique symbol for something

`unique-symbol#
