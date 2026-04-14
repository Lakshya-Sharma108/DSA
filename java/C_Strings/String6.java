package C_Strings;

import java.util.Arrays;

public class String6 {
    public static void main(String[] args) {

//        Some practice questions:


        printChar("Lakshaya");
        findLength("lucky");
        countVowels("AEIou");
        reverseString("sharma");
        palindromeString("lal");

    }


//    Print each character of a string:
    static void printChar(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }


//    Finding length with method
    static void findLength(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
        }
        System.out.println("The length is: "+count);
    }


//    Count vowels in string
    static void countVowels(String str){
        char[] arr = str.toLowerCase().toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u'){
                count++;
            }
        }
        System.out.println("The count of vowels is: "+count);
    }


//    Reverse string
    static  void  reverseString(String str){
        String reverse = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
    }


//    Palindrome string
    static  void  palindromeString(String str){
        String reverse = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);

        if (str.equalsIgnoreCase(reverse)){
            System.out.println("String is palindrome");
        }else {
            System.out.println("String is not palindrome");
        }
    }
}
