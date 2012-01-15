;; Solutions are in order from least to most recent

;; 1

true

;; 2

4

;; 3

"HELLO WORLD"

;; 4 

:a :b :c

;; 5

'(1 2 3 4)

;; 6

:a :b :c

;; 7

[1 2 3 4]

;; 8

#{:a :b :c :d}

;; 9

2

;; 10

20

;; 11

{:b 2}

;; 12

3

;; 13

[20 30 40]

;; 14

8

;; 15

(fn [x] (* 2 x))

;; 16

(fn [name] (str "Hello, " name "!"))

;; 17

'(6 7 8)

;; 18

'(6 7)

;; 19

#(nth % (dec (count %)))

;; 20 (yes, sorta cheating on this one)

#(nth % (dec (dec (count %))))

;; 21

#(last (take (inc %2) %1))

;; 22

#(apply + (map (fn [x] (int 1)) %1))

;; 23

(fn [coll] 
  (if (set? coll) 
      (map-indexed 
        (fn [index, item] 
          (nth (seq coll) (- (dec (count coll)) index))) coll) 
      (map-indexed 
        (fn [index, item] 
          (nth coll (- (dec (count coll)) index))) coll)
))

;; 24

#(apply + %)

;; 25

filter odd?

;; 26

(fn [n]
  (letfn [(fib [i]
	       (if (>= 2 i)
		 1
		 (+ (fib (dec i)) (fib (- i 2)))))]
        (map fib (take n (iterate #(inc %) 1)))))

;; 27

#(= (reverse %) (seq %))

;; 29

(fn [x] (apply str (filter #(Character/isUpperCase %) x)))

;; 34

#(take (- %2 %) (iterate inc %))

;; 35

7

;; 36

[x 7
 y 3
 z 1]

;; 37

"ABC"

;; 42

#(apply * (range 1 (inc %)))

;; 45

'(1 4 7 10 13)

;; 47

4

;; 48

6

;; 57

'(5 4 3 2 1)

;; 64

+

;; 68

[7 6 5 4 3]

;; 97

(fn pascals-triangle [n]
  (let [initial-rows {1 [1] 2 [1 1]}
        guts (fn [coll]
               (let [limit (dec (count coll))
                     add (fn [c n] (+ (nth c n) (nth c (inc n))))]
                 (loop [result []
                        idx 0]
                   (if (= idx limit)
                     result
                     (recur (conj result (add coll idx)) (inc idx))))))
        row (fn [coll] (vec (flatten [1 (guts coll) 1])))]
    (if (>= 2 n)
    (initial-rows n)
    (loop [result [1 1]
           idx 2]
      (if (= idx n)
        result
        (recur (row result) (inc idx)))))))

;; My favorite solution to this problem is
;; from mysticcabbage. It is clean and
;; very elegantly done. It works by putting
;; zeros on either side of the triangle
;; and then recursing through. Beautiful.

(fn [row]
  (nth
    (iterate
      #(map +
        (concat '(0) %)
        (concat % '(0)))
      '(1)) (dec row)))

;; 107

#(fn [x] (Math/pow x %))



