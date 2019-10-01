package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* 2. Write a program that uses Scanner to read two strings from the keyboard.
              Display each string, along with its length, on two separate lines.
              Then create a new string by joining the two strings, separated by a blank.
              Display the new string and its length on a third line.

              Algorithm:
              1. This program uses Scanner to read two strings from the keyboard then displays each string, along with its length.
              2. Ask user to enter two string.
              3. Save the two strings
              4. Print first string along with its length.
              5. Print second string along with its length.
              */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two stings of your choice.");    //prompts to enter 2 strings
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        System.out.println("First string entered: " + word1 + " with length " + word1.length() + " characters.");    //displays first string and length
        System.out.println("Second string entered: " + word2 + " with length " + word2.length() + " characters.");   //displays second string and length
    }
}
