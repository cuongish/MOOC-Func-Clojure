(ns func-clojure.i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if
    (or
     (= x false)
     (= x nil))
    false
    true))

(defn abs "absolute value" [x]
  (cond
   (not (number? x))
   (throw (IllegalArgumentException. "abs requires a number"))
   (neg? x) (- x)
   :else x))

(defn divides? [divisor n]
  (if (= 0 (mod n divisor))
    true
    false))

(defn fizzbuzz "fizzbuzz" [n]
  (cond
   (zero? (mod n 15)) "gotcha!"
   (zero? (mod n 5)) "buzz"
   (zero? (mod n 3)) "fizz"
   :else ""))


(defn teen? "check if teen?" [age]
  (<= 13 age 19))

(defn not-teen? "check if not-teen?" [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (or (list? x) (vector? x) )(* 2 (count x))
   :else true))

(defn leap-year? "check if leap year" [year]
  (and (zero? (mod year 4))
       (or (pos? (mod year 100))
           (zero? (mod year 400)))))
