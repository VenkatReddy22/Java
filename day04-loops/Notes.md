# Day 4 — Loops in Java (Complete Notes)

## Topics Covered
- `for`, `while`, `do-while` Loops
- `break` and `continue`
- Loop Termination & Infinite Loops
- Loop Invariants (Important Interview Concept)
- Pattern Problems
- Prime Number Logic
- Time Complexity Reasoning for Loops

---

## 1️⃣ What is a Loop?

A loop repeatedly executes a block of code as long as a condition evaluates to `true`.

### Every correct loop must have:
- **Initialization** – where the loop starts
- **Condition** – when the loop stops
- **Progress** – how the loop moves toward termination

> **❌ Note:** If any of these are wrong → infinite loop.

---

## 2️⃣ `for` Loop

### **Syntax**
```java
for (initialization; condition; update) {
    // loop body
}
```

### **Example**
```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

### **When to Use**:
- Number of iterations is **known**
- Index-based logic
- Pattern problems

> **Interview Tip:** `for` loops are safer and more readable when iteration bounds are known.

---

## 3️⃣ `while` Loop

### **Syntax**
```java
while (condition) {
    // loop body
}
```

### **Example**
```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

### **When to Use**:
- Iterations depend on a **condition**
- Input validation
- Reading until a condition is met

---

## 4️⃣ `do-while` Loop

### **Syntax**
```java
do {
    // loop body
} while (condition);
```

### **Key Property**
- Executes **at least once**, even if the condition is `false`.

### **Example**
```java
int choice;
do {
    // display menu
    choice = getInput();
} while (choice != 0);
```

> **Interview Tip:** Use `do-while` when execution must happen at least once.

---

## 5️⃣ `break` vs `continue`

- **`break`**: Exits the loop completely.
    ```java
    if (i == 5) break;
    ```
- **`continue`**: Skips the remainder of the current iteration.
    ```java
    if (i == 5) continue;
    ```

> **Interview Tip:** `break` terminates the loop, while `continue` skips one iteration.

---

## 6️⃣ Common Causes of Infinite Loops

1. Missing update of the loop variable
2. Incorrect condition
3. Floating-point equality issues
4. Modifying the loop variable incorrectly

### **Example of an infinite loop**
```java
while (i < 10) {
    System.out.println(i); // i is never updated
}
```

---

## 7️⃣ Loop Invariant (INTERVIEW IMPORTANT)

### **Definition**
A loop invariant is a condition that remains **true before and after** every iteration of the loop.

### **Example**
```java
int sum = 0;
for (int i = 1; i <= n; i++) {
    sum += i;
}
```
Invariant: `sum` always equals the sum of numbers processed so far.

### **Why It Matters**
- Helps prove correctness
- Essential in algorithm design and interviews

---

## 8️⃣ Floating-Point Equality in Loops (WHY TO AVOID)

### **Dangerous Floating-Point Example**
```java
double x = 0.0;
while (x != 1.0) {
    x += 0.1; // may never terminate
}
```

### **Why?**
1. Floating-point numbers like `float` and `double` are stored **imprecisely** in binary.
2. Equality checks (`==`) can fail.

> **Interview Tip:** Avoid floating-point equality comparisons in loops, as they can cause unexpected infinite loops.

---

## 9️⃣ Pattern Logic (Mental Model)

### **Right Triangle**
- **Outer loop** → rows
- **Inner loop** → columns

### **Centered Pyramid**
- **Spaces** = `rows - i`
- **Stars** = `2 * i - 1`

---

## 🔟 Prime Number Logic (Core Algorithm)

### **Definition**
A **prime number**:
- Is greater than 1
- Is divisible only by 1 and itself

### **Optimized Rule**
A number `n` is prime if no divisor exists from `2` to `√n`.

### **Prime Check Skeleton**
```java
boolean isPrime = true;
for (int i = 2; i * i <= n; i++) {
    if (n % i == 0) {
        isPrime = false;
        break;
    }
}
```

### **Why `i * i <= n`?**
- **Faster**
- Avoids floating-point math
- Same logical boundary as `√n`

---

## ⏱️ Time Complexity Cheat Sheet (Loops)

| **Scenario**                  | **Time Complexity** |
|--------------------------------|---------------------|
| Single loop                   | `O(n)`             |
| Nested loops                  | `O(n²)`            |
| Sequential loops              | `O(n)`             |
| Prime check (optimized)       | `O(√n)`            |
| Print primes till `N`         | `O(N√N)`           |

---

## 🧪 Practice Problems (Day 4)

### **Pattern Problems**
1. Right triangle
2. Inverted triangle
3. Number pyramid
4. Centered star pyramid

### **Loop Computation**
1. Sum of first `N` numbers
2. Count digits in a number
3. Reverse a number
4. Palindrome check

### **Logic / Interview**
1. Prime number check
2. Print all primes till `N`

---

## 🎯 Interview Questions (Day 4)

### **Core Questions**
1. What’s the difference between `for`, `while`, and `do-while`?
2. When is `do-while` preferred?
3. Difference between `break` and `continue`?
4. What causes infinite loops?

### **Advanced Questions**
1. What is a loop invariant?
2. Why avoid floating-point equality in loops?
3. Can `break` exit nested loops?
4. How would you optimize a prime-check loop?
5. Why is checking up to `√n` sufficient?
6. Why is `O(n²)` dangerous for large inputs?

---

Feel free to explore and practice the concepts mentioned above to solidify your understanding! 🚀
