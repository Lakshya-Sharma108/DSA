package E_BitwiseOperator;

public class Practice2 {
    public static void main(String[] args) {

        // checking if a number is power of 2 or not
         /*
            power of 2 numbers:
            8  -> 0000 1000
            16 -> 0001 0000
            32 -> 0010 0000

            not power of 2 Numbers:
            10  -> 0000 1010
            18  -> 0001 0010


            Analyze:
            Every power of 2 has only single 1
            Every power of 2 has multiple  1




         */


        int num = 10;
        int count = 0;

        while(num != 0){
            if ((num & 1) != 0){
                count++;
            }
            num = num >> 1;
        }

        if (count > 1){
            System.out.println("Not power of 2");
        }else System.out.println("Power of 2");

    }
}
