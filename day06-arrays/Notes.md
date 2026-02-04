# Arrays - Complete Learning Guide for Beginners

---

## PART 1: WHAT TO READ - THEORY & CONCEPTS

### Section 1: Understanding Arrays Fundamentally

#### What is an Array?

An **array** is a collection of elements (variables) of the **same data type** stored in **contiguous memory locations** (next to each other).

**Think of it like this:** Imagine a row of mailboxes in a hallway, each numbered from 0 onwards. Each mailbox can hold one letter (element). Arrays work the same way - they're numbered containers.

```
Array: [10, 20, 30, 40, 50]
Index:  0   1   2   3   4
Memory: [mailbox0][mailbox1][mailbox2][mailbox3][mailbox4]
```

#### Key Characteristics of Arrays

| Feature | Explanation |
|---------|-------------|
| **Fixed Size** | Once created, array size cannot change. You decide size at creation. |
| **Index-based** | Each element has a position (0, 1, 2, ...). Access via index. |
| **Contiguous Memory** | All elements sit next to each other in RAM. |
| **Type Safe** | All elements must be same data type (int, String, double, etc.). |
| **Zero-indexed** | First element is at index 0, not 1. |

#### Declaration and Creation

```java
// Declaration + Creation (Java combines both)
int[] numbers = new int[5];        // Array of 5 integers
String[] names = new String[3];    // Array of 3 strings
double[] prices = new double[4];   // Array of 4 doubles

// Creating with values at once
int[] arr = {10, 20, 30, 40, 50}; // Size = 5, values given
char[] vowels = {'a', 'e', 'i', 'o', 'u'};
```

**What happens when you declare an array:**

```
int[] numbers = new int[5];

Step 1: "new int[5]" - JVM allocates 5 contiguous spaces in memory for integers
Step 2: Each integer gets default value (0 for int, null for objects, etc.)
Step 3: "numbers =" stores the reference (memory address) to this array
Step 4: You can now access any element using the reference

Result:
numbers[0] = 0  (default)
numbers[1] = 0  (default)
numbers[2] = 0  (default)
numbers[3] = 0  (default)
numbers[4] = 0  (default)
```

#### Memory Layout

```
Memory Address     Content
─────────────────────────────
0x1000            reference → 0x2000 (numbers variable)
...
0x2000 (array)    [0] = 0
0x2004            [1] = 0
0x2008            [2] = 0
0x200C            [3] = 0
0x2010            [4] = 0

Each int takes 4 bytes, so next element is 4 bytes away
```

---

### Section 2: Accessing and Modifying Arrays

#### Reading Elements

```java
int[] arr = {10, 20, 30, 40, 50};
System.out.println(arr[0]);   // Output: 10
System.out.println(arr[2]);   // Output: 30
System.out.println(arr[4]);   // Output: 50
```

#### Modifying Elements

```java
int[] arr = {10, 20, 30, 40, 50};
arr[0] = 100;                 // Change first element
arr[2] = 300;                 // Change third element
// Result: {100, 20, 300, 40, 50}
```

#### Array Length

```java
int[] arr = {10, 20, 30, 40, 50};
System.out.println(arr.length);  // Output: 5

String[] names = new String[10];
System.out.println(names.length); // Output: 10
```

**Important:** `.length` is a **property**, not a method. You don't write `.length()`

---

### Section 3: Time Complexity - Why It Matters

#### What is Time Complexity?

Time complexity tells you **how fast an operation is** based on the input size. It helps you understand if your code will work for huge datasets.

#### Array Operations and Their Complexity

| Operation | Time Complexity | Why? |
|-----------|-----------------|------|
| **Access by index** | **O(1)** | Computer can jump directly to any position instantly |
| **Search (unsorted)** | O(n) | Might need to check every element |
| **Search (sorted)** | O(log n) | Binary search, eliminate half each time |
| **Insert (middle)** | O(n) | Need to shift all elements after insertion point |
| **Delete (middle)** | O(n) | Need to shift all elements after deletion |
| **Insert at end** | O(1) | Just add to the end |

#### O(1) - Constant Time (SUPER FAST)

```java
int[] arr = {10, 20, 30, 40, 50};
int value = arr[2];  // O(1) - takes same time regardless of array size!
```

