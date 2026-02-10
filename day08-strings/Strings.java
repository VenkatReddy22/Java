import java.util.Scanner;

public class Strings{
    static boolean isPlaindrome(String palindromeString){
        int palindromeStringIndex = 0, rightIndex = palindromeString.length() -1;
        // Check while left index is less than right index.
        while(palindromeStringIndex <rightIndex){
            //compare characters at left index and right index.
            if(palindromeString.charAt(palindromeStringIndex) != palindromeString.charAt(rightIndex)){
                //return false if characters doesn't match
                return false;
            }
            //incrementing or shifting positions if first check is passed.
            palindromeStringIndex++;
            rightIndex--;
        }
        //retrun true if the given palindromeString is a palindrome.
        return true;
    }
    public static void main(String [] args){
        //Palindrome - String
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string to check whether it is a palindrome:");
        String inputString = sc.nextLine();
//using if-else
        // if(isPlaindrome(inpuString)){
        //     System.out.println(inpuString+ " is a palindrome.");
        // }else{
        //     System.out.println(inpuString+" is not a palindrome.");
        // }
//using ternary operator
    System.out.println(isPlaindrome(inputString)? inputString + " is a palindrome." : inputString+" is not a palindrome.");

    }
}
// Reverse a String.
        // Approach 1
        /*String s = "Java is Awesome";
        System.out.println(s);
        String sb = new StringBuilder(s).reverse().toString();
        System.out.println(sb);
*/
// Approach 2
        // String [] words = s.split(" ");
        // for(int i=0; i<words.length -i-1;i++){
        //     String temp = words[i];
        //     words[i] = words[words.length-1];
        //     words[words.length-1] = temp;
            
        // }
        // for(String word:words){
        //     StringBuilder str = new StringBuilder(word);
        //     str.reverse();
        //     sb.append(str).append(" ");
        // }
        // System.out.println(sb.toString().trim());
