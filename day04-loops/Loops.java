// Right Triangle
// *
// **
// ***
// ****

// public class Loops{
//     public static void main(String [] args){
//         for(int i = 1; i<=4;i++){
//             for(int j=1;j<=i;j++){
//             System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// 2️⃣ Inverted Triangle
// ****
// ***
// **
// *
// public class Loops{
//     public static void main(String [] args){
//         for(int i=4;i>=1;i--){
//             for(int j=i;j>0;j--){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// 3️⃣ Number Pyramid
// 1
// 12
// 123
// 1234
// public class Loops{
//     public static void main(String [] args){
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }

//     }
// }
// 4️⃣ Star Pyramid
//    *
//   ***
//  *****

// public class Loops{
//     public static void main(String [] args){
//         int rows=3;
//         for(int i=1;i<=rows;i++){
//             for(int j=i;j<rows;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=(2*i-1);k++ ){
//                 System.out.print("*");

//             }   System.out.println();         
//         }
//     }
// }

// 🔹 Computation Problems (4)
// 5️⃣ Sum of first N numbers
// public class Loops{
//     public static void main(String [] args){
//         int n=993478;
//         int sum=0;
//         for(int i=1;i<=n;i++){
//             sum+=i;
//         }
//         System.out.println("Total sum upto "+n+": "+sum);
//     }
// }
// 6️⃣ Count digits in a number
// public class Loops{
//     public static void main(String [] args){
//         int num = 0;        int n=0;
//         while(num>0){
//             num/=10;
//             n++;
//         }
//         System.out.println(n);
//     }
// }
// public class Loops {
//     public static void main(String[] args) {
//         int num = 0;
//         int count = 0;
// //checks for when a number/ input is zero, avoids printing 0 numbers.
//         if (num == 0) {
//             count = 1;
//         } else {
//             while (num > 0) {
//                 num /= 10;
//                 count++;
//             }
//         }

//         System.out.println(count);
//     }
// }

// 7️⃣ Reverse a number
// public class Loops{
//     public static void main(String [] args){
//         int num = 8964574;
//         int reversed=0;
//         if(num==0){
//             System.out.println(reversed);
//         }
//         while(num>0 || num<0){
//             int m = 0;
//             m = num%10;
//             reversed = reversed*10 +m; 
//             num /= 10;
//             // System.out.println(m);
//         }
//         System.out.println(reversed);
//     }
// }
// 8️⃣ Check palindrome number
// public class Loops{
//     public static void main(String [] args){
//         int input = 132;
//         int palindrome = input;

//         if(input >= -9 && input <= 9){
//             System.out.println(input+" is palindrome..:)");
//         }else{
//             int palindromeReversed=0;
//             while(input>0 || input <0){
//                 int mod=0;
//                 mod=input%10;
//                 palindromeReversed = palindromeReversed*10+mod;
//                 input /=10;
//             }
// System.out.println(palindromeReversed+" input: "+palindrome);
//             if(palindrome == palindromeReversed){
//                 System.out.println(palindromeReversed+" is palindrome..:)");

//             }else{
//                 System.out.println(palindrome+" is not a palindrome..:(");

//             }
//         }
//     }
// }
// 🔹 Logical Problems (2)
// 9️⃣ Prime number check
// public class Loops {
//     public static void main(String[] args) {
//         int input = 997;
//         if (input < 2) {
//             System.out.println(input + " is Not  prime..:(");

//         } else if (input == 2) {
//             System.out.println(input+" is a Prime Number");

//         }else{
//             boolean isPrime = true;
//             for(int i=2; i*i<=input;i++){
//                 if(input%i == 0){
//                     isPrime = false;
//                     break;
//                 }
//             }
//             if(isPrime){
//                 System.out.println(input+ " is Prime");
//             }else{
//                 System.out.println(input+ " is Not a Prime Number");
//             }

//         }
//     }

// }
// 🔟 Print all primes till N
// public class Loops{
// public static void main(String [] args){
//     int input = 11;
//     for(int i=2;i<=input;i++){
//         boolean isPrime = true;
//         for(int j=2;j*j<i;j++){
//             if(i%j == 0){
//                 isPrime=false;
//                 break;
//             }
//         }
//         if(isPrime){
//             System.out.print(i+",");
//         }
//     }
// }
// }
