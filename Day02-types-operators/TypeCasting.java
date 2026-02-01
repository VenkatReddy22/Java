//program 1

/*public class TypeCasting {
    
public static void main(String args[]){

byte a = 10;
int b= 400;
byte c = (byte)(a+b);
byte d = (byte)(1+b);

System.out.println("type: "+c);
System.out.println(d);

}
}
*/


/*Program 2 — Overflow

Goal: show overflow for int.

int a = Integer.MAX_VALUE;

System.out.println(a + 1);

Expected learning: overflow wraps silently (no error).
*/

// public class TypeCasting{

//     public static void main(String args[]){
//         int a = Integer.MAX_VALUE;
//         a = (long)(a+1);
//         System.out.println(a);
//     }
// }

// Program 3 — char ↔ int

// Goal: show char is numeric.

// char c = 'A';

// print (int)c and c + 1

// Expected learning: Unicode code points.

// public class TypeCasting{
//     public static void main(String [] args){
//         char sampleChar = 'a';
//         int b=sampleChar+1;
//         System.out.println(sampleChar + " "+b);
//     }
// }

// Program 4 — == vs .equals() (preview)

// Goal: show reference vs value equality.

// Compare primitives with == (fine)

// Compare Strings using == and .equals()

// Expected learning: == checks reference for objects, .equals() checks content (for String).
// public class TypeCasting{
//     public static void main(String [] args){
//         String a = new String("25");

//         String b =new String("25");
//         String c= "22";
        

//         System.out.println(a==b);
//         System.out.print(a.equals(b));
//     }
// }


// Program 5 — Default values (concept clarity)

// Goal: understand default values exist only for fields, not local variables.

// Create a class with fields (int, boolean, double, String)

// Print them

// Also attempt local variable without initialization (should fail compilation)

// Expected learning: compile-time rules.

// public class Test {
//     int a;
//     boolean b;
//     double c;
//     String s;

//     public static void main(String[] args) {
//         Test t = new Test();
//         System.out.println(t.a + " " + t.b + " " + t.c + " " + t.s);
//     }
// }

// Program 6 — Operator precedence

// Goal: show how precedence changes results.

// Example: int x = 10 + 2 * 5;

// Example: (10 + 2) * 5;

// Expected learning: order of operations + parentheses.

