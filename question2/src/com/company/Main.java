package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    //2) Write a console application in Java which:
    //a) reads the standard input,
    //b) breaks the string read into an array,
    //c) prints the array in the format { el1, el2, el3 } to the standard output,
    //d) sorts the elements of the array and prints it using the same format used before,
    //e) prints the array as a single string.
    //Example:
    //Type anything: My test
    //Original Array: { M, y, , t, e, s, t }
    //Sorted Array: { , M, e, s, t, t, y }
    //Final String: Mestty
    public static void main(String[] args) {
	    System.out.println("Please type anything");

        String input = new Scanner(System.in).nextLine();

        String[] mainArray = input.split("");

        System.out.printf("Original Array: %s, \n", Arrays.toString(mainArray));

        mainArray = Arrays.stream(mainArray).sorted().toArray(String[]::new);

        System.out.printf("Sorted Array: %s \n", Arrays.toString(mainArray));

        System.out.println("Final String: "+String.join("", mainArray));

    }
}
