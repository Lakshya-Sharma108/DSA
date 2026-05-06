package E_BitwiseOperator;

public class Practice4 {
    public static void main(String[] args) {

        // swap 2 numbers using XOR

        // What we need to do:
        // step 1: a = a ^ b
        // step 2: b = a ^ b
        // step 3: a = a ^ b

        // that's it -- values are swapped


        int a = 5;
        int b = 6;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("Value of a: "+a);
        System.out.println("Value of b: "+b);
    }
}