**Why O(1)?** Computer knows exactly where element at index 2 is:
- Base memory address: 0x2000
- Element size: 4 bytes
- Index 2 location: 0x2000 + (2 × 4) = 0x2008
- Jump directly there instantly!

This takes the same time whether array has 5 elements or 5 million elements.

#### O(n) - Linear Time (Gets slower with more data)

```java
// Searching for a value - might need to check every element
int[] arr = {10, 20, 30, 40, 50};
for (int i = 0; i < arr.length; i++) {
    if (arr[i] == 30) {
        System.out.println("Found at index " + i);
    }
}
```

**Time taken:** Proportional to array size
- Array of 5 elements: ~5 checks
- Array of 1000 elements: ~1000 checks
- Array of 1 million: ~1 million checks

#### O(n²) - Quadratic Time (Getting slow)

```java
// Bubble sort or comparing every element with every other element
for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr.length; j++) {
        // Do something
    }
}
```

**Time taken:**
- Array of 5: 5 × 5 = 25 operations
- Array of 1000: 1000 × 1000 = 1,000,000 operations
- Array of 1 million: would take forever!

---

### Section 4: Memory Understanding for Arrays

#### Stack vs Heap (Revisited for Arrays)

```java
int[] numbers = {10, 20, 30};

// STACK (stores reference only)
numbers → [reference to memory address 0x2000]

// HEAP (stores actual array)
0x2000: [10] [20] [30]
```

#### Why Contiguous Memory Matters

**Advantage:** Fast access
```java
// All elements next to each other
int[] arr = {10, 20, 30, 40, 50};
// Memory: [10][20][30][40][50]  (sequential, fast access)

int value = arr[3];  // Jump to position 3, get 40 instantly!
```

**Disadvantage:** Need to find continuous space
```java
// If you want to add more elements, array size is fixed
int[] arr = new int[5];  // Must decide size upfront
// Can't expand easily - need to create new array if you need more space
```

#### Default Values in Arrays

```java
int[] nums = new int[5];
// All elements: 0

boolean[] bools = new boolean[3];
// All elements: false

String[] strings = new String[2];
// All elements: null

double[] decimals = new double[4];
// All elements: 0.0
```

---

### Section 5: Traversing Arrays

#### Forward Traversal (Left to Right)

```java
int[] arr = {10, 20, 30, 40, 50};

// Method 1: Using traditional for loop
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
// Output: 10 20 30 40 50

// Method 2: Using enhanced for loop (for-each)
for (int value : arr) {
    System.out.println(value);
}
// Output: 10 20 30 40 50
```

#### Backward Traversal (Right to Left)

```java
int[] arr = {10, 20, 30, 40, 50};

for (int i = arr.length - 1; i >= 0; i--) {
    System.out.println(arr[i]);
}
// Output: 50 40 30 20 10
```

---

### Section 6: Array vs ArrayList

#### Array

```
Fixed size, faster, less memory overhead
```

```java
int[] numbers = new int[5];
numbers[0] = 10;
numbers[1] = 20;
// Size: 5 (can't change!)
// Type: primitive-friendly
// Speed: Fastest
```

**Characteristics:**
- ✅ Fixed size (defined at creation)
- ✅ Faster access and operations
- ✅ Less memory used
- ❌ Can't grow dynamically
- ❌ No built-in methods (no add, remove, etc.)

#### ArrayList

```
Dynamic size, flexible, slower than arrays
```

```java
ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(10);
numbers.add(20);
numbers.add(30);
// Size grows automatically!
// Can add/remove easily
```

**Characteristics:**
- ✅ Dynamic size (grows as needed)
- ✅ Built-in methods (add, remove, contains, etc.)
- ✅ Type-safe with generics
- ❌ Slower than arrays
- ❌ Uses more memory

#### When to Use Each

| Situation | Use |
|-----------|-----|
| Know size beforehand, need speed | **Array** |
| Size unknown, frequently add/remove | **ArrayList** |
| Working with primitives (int, double) | **Array** |
| Need many list operations | **ArrayList** |
| Writing interview solutions | **Both** (understand both!) |

#### Comparison Table

