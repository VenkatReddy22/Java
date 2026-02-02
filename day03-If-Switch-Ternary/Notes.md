# Java Control Flow & Core Concepts — Interview Q&A

This section covers control flow, equality, safety patterns, and design thinking practiced during Day 3.

---

## 1️⃣ Difference between if-else and switch

**Answer:**

- **if-else** is condition-based and supports complex expressions, ranges, and multiple variables.
- **switch** is value-based, used when branching on a single variable with discrete values.

**Interview-ready line:**

Use if-else for complex or range-based logic, and switch for clean routing on discrete values.

---

## 2️⃣ Why is `break` needed in a switch?

**Answer:**

- Without `break`, execution falls through into subsequent cases.
- This may cause multiple cases to execute unintentionally.

**Key term:** Fall-through

**Example use-case for fall-through:**
```java
case 6:
case 7:
    System.out.println("Weekend");
    break;
```

---

## 3️⃣ What happens if you omit `default` in a switch?

**Answer:**

- If no case matches and `default` is missing, nothing executes.
- `default` is optional but recommended for safety and clarity.

---

## 4️⃣ Can switch work with `String`? Since when?

**Answer:**

- Yes, `switch` supports `String` since Java 7.

**Extra insight:**

- Internally, Java uses hash-based lookup for `String` switch cases.

---

## 5️⃣ Can switch work with enums? Why is that useful?

**Answer:**

- Yes, `switch` works with enums.

**Why it is useful:**
1. Enums provide type safety, readability, and clear handling of finite states.
2. Use cases:
   - Order status
   - Workflow steps
   - State machines
   - Command routing

**Interview-ready line:**

Switching on enums is ideal for modeling finite, well-defined states in a type-safe way.

---

## 6️⃣ Why doesn’t `switch` support long?

**Answer:**

- `switch` was designed for efficient handling of 32-bit values.
- Supporting `long` would complicate bytecode and reduce performance.

**Interview-ready line:**

`switch` avoids `long` to keep bytecode simple and efficient.

---

## 7️⃣ When is if-else better than switch in production code?

**Answer:**

When conditions involve:
1. Ranges
2. Compound boolean expressions
3. Multiple variables
4. Common in validations and business rules.

**Example:**
```java
if (age > 18 && income > 50000) { }
```

---

## 8️⃣ Why is the ternary operator discouraged for complex logic?

**Answer:**

- Nested or complex ternaries reduce readability.
- Harder to debug and maintain.

**Interview-ready line:**

Ternary operators are best for simple assignments, not business logic.

---

## 9️⃣ How would you refactor deeply nested if-else blocks?

**Answer:**

Depending on the case:
1. Use `switch` (value-based routing)
2. Use guard clauses
3. Use polymorphism or strategy pattern
4. Use data-driven logic

**Senior signal:**

Deep nesting is a code smell; refactoring improves readability and maintainability.

---

## 🔟 What’s safer: `username.equals("buddy")` or `"buddy".equals(username)`?

**Answer:**
✅ `"buddy".equals(username)` is safer.

**Why:**

- Prevents `NullPointerException` if `username` is `null`.

```java
"buddy".equals(username); // safe
username.equals("buddy"); // unsafe if username is null
```

**Interview-ready line:**

Calling `equals` on a known non-null literal is a defensive coding practice.

---

## 1️⃣1️⃣ How would you support login validation for 3 allowed usernames?

**Option 1:** switch
```java
switch (username) {
    case "buddy":
    case "naresh":
    case "admin":
        validUser = true;
        break;
    default:
        validUser = false;
}
```

**Option 2 (preferred):** Set
```java
Set<String> users = Set.of("buddy", "naresh", "admin");
users.contains(username);
```

**Interview-ready line:**

A `Set` is more scalable and cleaner than `switch` when values may grow.

---

## 1️⃣2️⃣ Why is switch preferred over if-else for command routing?

**Answer:**

1. Clear mapping of commands to actions
2. Better readability
3. Easy to extend

**Example:**
```java
switch (command) {
    case "ADD": add(); break;
    case "UPDATE": update(); break;
}
```

---

## 1️⃣3️⃣ What happens if two case labels have the same value?

**Answer:**

- It causes a compile-time error.
- Case labels must be unique compile-time constants.

---

## 1️⃣4️⃣ When is fall-through actually useful?

**Answer:**

- When multiple cases should execute the same logic.
- Helps avoid code duplication.

---

## 1️⃣5️⃣ If tax slabs change tomorrow, how do you avoid editing many if-else blocks?

**Answer:**

- Move rules from code to data.
- Represent slabs using arrays, lists, or configuration.

**Example approach:**
```java
int[] limits = {250000, 500000, 1000000, Integer.MAX_VALUE};
double[] rates = {0.0, 0.05, 0.20, 0.30};
```

**Interview-ready line:**

Business rules should be data-driven, not hardcoded in conditionals.

---

## 1️⃣6️⃣ When should you avoid switch entirely?

**Answer:**

Avoid `switch` for:
1. Complex conditions
2. Rapidly changing logic
3. Behavior that belongs to objects (OOP)
4. Deeply nested decision trees

**Preferred alternatives:**

1. Polymorphism
2. Strategy pattern
3. Maps / configuration-based routing

---

✅ **Key Interview Takeaways:**

1. `switch` = value routing
2. `if-else` = condition logic
3. Prefer readability over cleverness
4. Move business rules to data
5. Defensive coding prevents runtime bugs

---
