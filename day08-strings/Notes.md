# Week 2 · Day 1 — Strings in Java (Complete Notes)

## 1️⃣ What is a String in Java?

In Java, String is:
- A **class**
- An **object**
- Stored in **Heap memory**
- Usually inside **String Pool**

**Example:**
```java
String s = "hello";
```
Creates a String object "hello".

---

## 2️⃣ String Immutability (MOST IMPORTANT)

### Definition
Once a String object is created, its value **cannot be changed**.

**Example:**
```java
String s = "Hi";
s = s + "!";
```
This does **NOT** change "Hi".  
It creates a **new object** "Hi!".

### Memory View
```
"Hi"      (old object)
"Hi!"     (new object)
s → "Hi!"
```

### Why Java Made Strings Immutable (Interview Gold)

1️⃣ **Security**
   - Strings store passwords, tokens, URLs.
   - Immutability prevents modification.

2️⃣ **String Pool Sharing**
   - Multiple references can point to same object.

3️⃣ **Thread Safety**
   - Immutable objects are naturally thread-safe.

4️⃣ **HashMap Reliability**
   - Mutable keys break hashing.

> **Interview Line:** Strings are immutable for security, memory optimization, thread safety, and hashing reliability.

---

## 3️⃣ String Pool

### What is String Pool?
A special memory area in **Heap** that stores unique String literals.

**Example:**
```java
String a = "java";
String b = "java";
```
Both point to **same object**.

### new String() vs Literal
```java
String s1 = "hi";              // pool
String s2 = new String("hi"); // heap
```
Creates extra object.

### Why Pool Exists
- Saves memory
- Improves performance
- Faster comparison

---

## 4️⃣ == vs .equals() (Strings)

| Operator | Meaning |
|----------|---------|
| `==` | Compare reference |
| `.equals()` | Compare content |

**Example:**
```java
String a = "hi";
String b = new String("hi");

a == b        // false
a.equals(b)   // true
```

---

## 5️⃣ StringBuilder (Mutable Strings)

### Why Needed
String concatenation in loops is slow.

**Bad:**
```java
s = s + "a";
```

**Good:**
```java
StringBuilder sb = new StringBuilder();
sb.append("a");
```

### Key Features
- ✅ Mutable
- ✅ Fast
- ❌ Not thread-safe
- ✅ Used for string building

### Important Methods

| Method | Use |
|--------|-----|
| `append(x)` | Add text |
| `reverse()` | Reverse |
| `toString()` | Convert |
| `delete(a,b)` | Remove |
| `charAt(i)` | Access |
| `setCharAt(i,c)` | Modify |

---

## 6️⃣ StringBuilder vs StringBuffer

| Feature | StringBuilder | StringBuffer |
|---------|--------------|--------------|
| Thread-safe | ❌ No | ✅ Yes |
| Speed | Fast | Slow |
| Use | Most apps | Legacy |

---

## 7️⃣ String Performance (Important)

### Bad Pattern
```java
for (...) {
    s += x;
}
```
Creates many objects.

### Good Pattern
```java
StringBuilder sb = new StringBuilder();
```

---

## 8️⃣ Common String Problems & Logic

### Reverse Words
**Approach:**
- Split
- Reverse each
- Join

### Anagram Check
**Approach:**
- Convert to `char[]`
- Sort
- Compare

### Character Count
**Approach:**
- Use `HashMap`

### Palindrome
**Approach:**
- Two pointers

---

## 9️⃣ Time Complexity (Strings)

| Operation | Complexity |
|-----------|------------|
| `charAt` | O(1) |
| `length` | O(1) |
| `concat` | O(n) |
| `reverse` | O(n) |
| `split` | O(n) |

---

## 🔟 Garbage Collection & Strings

- Unused String objects can be GC'd
- Pool strings survive longer
- Interned strings reused

---

## 🎯 Interview Questions (Week 2 Day 1)

### Core
1. Why is String immutable?
2. What is String Pool?
3. Difference between `==` and `.equals()`?
4. Why is String slow in loops?
5. When to use StringBuilder?

### Medium
1. Difference: literal vs `new String()`?
2. What happens in `s = s + "a"`?
3. Is String thread-safe?
4. Can String be garbage collected?
5. How does `intern()` work?