| Feature | Array | ArrayList |
|---------|-------|-----------|
| **Syntax** | `int[] arr = new int[5]` | `ArrayList<Integer> list = new ArrayList<>()` |
| **Size** | Fixed | Dynamic |
| **Access Time** | O(1) | O(1) |
| **Add/Remove** | O(n) | O(n) avg |
| **Default value** | 0/false/null | N/A (empty) |
| **Memory** | Less | More |
| **Primitives** | Yes | No (wrapper classes) |

---

## PART 2: WHAT TO PRACTICE - Implementations

### Practice 1: Find Maximum Element

**Problem:** Given an array of numbers, find the largest number.

```java
public class ArrayToolkit {
    
    /**
     * Find the maximum element in an array
     * @param arr - input array
     * @return - maximum element
     */
    public static int findMax(int[] arr) {
        // Edge case: empty array
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        
        // Start with first element
        int max = arr[0];
        
        // Compare with every other element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        return max;
    }
    
    // USAGE EXAMPLE
    public static void main(String[] args) {
        int[] arr = {10, 20, 50, 30, 40};
        System.out.println("Max: " + findMax(arr));  // Output: 50
    }
}
```

**How it works:**
```
arr = [10, 20, 50, 30, 40]

Step 1: max = arr[0] = 10
Step 2: Compare 20 > 10? Yes, max = 20
Step 3: Compare 50 > 20? Yes, max = 50
Step 4: Compare 30 > 50? No, max = 50
Step 5: Compare 40 > 50? No, max = 50
Result: 50
```

**Complexity:** O(n) - need to check every element

---

### Practice 2: Find Second Maximum

**Problem:** Find the second largest element (without sorting).

```java
public static int findSecondMax(int[] arr) {
    if (arr == null || arr.length < 2) {
        throw new IllegalArgumentException("Array must have at least 2 elements");
    }
    
    int max = Integer.MIN_VALUE;      // Largest so far
    int secondMax = Integer.MIN_VALUE; // Second largest so far
    
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > max) {
            // Shift max to secondMax, put arr[i] as new max
            secondMax = max;
            max = arr[i];
        } else if (arr[i] > secondMax && arr[i] != max) {
            // If it's less than max but greater than secondMax
            secondMax = arr[i];
        }
    }
    
    return secondMax;
}

// USAGE
int[] arr = {10, 20, 50, 30, 40};
System.out.println("Second Max: " + findSecondMax(arr));  // Output: 40
```

**How it works:**
```
arr = [10, 20, 50, 30, 40]

Step 1: max = MIN, secondMax = MIN
        Check 10: 10 > MIN? Yes, secondMax = MIN, max = 10
Step 2: Check 20: 20 > 10? Yes, secondMax = 10, max = 20
Step 3: Check 50: 50 > 20? Yes, secondMax = 20, max = 50
Step 4: Check 30: 30 > 50? No. 30 > 20? Yes, secondMax = 30
Step 5: Check 40: 40 > 50? No. 40 > 30? Yes, secondMax = 40
Result: 40
```

**Complexity:** O(n) - single pass through array

---

### Practice 3: Reverse an Array

**Problem:** Reverse the order of elements in an array.

```java
public static void reverseArray(int[] arr) {
    if (arr == null || arr.length == 0) {
        return;
    }
    
    // Two pointers approach
    int left = 0;
    int right = arr.length - 1;
    
    // Keep swapping until pointers meet
    while (left < right) {
        // Swap arr[left] and arr[right]
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        
        // Move pointers
        left++;
        right--;
    }
}

// USAGE
int[] arr = {10, 20, 30, 40, 50};
reverseArray(arr);
System.out.println(Arrays.toString(arr));  // Output: [50, 40, 30, 20, 10]
```

**Visual Explanation:**
```
Initial:      [10] [20] [30] [40] [50]
               ↑                      ↑
            left=0               right=4

After swap 1: [50] [20] [30] [40] [10]
                    ↑               ↑
                 left=1         right=3

After swap 2: [50] [40] [30] [20] [10]
                         ↑   ↑
                    left=2  right=2
                    
STOP: left and right meet at middle, array is reversed!
```

**Complexity:** O(n) - visit each element once, but only n/2 swaps

---

