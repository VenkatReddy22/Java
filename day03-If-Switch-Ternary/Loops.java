//Program 1

// public class Loops{
//     public static void main(String [] args){
//         int score = 190;
//         if(score <100){
//         if(score > 90){
//             System.out.println("Grade: A");
//         } else if(score > 80 && score <= 90){
//             System.out.println("Grade: B");

//         }else if(score > 70 && score <= 80){
//             System.out.println("Grade: C");

//         }else if(score > 60 && score <= 70){
//             System.out.println("Grade: D");

//         }else{
//             System.out.println("Student Failed");
//         }
//     } else{
//         System.out.println("Invalid Marks");
//     }
// }
// }

// Program 2
// Input: income
// Rules:

// ≤250000 → 0%

// 250001–500000 → 5%

// 500001–1000000 → 20%

// 1000000 → 30%
// public class Loops{
//     public static void main(String [] args){
//         int income = 1000001;
//         if(income >=0){
//             if(income  <= 250000){
//                 System.out.println("Your Tax is 0%.");
//             }else if(income >250000 && income <=500000){
//                 System.out.println("Your tax is 5%");
//             }else if(income > 500000 && income <= 1000000){
//                 System.out.println("Your Tax is 20%");
//             }else if(income >1000000){
//                 System.out.println("Your Tax is 30%");
//             }
//         }else{
//             System.out.println("Please enter a Valid Income");
//         }

//     }
// }

// Problem 2 alternate and better approach
// int income = 750000;

// int[] limits = {250000, 500000, 1000000, Integer.MAX_VALUE};
// double[] rates = {0.0, 0.05, 0.20, 0.30};

// for (int i = 0; i < limits.length; i++) {
//     if (income <= limits[i]) {
//         System.out.println("Tax rate: " + (rates[i] * 100) + "%");
//         break;
//     }
// }

// 🧩 Problem 3: Simple Menu App (switch)

// Options:

// ADD

// UPDATE

// DELETE

// EXIT

// public class Loops{
//     public static void main(String [] args){
//         String input = "Exit";
//         switch (input.toUpperCase()){
//             case "ADD":
//                 System.out.println("Adding");
//                 break;
//             case "UPDATE":
//                 System.out.println("updating");
//                 break;
//             case "DELETE":
//                 System.out.println("deleting");
//                 break;
//             case "EXIT":
//                 System.out.println("Exit");
//                 break;
//             default:
//                 System.out.println("Please give one of these  'ADD' 'UPDATE' 'DELETE' 'Exit'");
//         }
//     }
// }

// 🧩 Problem 4: Even / Odd (ternary)

// Input: number
// Output: Even or Odd



// public class Loops{
//     public static void main(String [] args){
//         long longInteger = 3225006868468L;
//         System.out.println(longInteger%2 == 0 ?"num is even":"num is odd");
//     }
// }

// 🧩 Problem 5: Login Validation

// Inputs:

// username

// password

// If both correct → success
// Else → error message
// use .equals() to avoid comparing references outside of string pool
public class Loops{
    public static void main(String [] args){;
        String username= "buddy", password="abcdef";
        if(username.equals("buddy")){
            if(password.equals("abcdef")){
                System.out.println("Success...:)");
            }else{
                System.out.println("Your Password is Incorrect...:(");
            }
        }else{
            System.out.println("Your Username is Incorrect..:(");
        }
    }
}


// 🧩 Problem 6: Day of Week (switch)

// Input: 1–7
// Output: weekday name

// public class Loops{
//     public static void main(String [] args){
//         int input = 6;
//         switch (input){
//             case 1:
//                 System.out.println("Mon");
//                 break;
//             case 2:
//                 System.out.println("Tue");
//                 break;
//             case 3:
//                 System.out.println("wed");
//                 break;
//             case 4:
//                 System.out.println("THurs");
//                 break;
//             case 5:
//                 System.out.println("Fri");
//                 break;
//             case 6:
//                 System.out.println("Sat");
//                 break;
//             case 7:
//                 System.out.println("Sun");
//                 break;
//             default:
//                 System.out.println("Enter a value between 1 to 7");
//         }
//     }
// }
