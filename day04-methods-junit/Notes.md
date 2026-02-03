Phase 1 · Week 1 · Day 5
Methods, Stack Frames & Unit Testing
PART 1️⃣ — METHODS + STACK (CORE JAVA FUNDAMENTALS)
1️⃣ What is a Method?

A method is a reusable block of code that:

takes input (parameters)

performs logic

optionally returns a result

int add(int a, int b) {
    return a + b;
}

Why methods matter (interview framing)

Code reuse

Readability

Testability

Separation of concerns

2️⃣ Method Anatomy
accessModifier returnType methodName(parameters) {
    // body
    return value; // optional
}


Example:

static boolean isPrime(int n) {
    if (n < 2) return false;
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) return false;
    }
    return true;
}

3️⃣ Parameters vs Return Values
Parameters

Inputs to a method

Passed by value in Java (important!)

void printSum(int a, int b) { }

Return values

Output from a method

Only one value can be returned (but objects can bundle many)

int max(int a, int b) {
    return a > b ? a : b;
}

4️⃣ Method Overloading (Preview)
Definition

Same method name, different parameter list

int max(int a, int b)
int max(int a, int b, int c)

Rules

Must differ in number or type of parameters

Return type alone is not enough

❌ Invalid:

int sum(int a, int b)
double sum(int a, int b) // NOT overloading

5️⃣ STACK & STACK FRAMES (VERY IMPORTANT)
What is the Call Stack?

Stack is a LIFO (Last In, First Out) structure

Used to manage method calls

What is a Stack Frame? (INTERVIEW QUESTION)

A stack frame is a memory block created for each method call.

It contains:

Method parameters

Local variables

Return address

Intermediate calculations

Example (trace this mentally)
static void main(String[] args) {
    int x = 10;
    foo(x);
}

static void foo(int y) {
    int z = y + 5;
}

Execution:

main() → stack frame created

foo() → new stack frame pushed

foo() finishes → frame popped

Control returns to main()

Key interview points

Stack frames are created per method call

Destroyed when method returns

Stack memory is fast and limited

Stack overflow = too many calls (e.g., infinite recursion)

6️⃣ Overloading vs Overriding (Preview)
Feature	Overloading	Overriding
Same class?	✅ Yes	❌ Subclass
Method name	Same	Same
Parameters	Different	Same
Runtime polymorphism	❌ No	✅ Yes
Interview-ready line

Overloading is compile-time polymorphism, overriding is runtime polymorphism.

(We’ll go deep later.)

PART 2️⃣ — UNIT TESTING & JUNIT BASICS
7️⃣ What is Unit Testing?

Unit testing tests the smallest testable unit of code (usually a method).

Example:

Testing isPrime(7) → expected true

8️⃣ Why Unit Testing Is Important (INTERVIEW GOLD)

Detects bugs early

Prevents regressions

Enables refactoring safely

Improves design

Required in professional teams

Interview-ready answer

Unit testing ensures correctness, reliability, and maintainability of code.

9️⃣ JUnit Basics (JUnit 5)
Key annotations
@Test          // marks a test
@BeforeEach    // runs before each test

Basic Test Example
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UtilsTest {

    @Test
    void testIsPrime() {
        assertTrue(Utils.isPrime(7));
        assertFalse(Utils.isPrime(9));
    }
}

10️⃣ Assertions (MEMORIZE THESE)
Assertion	Meaning
assertEquals(a, b)	values equal
assertTrue(cond)	condition true
assertFalse(cond)	condition false
assertThrows()	exception expected
11️⃣ Utils Class (YOU BUILD TODAY)

Create:

public class Utils {

    static int max(int a, int b) { }

    static int min(int a, int b) { }

    static boolean isPrime(int n) { }

    static int gcd(int a, int b) { }

    static int reverseNumber(int n) { }
}

gcd logic (Euclidean algorithm)
while (b != 0) {
    int temp = b;
    b = a % b;
    a = temp;
}
return a;

12️⃣ Unit Tests You Write Today

Test:

isPrime

gcd

reverseNumber

Example:

@Test
void testGcd() {
    assertEquals(6, Utils.gcd(12, 18));
}

🎯 Interview Questions (Day 5)
Methods & Stack

What is a stack frame?

What happens when a method is called?

Why is stack memory fast?

What causes StackOverflowError?

Overloading vs Overriding

Difference between method overloading and overriding?

Can overloading differ only by return type? Why not?

Unit Testing

What is unit testing?

Why is unit testing important?

What is JUnit?

What is an assertion?

🧪 Practice Tasks (Day 5)

✅ Write Utils.java
✅ Implement 5 utility methods
✅ Write UtilsTest.java
✅ Run tests and fix failures
✅ Write 10 bullet notes on stack frames
