package com.vivriti.average;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class AverageInteger {
    
    public static void main(String[] args) {
        List<Integer> listOfIntegers  = new ArrayList<Integer>();
        
        int sum = 0;
        
        int average= 0;
        
        System.out.println(" Please provide length of inputs: ");
        Scanner input = new Scanner(System.in);
        
        int inputLength = input.nextInt();
        
        System.out.println("Enter the numbers: ");

        for (int i = 0; i < inputLength; i++) {
            listOfIntegers.add(input.nextInt());
        }
        
        for (int i : listOfIntegers) {
            sum = sum + i;
        }
        
        average = sum / listOfIntegers.size();
        
        System.out.println(" Average " +average);
        
    }

}
