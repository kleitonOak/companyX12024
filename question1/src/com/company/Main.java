package com.company;

import java.io.Console;

public class Main {
    //1) Write a console application in Java which counts from 1 to 20. If the number is divisible by 3,
    // print “A”; if it is divisible by 5, print
    //“B”. If it is divisible by 3 and by 5, print “C”.
    public static void main(String[] args) {
	    for(int i= 1; i<=20; i++){
	        boolean isDividedBy3 = i % 3 == 0;
	        boolean isDividedBy5 = i % 5 == 0;

	        if(isDividedBy3 && isDividedBy5){
                System.out.println("C");
            }else if(isDividedBy5){
	            System.out.println("B");
            }else if(isDividedBy3){
	            System.out.println("A");
            }else {
	            System.out.println("I: "+i);
            }
        }
    }
}
