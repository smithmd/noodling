// Playground - noun: a place where people can play

import Cocoa

var str = "Hello, playground"

let base = 2
let power = 10
var answer = 1

for _ in 1...power {
    answer *= base
}
println("\(base)^\(power) = \(answer)")