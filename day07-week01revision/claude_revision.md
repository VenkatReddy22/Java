# Java
Learning Java

---

## 📚 **Weekly Review Plan - Last Week's Java Learning**

> **Purpose:** Structured review of completed topics to solidify understanding and prepare for interviews

### **📅 Overview of Topics Covered**

Based on repository structure:
1. **Day 02** - Types & Operators (TypeCasting.java)
2. **Day 03** - Conditionals (If, Switch, Ternary)
3. **Day 04** - Loops (Nested loops, patterns, computations)
4. **Day 06** - Arrays (Comprehensive operations)

---

## 🗓️ **7-Day Detailed Review Schedule**

### **Day 1: Type Casting & Operators Review (1-2 hours)**

**Topics to Review:**
- ✅ Type casting (implicit & explicit)
- ✅ Overflow behavior (Integer.MAX_VALUE)
- ✅ char ↔ int conversions (Unicode)
- ✅ == vs .equals() for Strings
- ✅ Default values for fields
- ✅ Operator precedence

**Action Items:**
1. **Re-run** all commented programs in `TypeCasting.java`
2. **Test** edge cases:
   - What happens with `byte` overflow?
   - Try casting negative numbers
   - Test with different Unicode characters
3. **Quiz yourself:**
   - When does Java auto-promote types?
   - What's the difference between `==` and `.equals()`?
   - What are default values for `int`, `boolean`, `String`?

**Practice Problem:**
```java
// Create a program that demonstrates all casting scenarios
// Include: widening, narrowing, char arithmetic, String comparison
```

---

### **Day 2: Conditionals Deep Dive (1-2 hours)**

**Topics to Review (from day03-If-Switch-Ternary/):**
- ✅ Nested if-else (Grade calculator)
- ✅ Income tax calculator
- ✅ Switch statements (Menu app)
- ✅ Ternary operators (Even/Odd)

**Action Items:**
1. **Re-implement** the 4 programs:
   - Grade system (score → A/B/C/D/F)
   - Tax calculator with brackets
   - Menu system (ADD/UPDATE/DELETE/EXIT)
   - Even/Odd checker

2. **Improve** the tax calculator:
   - Calculate actual tax amount, not just the rate
   - Handle decimal incomes
   - Add input validation

3. **Challenge:** Convert the nested if-else to switch expressions (Java 14+)

**Practice Problem:**
```java
// Create a comprehensive calculator that:
// - Uses switch for operation selection (+, -, *, /)
// - Uses if-else for input validation
// - Uses ternary for sign display (positive/negative)
```

---

### **Day 3: Loops & Patterns Mastery (2-3 hours)**

**Topics to Review (from day04-loops/):**

**Pattern Problems:**
- ✅ Right Triangle
- ✅ Inverted Triangle
- ✅ Number Pyramid
- ✅ Star Pyramid

**Computational Problems:**
- ✅ Sum of first N numbers
- ✅ Count digits in a number
- ✅ Reverse a number

**Action Items:**
1. **Redraw** all patterns on paper first to understand the logic
2. **Trace** the nested loops:
   - Outer loop: controls rows
   - Inner loops: control spaces and stars/numbers
3. **Fix** the digit counter (handles zero case)
4. **Complete** the reverse number implementation

**Practice Problems:**
```java
// 1. Create a diamond pattern
// 2. Print prime numbers up to N
// 3. Find factorial using loops
// 4. Check if a number is palindrome
// 5. Find GCD of two numbers
```

---

### **Day 4-5: Arrays Comprehensive Review (4-5 hours)**

**Topics to Review (from day06-arrays/):**

#### **Theory Review (2 hours):**
- ✅ What arrays are (mailbox analogy)
- ✅ Memory layout (Stack vs Heap)
- ✅ Why O(1) indexing works (formula!)
- ✅ Time complexity explained
- ✅ Array vs ArrayList comparison

#### **Implementation Review (2 hours):**

From `ArrayToolkit.java`, review these operations:

1. **Find Maximum Element**
   - Time: O(n), Space: O(1)
   - Edge case: null/empty array

2. **Find Second Maximum**
   - Single pass algorithm
   - Track max and secondMax simultaneously

3. **Reverse Array** (in-place)
   - Two-pointer technique
   - left and right pointers

4. **Rotate Array** (by k positions)
   - Reversal algorithm
   - Handle k > array.length

5. **Frequency Map** (count elements)
   - Using HashMap
   - Time: O(n), Space: O(n)

**Action Items:**
1. **Read** files in this order:
   - QUICK_START.txt (15 min)
   - ArraysCompleteLearningGuide.md PART 1 (1 hour)
   - ArrayToolkit.java with tests (30 min)
   
