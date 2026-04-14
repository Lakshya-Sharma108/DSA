package C_Strings;

public class String6 {
    public static void main(String[] args) {

//        Some practice questions:


//        Print each character of a string:
        printChar("Lakshaya");

    }


    static void printChar(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
