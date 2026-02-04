import java.util.*;

/**
 * ArrayToolkit - Collection of array operations
 * 
 * This class demonstrates fundamental array operations with proper implementations,
 * explanations, and usage examples.
 */
public class ArrayToolkit {
    
    // ==================== OPERATION 1: FIND MAXIMUM ====================
    /**
     * Find the maximum element in an array
     * 
     * @param arr - input integer array
     * @return - the maximum element
     * @throws IllegalArgumentException if array is null or empty
     * 
     * Time Complexity: O(n) - need to check every element
     * Space Complexity: O(1) - only use one variable to track max
     */
    public static int findMax(int[] arr) {
        // Edge case handling
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        // Initialize max with first element
        int max = arr[0];
        
        // Iterate through remaining elements
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        return max;
    }
    
    
    // ==================== OPERATION 2: FIND SECOND MAXIMUM ====================
    /**
     * Find the second maximum element in an array
     * 
     * @param arr - input integer array
     * @return - the second maximum element
     * @throws IllegalArgumentException if array has less than 2 elements
     * 
     * Time Complexity: O(n) - single pass through array
     * Space Complexity: O(1) - only use two variables
     * 
     * Key insight: Track both max and secondMax simultaneously
     */
    public static int findSecondMax(int[] arr) {
        // Edge case handling
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least 2 elements");
        }
        
        // Initialize with minimum possible values
        int max = Integer.MIN_VALUE;      // Largest element so far
        int secondMax = Integer.MIN_VALUE; // Second largest element so far
        
