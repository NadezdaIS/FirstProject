package com.company;

import java.util.Arrays;

public class SortingAlgos {

    public static void main(String[] args) {
        // Computational complexity

        // In computer science, the time complexity is the computational complexity
        // that describes the amount of computer time it takes to run an algorithm.
        // the time complexity is commonly expressed using big O notation,
        // where n is the size in units of bits needed to represent the input:

        // O(1) - finding the median value in a sorted array of numbers;

        // O(log n) - binary search (a searching algorithm for finding an element's position in a sorted array.
        // In this approach, the element is always searched in the middle of a portion of an array.
        // Binary search can be implemented only on a sorted list of items);

        // O(n) - finding the smallest or largest item in an unsorted array,
        // Kadane's algorithm (able to find the maximum sum of a contiguous subarray in an array),
        // linear search (sequentially checks each element of the list until
        // a match is found or the whole list has been searched);

        // O(n log n) - merge search;

        // O(n^2) - bubble sort, insertion sort;

        // O(n!) - solving the traveling salesman problem (asks the following question:
        // "Given a list of cities and the distances between each pair of cities,
        // what is the shortest possible route that visits each city
        // exactly once and returns to the origin city?")


        // Sorting algorithms

        int[] numbers = {4, 2, 8, 5, 3, 9};

        // Bubble sort -> sorts numbers by comparing numbers adjacent to it.

//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < numbers.length - 1 - i; j++) {
//                if (numbers[j] > numbers[j + 1]) { // compares to the next number
//                    // Create a temporary variable to hold the current value
//                    // at index j
//                    int temp = numbers[j];
//
//                    // Swap the numbers with each other
//                    numbers[j] = numbers[j + 1];
//                    numbers[j + 1] = temp;
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(numbers));

//       Time complexity of the bubble sort is: O(n^2);


        // Insertion sort
        // This algorithm sorts numbers by comparing the values at the indexes with the previous elements.
        // We place the value at the index where there are no lesser values than that element.

//        for (int i = 1; i < numbers.length; i++) {
//            int valueToSort = numbers[i];
//            int j;
//            // The loop below is to store the numbers at the point
//            // where there are no longer less numbers than a specific value (j > 0 && numbers[j - 1] > valueToSort)
//            for(j = i; j > 0 && numbers[j - 1] > valueToSort; j--) {
//                numbers[j] = numbers[j - 1];
//            }
//
//            numbers[j] = valueToSort;
//        }
//        System.out.println(Arrays.toString(numbers));

        // Time complexity for this is: O(n^2)


        // Selection sort
        // Find the minimum element
        // Swap that minimum element with the current element
        // Repeat the whole process until the array is fully sorted.

//        for (int i = 0; i < numbers.length; i++) {
//            int index = i; // current index of the number
//            for (int j = i + 1; j < numbers.length; j++) {
//                if (numbers[j] < numbers[index]) {
//                    index = j; // swap if number at position j less than the number at position index
//                }
//            }
//            int smallerNumber = numbers[index];
//            numbers[index] = numbers[i];
//            numbers[i] = smallerNumber;
//        }
//
//        System.out.println(Arrays.toString(numbers));

        // Time complexity for this is: O(n^2)

        int[] values = {3, 8, 3, 5, 9};
        mergeSort(0, values.length - 1, values);
        System.out.println(Arrays.toString(values));
    }


    public static void mergeSort(int start, int end, int[] numbers) {
        // Merge Sort
        // Divide the array into subarrays of about half size in each iteration/repetition
        // until each sub array has only one element.
        // Merge each subarray repeatedly to create sorted arrays. This is going to repeat itself
        // until we have only one sorted array.

        // Recursive method
        int mid = (start + end) / 2;

        if (start < end) {
            // sort the left half
            mergeSort(start, mid, numbers);

            // sort the right half
            mergeSort(mid + 1, end, numbers);

            // merge
            merge(start, mid, end, numbers);
        }

    }

    public static void merge(int start, int mid, int end, int[] numbers) {
        // initialize a temp array and index
        int[] tempArray = new int[numbers.length];
        int tmpArrayIndex = start; // temporary index

        // initialize the start index and mid index to be used as counters
        int startIndex = start;
        int midIndex = mid + 1;

        // iterate until the smaller array reaches the end
        while (startIndex <= mid && midIndex <= end) {
            if (numbers[startIndex] < numbers[midIndex]) {
                // The ++ increases the value of the index by one
                // and is being used to keep the while loop from giving us an
                // infinite loop
                tempArray[tmpArrayIndex++] = numbers[startIndex++];
            } else {
                tempArray[tmpArrayIndex++] = numbers[midIndex++];
            }
        }

        // copy the remaining elements into the array
        while(startIndex <= mid) {
            tempArray[tmpArrayIndex++] = numbers[startIndex++];
        }

        while(midIndex <= end) {
            tempArray[tmpArrayIndex++] = numbers[midIndex++];
        }

        // copy the value of our temporary array into the actual array after we are
        // done sorting it.
        if (end + 1 - start >= 0) {
            // java method that can be used to copy an array
            System.arraycopy(tempArray, start, numbers, start, end + 1 - start);
        }
    }

    // Time complexity for this is: O(n log n)
}