Data types are divided into two groups:

    Primitive data types - includes byte, short, int, long, float, double, boolean and char
    Non-primitive data types - such as String, Arrays and Classes

Data Type 	Description
byte 	Stores whole numbers from -128 to 127
short 	Stores whole numbers from -32,768 to 32,767
int 	Stores whole numbers from -2,147,483,648 to 2,147,483,647
long 	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float 	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double 	Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
boolean 	Stores true or false values
char 	Stores a single character/letter or ASCII values

Data Type 	Default Value (for fields)
byte 	0
short 	0
int 	0
long 	0L
float 	0.0f
double 	0.0d
char 	'\u0000'
String (or any object)   	null
boolean 	false

Note:Local variables are slightly different; the compiler never assigns a default value to an uninitialized local variable. If you cannot initialize your local variable where it is declared, make sure to assign it a value before you attempt to use it. Accessing an uninitialized local variable will result in a compile-time error.


You Cannot Change the Type
Once a variable is declared with a type, it cannot change to another type later in the program,

Note: This rule makes Java safer, because the compiler will stop you if you try to mix up types by mistake.
If you really need to change between types, you must use type casting or conversion methods


primitive data types

Integer types(byte, short, int and long), flaoting point types(float and double).
The long data type should end the value with an "L
The float and double data types can store fractional numbers,should end the value with an "f" for floats and "d" for doubles.


Note: Use float or double?

The precision of a floating point value indicates how many digits the value can have after the decimal point. The precision of float is only 6-7 decimal digits, while double variables have a precision of about 16 digits.

Therefore it is safer to use double for most calculations.

The char data type is used to store a single character. The character must be surrounded by single quotes, like 'A' or 'c':

The String data type is used to store a sequence of characters (text). String values must be surrounded by double quotes:

The String type is so much used and integrated in Java, that some call it "the special ninth type".

A String in Java is actually a non-primitive data type, because it refers to an object. The String object has methods that are used to perform certain operations on strings

escape sequence chars:
The Java programming language also supports a few special escape sequences for char and String literals: \b (backspace), \t (tab), \n (line feed), \f (form feed), \r (carriage return), \" (double quote), \' (single quote), and \\ (backslash)

Heading:Java Type Casting

Type casting means converting one data type into another. For example, turning an int into a double.

In Java, there are two main types of casting:

    Widening Casting (automatic) - converting a smaller type to a larger type size - no chance of data loss
    byte -> short -> char -> int -> long -> float -> double

    Narrowing Casting (manual) - converting a larger type to a smaller type size - chances of data loss - use () is compulsury
    double -> float -> long -> int -> char -> short -> byte 

    Arithmetic Operators

Arithmetic operators are used to perform common mathematical operations.
Operator 	Name 	Description 	Example 	
+ 	Addition 	Adds together two values 	x + y 	
- 	Subtraction 	Subtracts one value from another 	x - y 	
* 	Multiplication 	Multiplies two values 	x * y 	
/ 	Division 	Divides one value by another 	x / y 	
% 	Modulus 	Returns the division remainder 	x % y 	
++ 	Increment 	Increases the value of a variable by 1 	++x 	
-- 	Decrement 	Decreases the value of a variable by 1 	--x

Assignment operators:
Operator 	Example 	Same As 	
= 	x = 5 	x = 5 	
+= 	x += 3 	x = x + 3 	
-= 	x -= 3 	x = x - 3 	
*= 	x *= 3 	x = x * 3 	
/= 	x /= 3 	x = x / 3 	
%= 	x %= 3 	x = x % 3 	
&= 	x &= 3 	x = x & 3 	
|= 	x |= 3 	x = x | 3 	
^= 	x ^= 3 	x = x ^ 3 	
>>= 	x >>= 3 	x = x >> 3 - right shift
<<= 	x <<= 3 	x = x << 3 -  left shift

comparison operators:
Operator 	Name 	Example 
== 	Equal to 	x == y 	
!= 	Not equal 	x != y 	
> 	Greater than 	x > y 	
< 	Less than 	x < y 	
>= 	Greater than or equal to 	x >= y 	
<= 	Less than or equal to 	x <= y

Logical Operators
&&  	Logical and 	Returns true if both statements are true 		
||  	Logical or 	    Returns true if one of the statements is true 	 	
! 	    Logical not 	Reverse the result, returns false if the result is true

Order of Operations

Here are some common operators, from highest to lowest priority:

    () - Parentheses
    *, /, % - Multiplication, Division, Modulus
    +, - - Addition, Subtraction
    >, <, >=, <= - Comparison
    ==, != - Equality
    && - Logical AND
    || - Logical OR
    = - Assignment
