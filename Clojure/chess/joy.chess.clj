(ns joy.chess)

(defn initial-board []
  [\r \n \b \q \k \b \n \r
   \p \p \p \p \p \p \p \p
   \- \- \- \- \- \- \- \-
   \- \- \- \- \- \- \- \-
   \- \- \- \- \- \- \- \-
   \- \- \- \- \- \- \- \-
   \P \P \P \P \P \P \P \P
   \R \N \B \Q \K \B \N \R])

(def ^:dynamic *file-key* \a)
(def ^:dynamic *rank-key* \0)

;; Calculate File (horizontal) projection (returns 0 through 7)
(defn- file-component [file]
  (- (int file) (int *file-key*))) ; subtract file-key from file as int

;; Calculate Rank (vertical) projection (returns multiple of 8)
(defn- rank-component [rank]
  (->> (int *rank-key*)
       (- (int rank))  ; subtract rank-key from rank (returns 1 through 8)
       (- 8)           ; subtract result from 8
       (* 8)))         ; multiply result by 8

;; Project the ID layout onto a logical 2D chessboard
(defn- index [file rank]
  (+ (file-component file) (rank-component rank))) ; Add row and column (rank + file) to get array position

;; Define the lookup function to get the piece at position (pos) on (board)
(defn lookup [board pos]
  (let [[file rank] pos] ; split string of pos into file and rank
    (board (index file rank))))

(lookup (initial-board) "a1")