### Practice 4: Rotate Array

**Problem:** Rotate array elements to the right by k positions.

```
Example: [1, 2, 3, 4, 5] rotate by 2 → [4, 5, 1, 2, 3]
```

```java
public static void rotateArrayRight(int[] arr, int k) {
    if (arr == null || arr.length == 0) {
        return;
    }
    
    // Normalize k (handle k > array length)
    k = k % arr.length;
    
    // Reverse entire array
    reverse(arr, 0, arr.length - 1);
    
    // Reverse first k elements
    reverse(arr, 0, k - 1);
    
    // Reverse remaining elements
    reverse(arr, k, arr.length - 1);
}

private static void reverse(int[] arr, int start, int end) {
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}

// USAGE
int[] arr = {1, 2, 3, 4, 5};
rotateArrayRight(arr, 2);
System.out.println(Arrays.toString(arr));  // Output: [4, 5, 1, 2, 3]
```

**Step-by-step visualization:**
```
Original:  [1, 2, 3, 4, 5], k = 2

Step 1 - Reverse all:     [5, 4, 3, 2, 1]
Step 2 - Reverse first 2: [4, 5, 3, 2, 1]
Step 3 - Reverse last 3:  [4, 5, 1, 2, 3] ✓
```

**Complexity:** O(n) - three reverse passes

---

### Practice 5: Frequency Map

**Problem:** Count how many times each element appears in the array.

```java
public static Map<Integer, Integer> createFrequencyMap(int[] arr) {
    if (arr == null || arr.length == 0) {
        return new HashMap<>();
    }
    
    Map<Integer, Integer> freqMap = new HashMap<>();
    
    for (int num : arr) {
        // If key exists, increment count; otherwise put 1
        freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
    }
    
    return freqMap;
}

// USAGE
int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
Map<Integer, Integer> freq = createFrequencyMap(arr);

for (Integer key : freq.keySet()) {
    System.out.println(key + " appears " + freq.get(key) + " times");
}
// Output:
// 1 appears 1 times
// 2 appears 2 times
// 3 appears 3 times
// 4 appears 4 times
```

**How HashMap works:**
```
Iteration 1: num = 1, map = {1: 1}
Iteration 2: num = 2, map = {1: 1, 2: 1}
Iteration 3: num = 2, map = {1: 1, 2: 2}  (increment existing)
Iteration 4: num = 3, map = {1: 1, 2: 2, 3: 1}
Iteration 5: num = 3, map = {1: 1, 2: 2, 3: 2}
Iteration 6: num = 3, map = {1: 1, 2: 2, 3: 3}
Iteration 7: num = 4, map = {1: 1, 2: 2, 3: 3, 4: 1}
... and so on

Final result: {1: 1, 2: 2, 3: 3, 4: 4}
```

**Complexity:** O(n) - iterate through array once, HashMap operations are O(1) avg

---

## PART 3: INTERVIEW QUESTIONS & ANSWERS

### Easy Questions

#### Q1: What is the difference between an array and ArrayList?

**Answer for a Layman:**

"An array is like a fixed-size parking lot. When you create it with 10 spaces, you always have exactly 10 spaces - no more, no less. You can quickly access any space by its number.

An ArrayList is like a flexible parking lot that expands as more cars come. You don't need to decide size upfront - it grows automatically. But it's slightly slower than a fixed parking lot because of the expansion mechanism."

**Technical Answer:**

```
Array:
- Fixed size at creation
- O(1) access time
- Can store primitives
- No built-in methods

ArrayList:
- Dynamic size
- O(1) access time
- Wrapper classes for primitives
- Has add(), remove(), contains() methods
```

---

#### Q2: Why is accessing array elements O(1)?

**Answer for a Layman:**

"Imagine a huge apartment building where apartments are numbered 0, 1, 2, 3... If you want to visit apartment 50, you can directly calculate: 'Ground floor + 50 stairs' and go there instantly. You don't need to visit apartments 0-49 first. That's why accessing by index is O(1) - the computer can calculate the exact memory location instantly."

**Technical Answer:**

