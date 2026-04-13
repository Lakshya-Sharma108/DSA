package C_Strings;

public class String3 {
    public static void main(String[] args) {

//        String Comparing:

//
        String name1 = "lakshaya";
        String name2 = "lakshaya";
        String name3 = "lakshaya";
        String name4 = "LAKSHAYA";



//        Using equals() methods: it compares actual value/literal not reference -- case sensitive
        if (name1.equals(name3)){
            System.out.println("Both strings are equal");
        }else {
            System.out.println("Strings are not equal");
        }

//        Using == operator: it only compares reference not value/literal
        if (name1 == name2){
            System.out.println("Both strings are equal");
        }else {
            System.out.println("Strings are not equal");
        }


//        Using equalIgnoreCase: it compares actual value/literal -- not case sensitive
        if (name2.equalsIgnoreCase(name4)){
            System.out.println("Both strings are equal");
        }else {
            System.out.println("Strings are not equal");
        }
    }
}
