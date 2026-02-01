# 🌟 Comprehensive Guide to Java Basics and Key Concepts

## 📜 Overview

Java is a versatile, object-oriented programming language that uses various data types, operators, and constructs to build applications. This guide provides a detailed breakdown of Java's building blocks, emphasizing clarity, visual organization, and user-friendly design.

---

## 🛠️ **Data Types in Java**

### 📌 Primitive vs Non-Primitive Data Types
1. **Primitive Data Types**:
   - `byte`, `short`, `int`, `long`, `float`, `double`, `boolean`, `char`
   - **Efficient and straightforward**, store actual values.
2. **Non-Primitive Data Types**:
   - `String`, Arrays, Classes
   - Reference types store memory addresses that point to objects in the heap.

---

### 🗂️ Data Type Table: Descriptions & Default Values

| Data Type  | Description                                                                                      | Default Value  |
|------------|--------------------------------------------------------------------------------------------------|----------------|
| `byte`     | Whole numbers from -128 to 127                                                                   | `0`            |
| `short`    | Whole numbers from -32,768 to 32,767                                                             | `0`            |
| `int`      | Whole numbers from -2,147,483,648 to 2,147,483,647                                               | `0`            |
| `long`     | Whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807                       | `0L`           |
| `float`    | Fractional numbers with **6-7 decimal digits precision**                                         | `0.0f`         |
| `double`   | Fractional numbers with **15-16 decimal digits precision**                                       | `0.0d`         |
| `boolean`  | True/false value                                                                                 | `false`        |
| `char`     | Single character (Unicode)                                                                       | `'\u0000'`     |
| `String`   | Sequence of characters                                                                           | `null`         |

---

### 🔑 Important Notes:
1. **Default Values**:
   - Default values apply to **instance variables**.
   - **Local variables**:
     - Must be explicitly initialized before use.
2. **Type Safety**:
   - Once declared, a variable's type **cannot be changed**.
   - Use **type casting** for conversions.

---

## 🔄 **Type Casting: Widening vs Narrowing**

### 1️⃣ **Widening Casting (Automatic)** 👉 Safe
Converting smaller types to larger ones (no data loss):  
`byte → short → char → int → long → float → double`

### 2️⃣ **Narrowing Casting (Explicit)** 👉 Use with Caution
Converting larger types into smaller ones (may lose data):  
`double → float → long → int → char → short → byte`

- **Example**:
  ```java
  double pi = 3.14;
  int x = (int) pi;  // Data loss: x becomes 3
  ```

---

## ⚡ **Key Java Operators**

### **Arithmetic Operators**
- Used for basic mathematical operations.
  
| Operator | Description | Example |  
|----------|-------------|---------|  
| `+`      | Addition    | `x + y` |  
| `-`      | Subtraction | `x - y` |  
| `*`      | Multiplication | `x * 2` |  
| `%`      | Modulus (remainder) | `10 % 3` |

### **Assignment Operators**
Used for compact mathematical assignments.

| Operator | Example | Equivalent |
|----------|---------|------------|
| `+=`     | `x += y`| `x = x + y`|
| `/=`     | `x /= 2`| `x = x / 2`|

> Combine with **arithmetic operators** for **shortened usage**.

---

## 🔢 **Equality: `==` vs `.equals()`**

1. **`==`**:
   - Compares **values** for primitives.
   - Compares **references** for objects.

2. **`.equals()`**:
   - Used for **logical/content comparison**.
   - Overridable for custom object equality.

> Example:
> ```java
> String a = "hello";
> String b = new String("hello");
> System.out.println(a == b);   // false (different references)
> System.out.println(a.equals(b)); // true (same content)
> ```

---

## 🗃️ **Memory Management**

- **Stack**:
  - Stores local variables and method calls.
  - Lives temporarily and cleans up after execution.

- **Heap**:
  - Stores objects and arrays.
  - Managed by **Garbage Collector**.

> **Best Practice**: Make unwanted objects eligible for garbage collection to avoid memory leaks.

---

## 📈 **Key Advanced Topics**

### 🛠️ BigDecimal for Precision Calculations
- Use `BigDecimal` for financial applications to avoid rounding errors.
  
```java
BigDecimal price = new BigDecimal("19.99");
BigDecimal tax = new BigDecimal("0.07");
BigDecimal total = price.add(tax);
```

---

## 🕵️ **📋 Java Interview Question Bank**

### Fundamentals
1. What is the difference between primitive and reference types?
2. Why does Java promote `byte` to `int` during arithmetic?
3. Why is narrowing conversion explicit in Java?

### Casting & Overflow
1. How can you prevent overflow in Java?
2. Why does `(long)(a + 1)` still overflow?

### Equality
1. Difference between `==` and `.equals()`?
2. Why does `"a" == "a"` return true sometimes?

### Memory
1. Where are objects stored in Java?
2. Why don’t local variables have default values?

### char & Operators
1. Why is `char` considered numeric in Java?
2. What is the output of `'A' + 2`?

