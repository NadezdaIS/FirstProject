package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Assignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Task
        // Given a string from the user return the character and count of the character that occurs the most
        // in the string.

        /*System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        int[] count = new int[256]; // array to represent all possible characters
        for (int i = 0; i < text.length(); i++) {
            count[text.charAt(i)]++; // makes count array from string
        }
        int max = 0;  // max count
        char most = ' ';// most used character

        for (int i = 0; i < text.length(); i++) {
            if (max < count[text.charAt(i)]) {
                max = count[text.charAt(i)];
                most = text.charAt(i);
            }
        }

        System.out.print("The most used character is " + most + ", is is used " + max + " times." );*/
// Task

        // You're sent to a grocery store with the following items on your list ["Bananas", "Bread", "Fish"]
        // The cost of the items in the store is [12, 5, 10], your current cash-in-hand is 20 dollars. Which
        // of the items can you safely without needing extra cash.
        // Priority - Bananas[least], Fish[second], Bread[First]
        // N.B. you can't buy half of an item.
        // You can buy -- and -- and you'll be left with -- dollars.

       /*String[] groceryList = {"Bananas", "Bread", "Fish"};
        int[] prices = {12, 5, 10};

        int totalCost = prices[2] + prices[1];

        System.out.println("You can buy Fish and Bread and you'll be left with " + (20 - totalCost) + " dollars");*/


        
        
        

    }
}
