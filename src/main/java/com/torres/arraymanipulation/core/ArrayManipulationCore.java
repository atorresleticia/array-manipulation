/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.torres.arraymanipulation.core;

/**
 *
 * @author Leticia Torres
 */
public class ArrayManipulationCore {

    static int ARRAY_SIZE = 10;
    
    public static boolean notInRange(int number, int min, int max) {
        return (number > max || number < min);
    }
    
    public static boolean isMultiple(int number, int multipleOf) {
        return number % multipleOf == 0;
    }
    
    public static int sumEvenIndex(int[] values) {
        int sum = 0;

        for (int i = 1; i < values.length; i += 2) {
            sum += values[i];
        }

        return sum;
    }

    public static int sumOddIndex(int[] values) {
        int sum = 0;

        for (int i = 0; i < values.length; i += 2) {
            sum += values[i];
        }

        return sum;
    }

    public static int[] arrayGeneration(int userInput) {

        int[] values = new int[ARRAY_SIZE];

        for (int i = 0; i < values.length; i++) {
            values[i] = (int) ((i + 1) % 3 == 0 ? ((i + 1) * 0.3f * userInput) : ((i + 1) * 0.1 * userInput));
        }
        
        return values;
    }

    public static int sum(int[] values, char sumOption) {
        return sumOption == 'e' ? sumEvenIndex(values) : sumOddIndex(values);
    }
}
