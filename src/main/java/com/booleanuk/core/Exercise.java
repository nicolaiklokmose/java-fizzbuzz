package com.booleanuk.core;

public class Exercise {

    // Since an array can only contain values of a single type, we're providing an array of strings for you to run logic on.
    // You'll need to convert each string into a number to solve this exercise
    // For example, the tests will provide an input such as ["1", "2", "10", "15"] and will expect an output of ["1", "2", "Buzz", "Fizzbuzz"]
    // Notice the "throws NumberFormatException" on the method signature.
    // As you will need to convert a String to an Int, there is a chance an error could happen.
    // If, for example, the provided input looked like ["1", "2", "apple", "15"], we would get an error trying to convert "apple" into an integer
    // The "throws NumberFormatException" tells the computer that this method could potentially error
    // You can read more about converting a String to an Integer here: https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/lang/Integer.html#parseInt(java.lang.CharSequence,int,int,int)
    // You can also read more about Exceptions here: https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/lang/Exception.html
    public String[] fizzbuzz(String[] nums) throws NumberFormatException {
        /* TODO: Implement a function that will look through a list of String representation of numbers and
            change the values of said array based on the rules below
            Where a number is a multiple of three (3, 6, 9, etc) the number in the array should be replaced the string "Fizz.
            Where a number is a multiple of five (5, 10, etc) the number in the array should be replaced the string "Buzz".
            Where a number is a multiple of both five AND three (15, 30, etc) the number in the array should be replaced the string "Fizzbuzz".
        * */
        String[] retArr = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (((Integer.parseInt(nums[i]) % 3) == 0) &&
                 (Integer.parseInt(nums[i]) % 5) == 0) {
                retArr[i] = "Fizzbuzz";
            } else if ((Integer.parseInt(nums[i]) % 3 == 0)) {
                retArr[i] = "Fizz";
            } else if ((Integer.parseInt(nums[i]) % 5 == 0)) {
                retArr[i] = "Buzz";
            } else {
                retArr[i] = nums[i];
            }
        }
        return retArr;
    }
}
