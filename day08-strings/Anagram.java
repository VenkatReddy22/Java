import java.util.Arrays;
public class Anagram{
    public static void main(String[] args){
        

// Approach:

//     Convert to char[]
//     Sort
//     Compare

    String strInput = "melon";
    String compareStr = "lemon";
    char [] str1 = strInput.toCharArray();
    char [] str2 = compareStr.toCharArray();
    Arrays.sort(str1);
Arrays.sort(str2);
//prints object memory address
// String s1 = str1.toString(), s2 = str2.toString(); 
//the below steps will convert the arrays str1 and str 2 into actual Strings , because creating new strings from arrays
// calling String constructor creates a new Object
String s1 = new String(str1);
String s2 = new String(str2);

System.out.println(str1+" "+ str2);
System.out.println(s1+" "+ s2);
    }
}