        // Single pass through array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                // New maximum found: push current max to secondMax
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                // Update secondMax if current element is greater and not equal to max
                secondMax = arr[i];
            }
        }
        
        return secondMax;
    }
    
    
    // ==================== OPERATION 3: REVERSE ARRAY ====================
    /**
     * Reverse an array in-place using two-pointer technique
     * 
     * @param arr - input integer array (modified in-place)
     * 
     * Time Complexity: O(n) - visit each element once (n/2 swaps)
     * Space Complexity: O(1) - only use two pointer variables, no extra array
     * 
     * Technique: Two pointers moving toward center, swapping elements
     */
    public static void reverseArray(int[] arr) {
        // Edge case handling
        if (arr == null || arr.length == 0) {
            return;
        }
        
        // Two pointer approach
        int left = 0;               // Start from beginning
        int right = arr.length - 1; // Start from end
        
        // Keep swapping until pointers meet
        while (left < right) {
            // Swap arr[left] and arr[right]
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            // Move pointers toward center
            left++;
            right--;
        }
    }
    
    
    // ==================== OPERATION 4: ROTATE ARRAY ====================
    /**
     * Rotate array to the right by k positions
     * 
     * Example: [1, 2, 3, 4, 5] rotate by 2 → [4, 5, 1, 2, 3]
     * 
     * @param arr - input integer array (modified in-place)
     * @param k - number of positions to rotate right
     * 
     * Time Complexity: O(n) - three reverse passes through array
     * Space Complexity: O(1) - in-place operation
     * 
     * Algorithm:
     * 1. Reverse entire array
     * 2. Reverse first k elements
     * 3. Reverse remaining elements
     */
    public static void rotateArrayRight(int[] arr, int k) {
        // Edge case handling
        if (arr == null || arr.length == 0) {
            return;
        }
        
        // Normalize k: handle k > array length
        // Example: array length = 5, k = 7 → k = 7 % 5 = 2
        k = k % arr.length;
        
        // If k is 0, no rotation needed
        if (k == 0) {
            return;
        }
        
        // Step 1: Reverse entire array
        // [1, 2, 3, 4, 5] → [5, 4, 3, 2, 1]
        reverse(arr, 0, arr.length - 1);
        
        // Step 2: Reverse first k elements
        // [5, 4, 3, 2, 1] → [4, 5, 3, 2, 1]
        reverse(arr, 0, k - 1);
        
        // Step 3: Reverse remaining elements
        // [4, 5, 3, 2, 1] → [4, 5, 1, 2, 3]
        reverse(arr, k, arr.length - 1);
    }
    
    /**
     * Helper method: Reverse array from start to end indices
     * 
     * @param arr - array to reverse
     * @param start - starting index (inclusive)
     * @param end - ending index (inclusive)
     */
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            // Swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            // Move pointers
            start++;
            end--;
        }
    }
    
    
    // ==================== OPERATION 5: FREQUENCY MAP ====================
    /**
     * Count frequency of each element in array using HashMap
     * 
     * @param arr - input integer array
     * @return - Map with element as key and count as value
     * 
     * Time Complexity: O(n) - iterate through array once
     * Space Complexity: O(n) - HashMap can store up to n unique elements
     * 
     * HashMap operations (average case):
     * - put(): O(1)
     * - get(): O(1)
     * - getOrDefault(): O(1)
     */
    public static Map<Integer, Integer> createFrequencyMap(int[] arr) {
        // Edge case handling
        if (arr == null || arr.length == 0) {
            return new HashMap<>();
        }
        
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        // Iterate through each element
        for (int num : arr) {
            // getOrDefault(key, 0) returns value if key exists, else 0
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        return freqMap;
    }
    
    
    // ==================== HELPER METHOD: PRINT ARRAY ====================
    /**
     * Print array contents in readable format
     * 
     * @param arr - array to print
     * @param name - name/label for array
     */
    public static void printArray(int[] arr, String name) {
        System.out.print(name + ": ");
        System.out.println(Arrays.toString(arr));
    }
    
    
    // ==================== HELPER METHOD: PRINT FREQUENCY MAP ====================
    /**
     * Print frequency map in readable format
     * 
     * @param freqMap - map to print
     */
    public static void printFrequencyMap(Map<Integer, Integer> freqMap) {
        System.out.println("Frequency Map:");
        for (Integer key : freqMap.keySet()) {
            System.out.println("  " + key + " → appears " + freqMap.get(key) + " times");
        }
    }
    
    
    // ==================== DEMONSTRATION & TESTING ====================
    public static void main(String[] args) {
        System.out.println("========== ARRAY TOOLKIT DEMONSTRATIONS ==========\n");
        
        // ===== Operation 1: Find Maximum =====
        System.out.println("--- OPERATION 1: FIND MAXIMUM ---");
        int[] arr1 = {10, 20, 50, 30, 40};
        printArray(arr1, "Array");
        System.out.println("Maximum: " + findMax(arr1));
        System.out.println("Expected: 50\n");
        
        // ===== Operation 2: Find Second Maximum =====
        System.out.println("--- OPERATION 2: FIND SECOND MAXIMUM ---");
        int[] arr2 = {10, 20, 50, 30, 40};
        printArray(arr2, "Array");
        System.out.println("Second Maximum: " + findSecondMax(arr2));
        System.out.println("Expected: 40\n");
        
        // ===== Operation 3: Reverse Array =====
        System.out.println("--- OPERATION 3: REVERSE ARRAY ---");
        int[] arr3 = {10, 20, 30, 40, 50};
        printArray(arr3, "Original");
        reverseArray(arr3);
        printArray(arr3, "Reversed");
        System.out.println("Expected: [50, 40, 30, 20, 10]\n");
        
        // ===== Operation 4: Rotate Array =====
        System.out.println("--- OPERATION 4: ROTATE ARRAY RIGHT BY 2 ---");
        int[] arr4 = {1, 2, 3, 4, 5};
        printArray(arr4, "Original");
        rotateArrayRight(arr4, 2);
        printArray(arr4, "After rotation");
        System.out.println("Expected: [4, 5, 1, 2, 3]\n");
        
        // ===== Operation 5: Frequency Map =====
        System.out.println("--- OPERATION 5: FREQUENCY MAP ---");
        int[] arr5 = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        printArray(arr5, "Array");
        Map<Integer, Integer> freqMap = createFrequencyMap(arr5);
        printFrequencyMap(freqMap);
        System.out.println("Expected: 1→1, 2→2, 3→3, 4→4\n");
        
        // ===== Additional Test Cases =====
        System.out.println("========== ADDITIONAL TEST CASES ==========\n");
        
        // Test with duplicate maximum
        System.out.println("--- Test: Array with duplicates ---");
        int[] arr6 = {50, 20, 50, 30, 40};
        printArray(arr6, "Array");
        System.out.println("Maximum: " + findMax(arr6));
        System.out.println("Second Maximum: " + findSecondMax(arr6));
        System.out.println();
        
        // Test rotation with k > length
        System.out.println("--- Test: Rotate with k > length ---");
        int[] arr7 = {1, 2, 3, 4, 5};
        printArray(arr7, "Original (rotate by 7)");
        rotateArrayRight(arr7, 7);  // 7 % 5 = 2, same as rotating by 2
        printArray(arr7, "Rotated");
        System.out.println();
        
        // Test with negative numbers
        System.out.println("--- Test: Array with negative numbers ---");
        int[] arr8 = {-10, 20, -30, 40, -50};
        printArray(arr8, "Array");
        System.out.println("Maximum: " + findMax(arr8));
        System.out.println("Second Maximum: " + findSecondMax(arr8));
        System.out.println();
        
        // Test frequency with single element
        System.out.println("--- Test: Single element array ---");
        int[] arr9 = {5};
        printArray(arr9, "Array");
        Map<Integer, Integer> freq2 = createFrequencyMap(arr9);
        printFrequencyMap(freq2);
    }
}