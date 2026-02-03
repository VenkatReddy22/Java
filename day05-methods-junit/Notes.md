# Phase 1 · Week 1 · Day 5  
## 📘 **Methods, Stack Frames, & Unit Testing**  

---

## 🟡 **PART 1️⃣ — METHODS + STACK (CORE JAVA FUNDAMENTALS)**  

### 1️⃣ **What is a Method?**  
- A reusable block of code that:  
  - Takes **input** (parameters).  
  - Performs **logic**.  
  - Optionally **returns a result**.  

#### Example:  
```java
int add(int a, int b) {
    return a + b;
}
```  

#### Why Methods Matter?  
- **Code reuse**  
- **Readability**  
- **Testability**  
- **Separation of concerns**  

---

### 2️⃣ **Method Anatomy**  
#### Syntax:  
```java
accessModifier returnType methodName(parameters) {
    // body
    return value; // optional
}
```  

#### Example:  
```java
static boolean isPrime(int n) {
    if (n < 2) return false;
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) return false;
    }
    return true;
}
```  

---

### 3️⃣ **Parameters vs Return Values**  

#### Parameters:  
- **Inputs** to a method.  
- Passed by value in Java (**important!**).  
```java
void printSum(int a, int b) { }
```  

#### Return Values:  
- **Output** from a method.  
- A method can return only one value (but objects can bundle multiple values).  
```java
int max(int a, int b) {
    return a > b ? a : b;
}
```

---

### 4️⃣ **Method Overloading (Preview)**  

#### Definition:  
- Same method name, different parameter list.  

#### Examples:  
```java
int max(int a, int b);
int max(int a, int b, int c);
```  

#### Rules:  
- Must differ in **number** or **type** of parameters.  
- **Return type alone is NOT enough.**  

❌ **Invalid Example**:  
```java
int sum(int a, int b);
double sum(int a, int b);
```  

---

### 5️⃣ **STACK & STACK FRAMES**  

#### **What is the Call Stack?**  
- A LIFO (**Last In, First Out**) structure used to manage method calls.  

#### **What is a Stack Frame?**  
- A **memory block** created for each method call, containing:  
  - Method parameters.  
  - Local variables.  
  - Return address.  
  - Intermediate calculations.  

#### Example Execution:  
```java
static void main(String[] args) {
    int x = 10;
    foo(x);
}

static void foo(int y) {
    int z = y + 5;
}
```

**Trace**:  
1. `main()` → stack frame created.  
2. `foo()` → new stack frame pushed.  
3. `foo()` finishes → frame popped.  

#### Key Interview Points:  
- Stack frames are created **per method call**.  
- Destroyed when the method **returns**.  
- Stack memory is **fast but limited**.  
- **StackOverflowError** = Too many calls (e.g., infinite recursion).  

---

### 6️⃣ **Overloading vs Overriding (Preview)**  

| Feature             | Overloading           | Overriding            |
|---------------------|-----------------------|-----------------------|
| **Same class?**     | ✅ Yes               | ❌ No (Subclass)      |
| **Method name**     | Same                 | Same                 |
| **Parameters**      | Different            | Same                 |
| **Polymorphism**    | ❌ Compile-time       | ✅ Runtime            |

#### **Key Difference**:  
- **Overloading** is **compile-time** polymorphism.  
- **Overriding** is **runtime** polymorphism.  

---

## 🟢 **PART 2️⃣ — UNIT TESTING & JUNIT BASICS**  

### 7️⃣ **What is Unit Testing?**  
- Tests the **smallest testable unit of code** (usually a method).  

#### Example:  
Testing `isPrime(7)` → _expected true_.  

---

### 8️⃣ **Why Unit Testing Is Important? (INTERVIEW GOLD)**  
- Detects **bugs early**.  
- Prevents **regressions**.  
- Enables **safe refactoring**.  
- Improves **design**.  
- **Required** in professional teams.  

✅ **Interview-ready answer**:  
Unit testing ensures **correctness, reliability, and maintainability** of code.  

---

### 9️⃣ **JUnit Basics (JUnit 5)**  

#### Key Annotations:
- `@Test` → marks a test.  
- `@BeforeEach` → runs before each test.  

#### Test Example:  
```java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UtilsTest {

    @Test
    void testIsPrime() {
        assertTrue(Utils.isPrime(7));
        assertFalse(Utils.isPrime(9));
    }
}
```  

---

### 🔵 **10️⃣ Assertions** _(MEMORIZE THESE!)_  

| **Assertion**         | **Meaning**                |
|------------------------|---------------------------|
| `assertEquals(a, b)`   | Values are equal.         |
| `assertTrue(cond)`     | Condition is true.        |
| `assertFalse(cond)`    | Condition is false.       |
| `assertThrows()`       | Exception is expected.    |

---

### 11️⃣ **Utils Class (YOU BUILD TODAY)**  
#### Create:  
```java
public class Utils {

    static int max(int a, int b) { }

    static int min(int a, int b) { }

    static boolean isPrime(int n) { }

    static int gcd(int a, int b) { }

    static int reverseNumber(int n) { }
}
```  

#### **GCD Logic (Euclidean Algorithm)**:  
```java
while (b != 0) {
    int temp = b;
    b = a % b;
    a = temp;
}
return a;
```  

---

### 12️⃣ **Unit Tests You Write Today**  
#### Test Methods:  
- `isPrime`  
- `gcd`  
- `reverseNumber`  

#### Example Test:  
```java
@Test
void testGcd() {
    assertEquals(6, Utils.gcd(12, 18));
}
```  

---

## 🎯 **Interview Questions (Day 5)**

### **Methods & Stack**:  
- What is a stack frame?  
- What happens when a method is called?  
- Why is stack memory fast?  
- What causes `StackOverflowError`?  

### **Overloading vs Overriding**:  
- Difference between method overloading and overriding?  
- Can overloading differ only by return type? Why not?  

### **Unit Testing**:  
- What is unit testing?  
- Why is unit testing important?  
- What is JUnit?  
- What is an assertion?  

---

## 🧪 **Practice Tasks (Day 5)**  

✅ Write `Utils.java`.  
✅ Implement 5 utility methods.  
✅ Write `UtilsTest.java`.  
✅ Run tests and fix failures.  
✅ Write 10 bullet notes on stack frames.  
