package com.company;

public class ArraysHomeAssignment {

    public static void main(String[] args) {

//Task
          // Write a Java program to find maximum product of two integers in a given array of integers
          // Example:
//        Input :
//        nums = { 2, 3, 5, 7, -7, 5, 8, -5 }
//        Output:
//        Pair is (7, 8, Maximum Product: 56

        // Option 1
        /*int[] numbers = {2, 3, 5, 7, -7, 5, 8, -5};
        int maxNumber1 = numbers[0];
        int maxNumber2 = numbers[1];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (maxNumber1 * maxNumber2 < numbers[i] * numbers[j]) {
                    maxNumber1 = numbers[i];
                    maxNumber2 = numbers[j];
                }
                else {
                    continue;
                }
            }
        }
        System.out.println("Pair is " + maxNumber1 + ", " + maxNumber2 + ", Maximum Product: " + maxNumber1*maxNumber2);*/

        // Option 2 (only works for this array, where maximum product of positive numbers is highest)
        /*int[] numbers = { 2, 3, 5, 7, -7, 5, 8, -5 };
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
        System.out.println("The product of the highest two multiplyng numbers is: " + (numbers[numbers.length - 1] *
        numbers[numbers.length - 2]));*/



//Task
          // Write a Java program to find minimum subarray sum of specified size in a given array of integers
//        Example:
//        Input :
//        nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9,10}
//        Output:
//        Sub-array size: 4
//        Sub-array from 0 to 3 and sum is: 10


        /*Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a list of numbers
        System.out.print("How many numbers do you want to enter?: ");
        int[] numbers = new int[scanner.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }

        // sort the array
        Arrays.sort(numbers);

        // prompt the user to enter the minimum size of the array to add.
        System.out.print("Enter the minimum size to add: ");
        int minSize = scanner.nextInt();

        int sumMinSize = 0;

        // sum the minimum size of the array
        for (int i = 0; i < minSize; i++) {
            sumMinSize += numbers[i];
        }

        System.out.println("The min size is "  + sumMinSize);*/




    }

}




