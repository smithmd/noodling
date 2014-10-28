qsort [] = []
qsort (x : xs)
  = reverse
      (reverse (qsort smaller) ++ [x] ++ reverse (qsort larger))
  where x = maximum xs
        smaller = [a | a <- xs, a < x]
        larger = [b | b <- xs, b >= x]