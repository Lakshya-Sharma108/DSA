package C_Strings;

public class String5 {
    public static void main(String[] args) {

//        Some important string methods:

        // length(): Returns total number of characters in string
        String str1 = "Hello";
        System.out.println(str1.length()); // Output: 5


//      charAt(index): Returns character at specific index
        String str2 = "Java";
        System.out.println(str2.charAt(2)); // Output: v


//      substring(start): Returns substring from start index to end
        String str3 = "Programming";
        System.out.println(str3.substring(3)); // Output: gramming


//      substring(start, end): Returns substring between given indexes
        String str4 = "Programming";
        System.out.println(str4.substring(0, 4)); // Output: Prog


//      equals(): Compares content of two strings
        String a1 = "Java";
        String b1 = "Java";
        System.out.println(a1.equals(b1)); // Output: true


//      equalsIgnoreCase(): Compares strings ignoring case
        String a2 = "JAVA";
        String b2 = "java";
        System.out.println(a2.equalsIgnoreCase(b2)); // Output: true


//      toUpperCase(): Converts string to uppercase
        String str5 = "hello";
        System.out.println(str5.toUpperCase()); // Output: HELLO


//      toLowerCase(): Converts string to lowercase
        String str6 = "HELLO";
        System.out.println(str6.toLowerCase()); // Output: hello


//      trim(): Removes spaces from both ends
        String str7 = "   Java   ";
        System.out.println(str7.trim()); // Output: Java


//      contains(): Checks if substring exists
        String str8 = "Hello World";
        System.out.println(str8.contains("World")); // Output: true


//      startsWith(): Checks if string starts with given prefix
        String str9 = "Java Programming";
        System.out.println(str9.startsWith("Java")); // Output: true


//      endsWith(): Checks if string ends with given suffix
        String str10 = "file.pdf";
        System.out.println(str10.endsWith(".pdf")); // Output: true


//      replace(old, new): Replaces characters/substring
        String str11 = "banana";
        System.out.println(str11.replace("a", "o")); // Output: bonono


//      indexOf(): Returns first occurrence index
        String str12 = "banana";
        System.out.println(str12.indexOf('a')); // Output: 1


//      lastIndexOf(): Returns last occurrence index
        String str13 = "banana";
        System.out.println(str13.lastIndexOf('a')); // Output: 5


//      isEmpty(): Checks if string is empty
        String str14 = "";
        System.out.println(str14.isEmpty()); // Output: true


//      concat(): Joins two strings
        String a3 = "Hello ";
        String b3 = "World";
        System.out.println(a3.concat(b3)); // Output: Hello World


//      split(): Splits string into array based on delimiter
        String str15 = "apple,banana,mango";
        String[] arr = str15.split(",");

        for(String s : arr){
            System.out.println(s);
        }


//      compareTo(): Lexicographically compares two strings
        String a4 = "apple";
        String b4 = "banana";
        System.out.println(a4.compareTo(b4)); // Output: negative value


//      valueOf(): Converts other datatype to string
        int num = 100;
        String str16 = String.valueOf(num);
        System.out.println(str16); // Output: 100
    }
}
