package E_BitwiseOperator;

public class BitwiseOp {
    public static void main(String[] args) {
        /*
        Bitwise Operator:
        Bitwise operator works on bit level

        bit -> binary -> 0's and 1's

        Integer = 4 bytes
        1 byte = 8 bits


        Example: <- how it stored in memory
        int num1 = 5;
        int num2 = 6;

        binary of 5 -> 101
        binary of 6 -> 110

        num1 = 00000000 00000000 00000000 00000101
        num2 = 00000000 00000000 00000000 00000110
               ^                                 ^
        Most significant bit            Most significant bit


        if:
        Most significant bit is = 0  then the number is +ve
        Most significant bit is = 1  then the number is -ve

        to check the exact value of a -ve number, we do 2's compliment
        Example:
        5 =   00000000 00000000 00000000 00000101
        ~5 =  11111111 11111111 11111111 11111010   -> here the firs most bit is 1 so the number is -ve

        1's compliment:
        5 =   00000000 00000000 00000000 00000101

        2's compliment:
        5 =   00000000 00000000 00000000 00000101
                                               +1
        5 =   00000000 00000000 00000000 00000110

        ~5 = -6


        <> Because Bitwise Operator operates on bit level, it makes them fast


        Operator    Name
        &           AND
        |           OR
        ^           XOR
        ~           NOT
        <<          LEFT SHIFT
        >>          RIGHT SHIFT
        >>>         UNSIGNED RIGHT SHIFT


        & (AND): if both operands true (1), then only output will be true (1) otherwise false
        | (OR): if any one of the operand is true (1), then output will be true (1) otherwise false
        ^ (XOR): if both operands are same (1, 1 or 0, 0), then output will be false otherwise ture
        ~ (NOT): if operand is true (1) then output will be false (0), if false (0) then true (1)

        << (Left Shift): it shifts the all bits by the number of times specified or number x 2(power i)
        e.g.  5 << 1
              5 = 00000000 00000000 00000000 00000101

        After left shift:
        5 = 0 00000000 00000000 00000000 0000101 0
            ^ -> this bit lost                   ^ -> this space filled with 0

        5 << 1 = 10


    */


        System.out.println("AND of 5 and 6: "+(101 & 110));
        System.out.println("OR of 5 and 6: "+(101 | 110));
        System.out.println("XOR of 5 and 6: "+(101 ^ 110));

        System.out.println(~5);

        System.out.println(5 << 1);

    }
}