2. **Code from scratch** (no looking):
   - All 5 operations in ArrayToolkit.java
   - Compare with your implementation

3. **Study** interview questions:
   - Answer all 18 questions without looking
   - Check your answers

**Practice Problems:**
```java
// From ArrayInterviewQuestions.md:
// 1. Remove duplicates from sorted array
// 2. Merge two sorted arrays
// 3. Find missing number in array
// 4. Move zeros to end
// 5. Find intersection of two arrays
```

---

### **Day 6: Interview Preparation (2-3 hours)**

**Focus Areas:**

1. **Basic Understanding** (6 questions from ArrayInterviewQuestions.md)
   - What is an array?
   - Why O(1) access?
   - Array vs ArrayList?

2. **Operations** (4 questions)
   - How to find max/min?
   - How to reverse?
   - How to rotate?

3. **Conceptual** (3 questions)
   - Memory management
   - When to use arrays?
   - Performance considerations

4. **Edge Cases** (3 questions)
   - null arrays
   - empty arrays
   - single element arrays

5. **Advanced** (2 questions)
   - Multi-dimensional arrays
   - Time complexity analysis

**Action Items:**
1. **Practice explaining** concepts in "layman terms"
2. **Draw diagrams** for memory layout
3. **Write complexity analysis** for each operation
4. **Mock interview** with yourself

---

### **Day 7: Final Review & Assessment (2 hours)**

#### **Self-Assessment Checklist:**

**Types & Operators:**
- [ ] Can explain type casting with examples
- [ ] Understand overflow behavior
- [ ] Know when to use == vs .equals()

**Conditionals:**
- [ ] Can write nested if-else efficiently
- [ ] Comfortable with switch statements
- [ ] Use ternary operators appropriately

**Loops:**
- [ ] Can create any pattern with nested loops
- [ ] Understand loop control flow
- [ ] Solve computational problems (sum, reverse, count)

**Arrays:**
- [ ] Explain how arrays work in memory
- [ ] Implement all 5 core operations from scratch
- [ ] Know time/space complexity for each
- [ ] Handle edge cases properly
- [ ] Answer all 18 interview questions

**Final Practice Session:**
1. **Timed coding** (30 min):
   - Implement 3 array operations without references
2. **Code review** (30 min):
   - Review your old code
   - Find improvements
3. **Concept mapping** (30 min):
   - Create a mind map of everything learned
4. **Mock interview** (30 min):
   - Record yourself explaining concepts

---

## 📊 **Progress Tracker**

Use this to track your review:

```
Week Review Progress:
Day 1 - Types & Operators: [ ]
Day 2 - Conditionals: [ ]
Day 3 - Loops & Patterns: [ ]
Day 4 - Arrays Theory: [ ]
Day 5 - Arrays Implementation: [ ]
Day 6 - Interview Prep: [ ]
Day 7 - Final Assessment: [ ]

Self-Rating (1-10):
- Type Casting: __/10
- Conditionals: __/10
- Loops: __/10
- Arrays: __/10
- Problem Solving: __/10
```

---

## 🚀 **Next Steps After Review**

### **Practice Platforms:**
- LeetCode (Easy array problems)
- HackerRank (Java basics)
- CodeWars (Fundamentals)

### **Mini-Projects:**
- Grade calculator app
- Tax calculator with GUI
- Pattern generator tool
- Array utility library

### **Continue Learning:**
- Move to Day 07 topics
- Explore Collections (ArrayList, HashMap)
- Learn String manipulation
- Study recursion

---

## 📂 **Repository Structure**

```
Java/
├── Day02-types-operators/
│   └── TypeCasting.java
├── day03-If-Switch-Ternary/
│   └── Loops.java
├── day04-loops/
│   └── Loops.java
└── day06-arrays/
    ├── README.md (Comprehensive guide)
    ├── ArraysCompleteLearningGuide.md
    ├── ArrayToolkit.java
    ├── ArrayInterviewQuestions.md
    ├── ArrayLearningRoadmap.md
    ├── INDEX.txt
    └── QUICK_START.txt
```

---

## 📌 **Quick Links**

- **Arrays Package:** See [day06-arrays/README.md](day06-arrays/README.md) for complete documentation
- **Start Reading:** ArraysCompleteLearningGuide.md
- **See Code:** ArrayToolkit.java
- **Practice Questions:** ArrayInterviewQuestions.md
- **Study Plan:** ArrayLearningRoadmap.md

---

**Last Updated:** February 8, 2026  
**Status:** Active Learning & Review Phase  
**Current Focus:** Weekly Review & Interview Preparation

---

*Keep coding, keep learning! 🚀*