### Advanced
1. Why is String safe as HashMap key?
2. Why is String final?
3. Difference: `substring()` (old vs new Java)?
4. How does `split()` work internally?
5. When would you use StringBuffer?

---

## 🧪 Practice Problems (Day 1)

### Beginner
- Reverse a string
- Count vowels
- Check palindrome
- Remove spaces
- Change case

### Intermediate
- Reverse words
- Anagram check
- Char frequency
- Longest word
- Remove duplicates

### Advanced
- String compression (`aabcc → a2b1c2`)
- First non-repeating char
- Longest palindrome substring
- KMP pattern match
- Group anagrams

---

## 📊 Method Reference Tables

### TABLE 1: Common Methods Across All Three

| Method | String | StringBuilder | StringBuffer | Purpose |
|--------|--------|--------------|--------------|---------|
| `length()` | ✓ | ✓ | ✓ | Get number of characters |
| `charAt(index)` | ✓ | ✓ | ✓ | Get character at position |
| `substring(start, end)` | ✓ | ✓ | ✓ | Extract portion of text |
| `indexOf(String)` | ✓ | ✓ | ✓ | Find position of substring |
| `contains(String)` | ✓ | ✓ | ✓ | Check if substring exists |
| `toString()` | ✓ | ✓ | ✓ | Convert to String |
| `toUpperCase()` | ✓ | ✓ | ✓ | Convert to uppercase |
| `toLowerCase()` | ✓ | ✓ | ✓ | Convert to lowercase |
| `trim()` | ✓ | ✓ | ✓ | Remove whitespace |
| `replace(char, char)` | ✓ | ✓ | ✓ | Replace characters |
| `equals(String)` | ✓ | ✓ | ✓ | Compare content |

---

### TABLE 2: Most Used Methods (Practical Daily Use)

| Method | String | StringBuilder | StringBuffer | When to Use |
|--------|--------|--------------|--------------|-------------|
| `length()` | ✓ | ✓ | ✓ | Check size of text |
| `substring()` | ✓ | ✓ | ✓ | Extract part of string |
| `equals()` | ✓ | ✓ | ✓ | Compare two strings |
| `toUpperCase()` | ✓ | ✓ | ✓ | Convert case |
| `toLowerCase()` | ✓ | ✓ | ✓ | Convert case |
| `contains()` | ✓ | ✓ | ✓ | Check if text exists |
| `split()` | ✓ | ✓ | ✓ | Break into pieces |
| `trim()` | ✓ | ✓ | ✓ | Remove spaces |
| `replace()` | ✓ | ✓ | ✓ | Replace text |
| `indexOf()` | ✓ | ✓ | ✓ | Find position |
| `append()` | ❌ | ✓ | ✓ | Add to end (building) |
| `insert()` | ❌ | ✓ | ✓ | Add at position (building) |
| `delete()` | ❌ | ✓ | ✓ | Remove section (building) |
| `reverse()` | ❌ | ✓ | ✓ | Flip string (building) |
| `charAt()` | ✓ | ✓ | ✓ | Get single character |

---

### Quick Tips for Real-World Coding

**For String**, you'll mostly use:
- `length()`, `equals()`, `substring()`, `indexOf()`, `contains()`, `split()`, `toLowerCase()`, `toUpperCase()`, `trim()`, `replace()`

**For StringBuilder**, you'll mostly use:
- `append()`, `insert()`, `delete()`, `reverse()`, `toString()`, `length()`, `charAt()`

**For StringBuffer**:
- Same as StringBuilder, but you almost never use it in modern Java.

---

## 💡 Practical Example: Combining All Three

```java
// STRING - reading and checking
String originalText = "Hello World Java";
int len = originalText.length();              // 16
boolean hasJava = originalText.contains("Java");  // true
String upper = originalText.toUpperCase();    // HELLO WORLD JAVA

// STRINGBUILDER - building text
StringBuilder sb = new StringBuilder();
sb.append("Hello");
sb.append(" ");
sb.append("World");
String built = sb.toString();                 // Hello World

// Building with modifications
StringBuilder sb2 = new StringBuilder("Java");
sb2.insert(0, "Learn ");                      // Learn Java
sb2.append(" Now");                           // Learn Java Now
String finalText = sb2.toString();            // Learn Java Now
```

---

## 📚 Resources
- [Java String Documentation](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)
- [StringBuilder Documentation](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html)

---

**Happy Learning! 🚀**