```
Array memory address calculation:
element_address = base_address + (index × element_size)

Example: int[] arr = {10, 20, 30, 40, 50}
base_address = 0x2000
element_size = 4 bytes (for int)

To access arr[3]:
address = 0x2000 + (3 × 4) = 0x200C
Direct jump to 0x200C, get value instantly!

Time is same whether array has 5 or 5,000,000 elements!
```

---

#### Q3: When would you use an array instead of ArrayList?

**Answer for a Layman:**

"Use an array when you know exactly how much data you'll have and need maximum speed. Use ArrayList when you're not sure how much data you'll need."

**Technical Answer:**

Prefer Array when:
- ✅ Size is known and fixed
- ✅ Need maximum speed
- ✅ Working with primitives
- ✅ Memory efficiency matters
- ✅ Rarely adding/removing elements

Prefer ArrayList when:
- ✅ Size is unknown
- ✅ Frequently adding/removing
- ✅ Need convenient methods
- ✅ Working with objects

---

#### Q4: What happens if you try to access arr[arr.length]?

**Answer:**

You get an **ArrayIndexOutOfBoundsException**.

```java
int[] arr = {10, 20, 30};
System.out.println(arr[3]);  // ERROR! Indices are 0, 1, 2 only
// Exception: ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
```

**Why?** Arrays are 0-indexed. Valid indices are 0 to length-1.

---

### Medium Questions

#### Q5: How would you find the maximum element in an array?

**Answer for a Layman:**

"You look at the first element and remember it as 'the largest so far'. Then you go through the rest one by one. If you find something larger, you update your memory. At the end, you've found the largest."

**Code:**

```java
public static int findMax(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    return max;
}
```

**Complexity:** O(n)

---

#### Q6: How do you reverse an array in-place?

**Answer for a Layman:**

"Use the two-pointer technique. Put one pointer at the start and one at the end. Swap them, then move both pointers toward the middle until they meet. This reverses the array without using extra space."

**Code:**

```java
public static void reverseArray(int[] arr) {
    int left = 0;
    int right = arr.length - 1;
    
    while (left < right) {
        // Swap
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        
        left++;
        right--;
    }
}
```

**Complexity:** O(n) time, O(1) space (no extra space used)

---

#### Q7: Rotate array right by k positions

**Problem:** [1,2,3,4,5] → rotate by 2 → [4,5,1,2,3]

**Answer for a Layman:**

"The trick is to think of rotation as three reverse operations:
1. Reverse the entire array
2. Reverse the first k elements
3. Reverse the remaining elements"

**Code:**

```java
public static void rotateRight(int[] arr, int k) {
    k = k % arr.length;  // Handle k > length
    
    reverse(arr, 0, arr.length - 1);      // [5,4,3,2,1]
    reverse(arr, 0, k - 1);               // [4,5,3,2,1]
    reverse(arr, k, arr.length - 1);      // [4,5,1,2,3]
}

private static void reverse(int[] arr, int start, int end) {
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}
```

**Complexity:** O(n) time, O(1) space

---

#### Q8: Find frequency of each element

**Problem:** [1, 2, 2, 3, 3, 3] → {1: 1, 2: 2, 3: 3}

**Answer for a Layman:**

"Go through each element in the array. For each element, count how many times it appears. Store these counts in a map (like a notebook where you write down 'element: count')."

**Code:**

```java
public static Map<Integer, Integer> getFrequency(int[] arr) {
    Map<Integer, Integer> map = new HashMap<>();
    
    for (int num : arr) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }
    
    return map;
}
```

**Complexity:** O(n) time, O(n) space (for the map)

---

#### Q9: Find the second maximum element

**Problem:** [10, 20, 50, 30, 40] → 40 (50 is max, 40 is second max)

**Answer for a Layman:**

"Track two values: the maximum and the second maximum. As you go through the array, update these values. If you find something larger than max, push current max to second max and update max."

**Code:**

```java
public static int findSecondMax(int[] arr) {
    if (arr.length < 2) throw new IllegalArgumentException();
    
    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;
    
    for (int num : arr) {
        if (num > max) {
            secondMax = max;
            max = num;
        } else if (num > secondMax && num != max) {
            secondMax = num;
        }
    }
    
    return secondMax;
}
```

**Complexity:** O(n) time, O(1) space

---

### Hard Questions