### BigInteger / BigDecimal
1. Why is `double` unsafe for money calculations?
2. How do you correctly create a `BigDecimal`?

---

## 📝 **Summary**

### 1️⃣ Primitive vs Reference Types
- Primitives store actual **values**.
- References store **memory addresses**.

### 2️⃣ Type Casting & Overflow
- **Widening**: Safe (small → large type).
- **Narrowing**: Explicit, may cause data loss.

### 3️⃣ Operators
- Be mindful of operator **precedence**.
  - Multiplication/division take priority over addition/subtraction.

### 4️⃣ Memory Model
- Understand **Garbage Collection** to manage heap effectively.

### 5️⃣ Equality Comparison
- **`==`**: Reference comparison.
- **`.equals()`**: Logical/content comparison.

> Java ensures safety through definite assignment, fixed-width primitives, and a robust memory model.

---

🎯 **Use Java Concepts Effectively**:
- **String pooling** optimizes memory.
- **BigDecimal** avoids precision issues.
- Be mindful of **logical equality** vs **reference equality**.


# Interview Prep

### Core Questions

#### 1. What is the difference between primitive and reference types in Java?
Primitive types handle simple data like `int`, `boolean`, and `char`, whereas reference types handle complex data like `String`, `objects`, and arrays. Reference types allow the storage and manipulation of more complex data structures.

#### 2. What happens when you cast a double to an int?
Casting a `double` to an `int` is called Narrowing Typecasting. This process can lead to data or fractional loss as the decimal portion is truncated.  
**Example:** `System.out.println((int) 9.99); // Output: 9`

#### 3. Why does `Integer.MAX_VALUE + 1` become negative?
This behavior is due to numeric "wrap-around" that occurs in the 32-bit signed integer system, which behaves like an odometer. Once the value exceeds `Integer.MAX_VALUE` (2^31 - 1), it wraps around to the minimum value (-2^31). This safeguard ensures consistency but can catch developers off guard.

#### 4. What does `==` do for objects vs primitives?
For primitives, the `==` operator compares actual values. For objects, it compares references, meaning it checks whether two objects point to the same memory location. Two objects with identical content but different references will return `false` when compared using `==`.

#### 5. Why can’t local variables have default values?
Local variables are stored on the stack, which is frequently accessed, and uninitialized variables can lead to unsafe or erroneous behavior. To prioritize security over convenience, Java mandates explicit initialization.

---

### Slightly Deeper (Good Signal for Interviews)

#### 6. When would you use BigInteger / BigDecimal instead of int/double?
- **BigInteger**: Use this when `int` or `long` becomes insufficient for extremely large values, e.g., in scientific calculations.
- **BigDecimal**: Use if you want high-precision calculations without rounding errors, such as in financial applications where precision is critical.  
  **Example:** `new BigDecimal("1.00").subtract(new BigDecimal("0.10"))` won't lead to rounding issues unlike `float` or `double`.

#### 7. Explain numeric promotion in an expression like: `byte + byte → ?`
In Java, when performing arithmetic operations, smaller integer types (`byte`, `short`, `char`) are promoted to `int` before any operation.  
**Example:** `byte a = 3, b = 4; int result = a + b; // Result is stored as int`

---

### Practice Questions (Today)

#### Easy (5)

1. **What is the output?**
   - `System.out.println((int) 9.99);`  
     **Answer:** 9
   - `System.out.println(5 / 2);`  
     **Answer:** 2 (Integer division truncates the decimal part)
   - `System.out.println(5 / 2.0);`  
     **Answer:** 2.5 (`double` division retains the decimal part)
   - `System.out.println('A' + 1);`  
     **Answer:** 66 (The ASCII value of `'A'` is 65, so adding 1 results in 66)
   - `System.out.println(true && false || true);`  
     **Answer:** true (Logical AND has higher precedence than OR, so the evaluation is `(true && false) || true`)

2. **Why does `byte b = 127; b++;` behave as it does?**  
   **Answer:** `byte` has a range of -128 to 127. Incrementing `127` causes it to wrap around to the minimum value (-128) due to overflow.

---

#### Medium (3)

1. Fix this bug: **“String comparison not working”**  
   **Issue:** Using `==` to compare `Strings` checks for reference equality, not content.  
   **Fix:** Use the `.equals()` method to compare `String` content.  
   **Example:**  
   ```java
   String s1 = "test";
   String s2 = new String("test");  
   System.out.println(s1.equals(s2)); // true
   ```

2. Predict the output of a mixed-type expression with `int`, `double`, `long`.  
   **Example:**  
   ```java
   System.out.println(10 + 5.5 + 10L);  
   ```  
   - **Answer:** 25.5 (`int` → `double`, `long` → `double`, result is `double`)

3. Why does `System.out.println((byte) (130));` behave a certain way?  
   **Answer:** The range of `byte` is -128 to 127. Casting `130` to `byte` results in overflow, wrapping around to a negative value.  
   **Output:** -126  
   (130 - 256 = -126)

---

For further insights, feel free to raise an issue or contribute! 🛠️✨
