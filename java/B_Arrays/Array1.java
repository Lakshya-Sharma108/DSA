package B_Arrays;

public class Array1 {
    public static void main(String[] args) {
        /*
            What is an array?
            - An array is a data structure that can hold a fixed number of values of the same type.
            - It is a collection of variables that are accessed with an index number.
            - The index of an array starts from 0, which means the first element is at index 0, the second element is at index 1, and so on.
            - Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.


            Arrays works on continuous memory locations, which means that all the elements of an array are stored in adjacent memory locations. This allows for efficient access to the elements of the array using the index.

        */


        // Array Declaration   -> without size and value
        int[] arr;   // int type array
        char[] arr2;   // char type array


        // Allocation
        arr = new int[5];   // allocated the memory of 5 int
        arr2 = new char[3];   // allocated the memory of 3 char


        // Array Initialization   -> with size and value
        int arr4[] = {10, 15, 30, 50};




//        Accessing the value of array using index
//            index -> 0   1   2   3   4
        int[] array = {11, 12, 13, 14, 15};

//        System.out.println("value of 0 index "+array[0]);
//        System.out.println("value of 2 index "+array[2]);


        // Accessing values through loop
        for (int index = 0; index < array.length-1; index++) {
            System.out.println(index);
        }


    }
}