#### Q10: How are arrays stored in memory?

**Answer for a Layman:**

"Arrays are stored in contiguous memory - meaning all elements sit right next to each other in your computer's RAM. This is why accessing by index is so fast - the computer just does math to find the exact location."

**Technical Answer:**

```
int[] arr = {10, 20, 30, 40, 50};

Stack (stores reference):
arr → 0x2000

Heap (stores actual data):
0x2000: [10] [20] [30] [40] [50]
0x2004  0x2008 0x200C 0x2010 0x2014

Address calculation: base + (index × element_size)
arr[2] = 0x2000 + (2 × 4) = 0x2008 = 30
```

**Key point:** All elements contiguous = Fast access but fixed size

---

#### Q11: What's the difference between O(1) and O(n)?

**Answer for a Layman:**

"O(1) means the time doesn't change no matter how much data you have. Accessing arr[100] takes same time as arr[100000].

O(n) means time grows with data size. Searching 100 elements takes ~100 steps, searching 100000 takes ~100000 steps."

**Visualization:**

```
Array Access (O(1)):
arr[0], arr[1], arr[999999] - ALL same speed!

Array Search (O(n)):
[1, 2, 3] → 3 steps to check all
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10] → 10 steps to check all
[array of 1000000] → 1000000 steps to check all
```

---

#### Q12: Can you explain array traversal methods?

**Answer:**

```java
int[] arr = {10, 20, 30, 40, 50};

// Method 1: Traditional for loop (Forward)
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}

// Method 2: Enhanced for loop / For-each (Forward)
for (int value : arr) {
    System.out.println(value);
}

// Method 3: Traditional for loop (Backward)
for (int i = arr.length - 1; i >= 0; i--) {
    System.out.println(arr[i]);
}

// Method 4: While loop
int i = 0;
while (i < arr.length) {
    System.out.println(arr[i]);
    i++;
}
```

**Which to use?**
- Normal iteration → For-each (cleaner)
- Need index → Traditional for loop
- Backward iteration → Traditional for loop with i--
- Advanced iteration → While loop

---

#### Q13: What's the difference in memory between array and ArrayList?

**Answer for a Layman:**

"Arrays use less memory - just the elements you put in. ArrayList uses extra memory behind the scenes to handle growth. Like a balloon - the balloon (wrapper) takes space even if only partially filled."

**Technical Answer:**

```
int[] arr = new int[5];
Memory = 5 × 4 bytes = 20 bytes

ArrayList<Integer> list = new ArrayList<>();
Memory = overhead (24-32 bytes) + internal array capacity + elements
Initially creates internal array of capacity 10, even if empty!
```

---

## BONUS: Cheat Sheet for Quick Reference

### Array Basics
```java
// Create
int[] arr = new int[5];
int[] arr2 = {1, 2, 3, 4, 5};

// Access
arr[0] = 10;
int value = arr[0];

// Length
int len = arr.length;

// Iterate
for (int x : arr) { }
for (int i = 0; i < arr.length; i++) { }
```

### ArrayList Basics
```java
// Create
ArrayList<Integer> list = new ArrayList<>();

// Add
list.add(10);
list.add(20);

// Access
list.get(0);

// Remove
list.remove(0);

// Size
list.size();

// Iterate
for (int x : list) { }
```

### Time Complexities
```
Array access:      O(1)
Array search:      O(n)
Array insert/del:  O(n)
Array rotation:    O(n)
HashMap insert:    O(1) avg
HashMap search:    O(1) avg
HashMap delete:    O(1) avg
```

---

## Summary Table - What to Learn

| Concept | Priority | Why |
|---------|----------|-----|
| Array basics & indexing | ⭐⭐⭐ | Foundation |
| O(1) indexing access | ⭐⭐⭐ | Core concept |
| Find max/min | ⭐⭐⭐ | Most common |
| Reverse array | ⭐⭐⭐ | Interview favorite |
| Rotate array | ⭐⭐ | Interview problem |
| Frequency map | ⭐⭐ | Problem-solving |
| Array vs ArrayList | ⭐⭐⭐ | Design choice |
| Memory layout | ⭐⭐ | Understanding |
| Traversal methods | ⭐⭐⭐ | Fundamental |
