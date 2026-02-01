# Java Basics and Key Concepts

## Data Types in Java

### Primitive vs Non-Primitive Data Types

- **Primitive data types**: `byte`, `short`, `int`, `long`, `float`, `double`, `boolean`, `char`
- **Non-primitive data types**: `String`, Arrays, and Classes

### Data Type Description & Default Values

| Data Type    | Description                                                    | Default Value (for fields) |
|--------------|----------------------------------------------------------------|----------------------------|
| `byte`       | Whole numbers from -128 to 127                                 | `0`                        |
| `short`      | Whole numbers from -32,768 to 32,767                           | `0`                        |
| `int`        | Whole numbers from -2,147,483,648 to 2,147,483,647             | `0`                        |
| `long`       | Whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 | `0L` |
| `float`      | Fractional numbers (6-7 decimal digits precision)              | `0.0f`                    |
| `double`     | Fractional numbers (15-16 decimal digits precision)            | `0.0d`                    |
| `boolean`    | Represents `true` or `false` values                            | `false`                   |
| `char`       | A single letter/character (surrounded by single quotes)        | `'\u0000'`                |
| `String`     | Represents a sequence of characters                            | `null`                    |

> **Note**: Default values are assigned only to fields. Local variables must be initialized explicitly before use, or it will result in a compile-time error.

---

## Key Java Concepts

### 1️⃣ Primitive vs Reference Types
- **Primitives**: Store actual values like `int`, `double`, `char`, `boolean`
- **References**: Store memory locations pointing to objects (e.g., `String`, `Objects`, Arrays)
- `==` compares:
  - Values for **primitives**
  - References for **objects**.

---

### 2️⃣ Casting & Numeric Promotion

#### Widening Casting (automatic)
Converting smaller types to larger ones (safe, no data loss):

`byte -> short -> char -> int -> long -> float -> double`

#### Narrowing Casting (manual)
Converting larger types to smaller ones (can cause data loss, requires casting):

`double -> float -> long -> int -> char -> short -> byte`

> **Example**:
> ```java
> int x = (int) 3.14; // narrowing cast (data loss)
> ```

- **Arithmetic Promotions**:
  - `byte`, `short`, `char` → promoted to `int` during arithmetic.
  - Casting doesn’t prevent overflow unless done **before** arithmetic.

---

### 3️⃣ Integer Overflow & Wraparound
- Java uses **fixed-width two’s complement**, so:
  - Overflow wraps silently (doesn’t throw exceptions).
  - Example:
    ```java
    int x = Integer.MAX_VALUE + 1; // wraparound to Integer.MIN_VALUE
    ```
  - Alternative:
    ```java
    int safeResult = Math.addExact(a, b); // throws ArithmeticException on overflows
    ```

---

### 4️⃣ `char` is Numeric
- `char` stores Unicode values.
- Promoted to `int` during arithmetic.
  ```java
  System.out.println('A' + 1); // Outputs 66
  ```

---

### 5️⃣ Operators Overview

#### Arithmetic Operators
| Operator | Name         | Example    | Description                  |
|----------|--------------|------------|------------------------------|
| `+`      | Addition     | `x + y`    | Adds two values              |
| `-`      | Subtraction  | `x - y`    | Subtracts one value from another |
| `*`      | Multiplication| `x * y`   | Multiplies two values        |
| `/`      | Division     | `x / y`    | Divides one value by another |
| `%`      | Modulus      | `x % y`    | Returns division remainder   |

#### Assignment Operators
| Operator | Example | Equivalent to |
|----------|---------|---------------|
| `+=`     | `x += y`| `x = x + y`   |
| `-=`     | `x -= y`| `x = x - y`   |
| `*=`     | `x *= y`| `x = x * y`   |

#### Comparison Operators
| Operator | Name                      | Example     |
|----------|---------------------------|-------------|
| `==`     | Equal to                  | `x == y`    |
| `!=`     | Not equal                 | `x != y`    |
| `>`      | Greater than              | `x > y`     |

---

### 6️⃣ Special Notes on Strings
- **Escape Sequences for `char` and `String`**:
  - `\t` (Tab), `\n` (Newline), `\"` (Double quote), etc.
- **String Pool**:
  - String literals are pooled and reused.
  - `"java" == "java"` → `true` due to pooling.

---

## Additional Java Concepts

### Memory Model
- **Stack**: Stores local variables and method calls.
- **Heap**: Stores objects and arrays.
- **Garbage Collection**: Cleans unreachable heap objects.

---

### `equals()` vs `==`
| Used For            | Comparisons       |
|---------------------|-------------------|
| `==`                | **Primitives**: Compares values |
|                     | **Objects**: Compares references |
| `.equals()`         | Logical/content comparison (can be overridden) |

---

### Handling Decimal Precision
- **Use `double` cautiously for financial calculations**. It’s better to use:
  - `BigDecimal`: Precise, eliminates rounding errors.
  - Example:
    ```java
    BigDecimal amount = new BigDecimal("0.1"); // Safer
    ```

---

## FAQ: Key Practice Questions

### Casting & Overflow
1. Why is narrowing conversion explicit in Java?
2. What happens when you cast `double` to `int`?
3. How can you prevent overflow during arithmetic?

### Equality
1. Difference between `==` and `.equals()`?
2. Why is `==` unreliable for comparing objects?

### Memory
1. Where are Java objects stored?
2. Why don’t local variables have default values?

### Operators Precedence
1. Why does `b += 1` work but `b = b + 1` fail for `byte`?

---

## Summary
1️⃣ Safe Type Casting: Use widening for automatic casting, narrow cautiously (with manual casting).  
2️⃣ Use `double` for precision but switch to `BigDecimal` when exact values matter.  
3️⃣ Understand memory allocation (Stack vs Heap) to predict object lifecycles.  
4️⃣ Use `.equals()` for logical equality between objects.  

For further explanation, feel free to open an issue or refer to Java documentation! 🩵
