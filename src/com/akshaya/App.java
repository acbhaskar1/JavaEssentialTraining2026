//Program to input two numbers and calculate sum

package com.akshaya;

import java.util.Scanner;

public class App {

    public static int inputValues(Scanner sc, String prompt) {
        System.out.print(prompt);
        int val = sc.nextInt();
        return val;
    }
    public static int calculateSum(int value1,int value2){
        var sum = value1 + value2;
        return sum;
    }
    public static int calculateSum(int value1, int value2, int value3, int value4){
        var sum = value1 + value2 + value3 + value4;
        return sum;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int val1 = inputValues(sc, "Enter first value : ");
        int val2 = inputValues(sc, "Enter second value : ");
        System.out.println("The sum of given values is : " + calculateSum(val1, val2));
        System.out.println("The sum of given values is : " + calculateSum(val1, val2,val2, val2));
    }
}
