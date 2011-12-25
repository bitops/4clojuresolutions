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

#(filter (fn [n] (not (= 0 (mod n 2)))) %)

;; 27

#(= (reverse %) (seq %))

;; 29

(fn [x] (apply str (filter #(Character/isUpperCase %) x)))

