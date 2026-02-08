##Week 01 Revision



PART 1 — 10 High-Value Review Notes (Write These)

Put these in your Notes.md / flashcards.

1️⃣ Java Execution Flow

Program starts at main()

Methods run via call stack

Each method has its own stack frame

2️⃣ Stack Frame

Created on each method call

Stores parameters + local variables

Destroyed on return

3️⃣ Primitive vs Reference

Primitives → store values

References → store object addresses

4️⃣ == vs .equals()

== → reference/value

.equals() → content (if overridden)

5️⃣ Type Promotion

byte/short/char → int before arithmetic

narrowing requires cast

6️⃣ Control Flow

if → complex conditions

switch → discrete values

break → exit

continue → skip

7️⃣ Loops

for → known iterations

while → unknown

do-while → at least once

8️⃣ Prime Logic

Check till √n

i * i <= n

9️⃣ Methods

Parameters passed by value

Return sends result back

Overloading = same name, diff params

🔟 Unit Testing

Tests individual methods

Prevents regressions

Uses assertions

🧪 PART 2 — Refactor 1 Old Program (Important)

Pick ONE of these:

✅ Prime checker
✅ Pattern pyramid
✅ Reverse number
✅ Utils class

Refactor by:

Better variable names

Removing duplication

Adding comments

Improving boundaries

Example:

❌ Bad

for(int i=2;i<=n;i++)


✅ Better

for(int divisor = 2; divisor * divisor <= n; divisor++)

✍️ PART 3 — Redo 2 Problems (No Notes)

Do these without looking:

Problem A

Count digits in number

Problem B

Check prime

If you struggle → that’s your weak area.

🎤 PART 4 — Mock Interview (30–45 min)

Answer OUT LOUD.
Pretend I’m the interviewer.

Section 1: Java Execution
Q1

Explain what happens when a Java program runs.

Q2

What is a stack frame?

Q3

What causes StackOverflowError?

Section 2: Control Flow
Q4

Difference between if and switch?

Q5

When is do-while useful?

Q6

break vs continue?

Section 3: Loops & Logic
Q7

Why check primes till √n?

Q8

Explain time complexity of nested loops.

Section 4: Methods
Q9

What is method overloading?

Q10

Are parameters passed by value or reference?

Section 5: Design Thinking
Q11

How do you avoid duplicated logic?

Q12

Why are unit tests important?

📇 PART 5 — Flashcards (15 Cards)

Make these (physically or digitally):

Stack frame

Call stack

== vs equals

Type promotion

Widening

Narrowing

Loop invariant

Big-O

O(n²)

O(√n)

Overloading

Overriding

Unit test

Assertion

Regression

Front = term
Back = explanation

🏆 PART 6 — Week 1 Readiness Check

You’re ready for Week 2 if you can:

✅ Write a prime checker from memory
✅ Explain stack frames simply
✅ Debug infinite loops
✅ Write reusable methods
✅ Write basic JUnit tests

If any ❌ → revisit that topic.
