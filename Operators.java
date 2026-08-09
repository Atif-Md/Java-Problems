class Operators{
    public static void main(String[] args) {

        // Arithmetic Operators(unary/binary/ternary)
        // Unary Operators: ++, --
        // Binary Operators: +, -, *, /, %
        // ternary Operator: ? :

        // Binary Operators: +, -, *, /, %
        int a = 10;
        int b = 20;
        System.out.println("Addition: "+(a+b));
        System.out.println("Subtraction: "+(a-b));
        System.out.println("Multiplication: "+(a*b));
        System.out.println("Division: "+(a/b));
        System.out.println("Modulus: "+(a%b));

        // Unary Operators: ++, --
        int c = a++; //Post Increment
        int d = ++a; //Pre Increment
        System.out.println("Post Increment: "+c);
        System.out.println("Pre Increment: "+d);

        // ternary Operator: ? :
        int e = (a>b) ? a : b;
        System.out.println("Largest between a & b is: "+e);

        // Relational Operators: ==, !=, >, <, >=, <=
        // Relational Operators are used to compare two values and return a boolean result.
        System.out.println("a == b: "+(a==b));


        // Logical Operators: &&, ||, !
        // Logical Operators are used to combine multiple boolean expressions and return a boolean result.
        boolean f = (a > b) && (c < d);
        System.out.println("Logical AND: "+f);


        // Assignment Operators: =, +=, -=, *=, /=, %=
        // Assignment Operators are used to assign values to variables.
        int g = 10;
        g += 5; // g = g + 5
        System.out.println("Assignment Operator: "+g);


        // Bitwise Operators: &, |, ^, ~, <<, >>
        // Bitwise Operators are used to perform bit-level operations on integer values.


        // operator precedence and associativity
        // Operator Precedence determines the order in which operators are evaluated in an expression.
        // Associativity determines the order in which operators of the same precedence are evaluated.
        // Table for Operator Precedence and Associativity:
        //  S.No.            Operator	                Precedence	               Associativity
        //   1.            Postfix Incre & Decr         ++, --	                   Left to Right
        //   2.         Prefix Incre & Decr & Unary    ++,--, +, -, ~, !	       Right to Left
        //   3.         Multiplicative Operators        *, /, %	                   Left to Right
        //   4.         Additive Operators                +, -	                   Left to Right
        //   5.         Shift Operators                 <<, >>, >>>	               Left to Right
        //   6.         Relational Operators        <, <=, >, >=, instanceof	   Left to Right
        //   7.         Equality Operators               ==, !=	                   Left to Right
        //   8.         Bitwise AND Operator              &	                   Left to Right
        //   9.        Bitwise XOR Operator              ^	                   Left to Right
        // 10.        Bitwise OR Operator               |	                   Left to Right
        // 11.        Logical AND Operator               &&	                   Left to Right
        //  12.        Logical OR Operator                ||	                   Left to Right
        //  13.        Ternary Operator                    ? :	                   Right to Left
        //  14.        Assignment Operators             =, +=, -=, *=, /=, %=	       Right to Left


    }
}