package C_Strings;

public class String2 {
    public static void main(String[] args) {

//        Strings are immutable in java -- you can't modify them
        String firstName = "lakshaya";
        firstName = "lucky";
        System.out.println(firstName);  // but it changes, then how string is immutable

//        Explain:
//        When we created firstName with "lakshaya" the literal "lakshaya" saves in SCP but
//        When we modified it with "lucky" it also saves in SCP but not in the place of "lakshaya"
//        It creates another literal and the previous one remains same
    }
}
