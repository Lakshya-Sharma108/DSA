package E_BitwiseOperator;

public class Practice1 {
    public static void main(String[] args) {

        // checking if a number is even or odd using bitwise op
         /*
            Even numbers:
            2  -> 0000 0010
            4  -> 0000 0100
            8  -> 0000 1000
            10 -> 0000 1010

            Odd Numbers:
            1  -> 0000 0001
            3  -> 0000 0011
            5  -> 0000 0101
            7  -> 0000 0111


            Analyze:
            Every even number end with 0
            Every odd number end with  1

            so can we do:
            (number & 1 == 0){
                Even
            } Odd

         */


        int num = 7;
        if ((num & 1) == 0){
            System.out.println("Even Number");
        } else System.out.println("Odd Number");

    }
}
