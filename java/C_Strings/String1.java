package C_Strings;

public class String1 {
    public static void main(String[] args) {
        /*
            What is string?
            String is a collection of characters inside "double quotes".
            In java String is represented by String data type

            What is character?
            anything inside 'single quote' is a character.
            In java character is represented by char data type
        */


//        Creation of string: using string literals
        String str = "lakshaya";

//        String creation using new keyword
        String str2 = "sharma";



//        Difference b/w literal and new keyword strings:
//        Here, java uses String Constant Pool (SCP) concept -- go and learn about it


//        String with literal takes memory in SCP
        String literalStr = "Literal String";
        System.out.println(literalStr);

//        String with new keyword takes memory in heap
        String newString = "new string";
        System.out.println(newString);




//        Some useful methods in string

//        To find string length
        System.out.println("Length of string is: "+newString.length());

//        To access string characters using index
        System.out.println(newString.charAt(4));
    }
}
