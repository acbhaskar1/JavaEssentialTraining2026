//Day 1
//1. Warm-up: if 45% of x is 90, what is x?
//2. Generalise the solution.
package com.akshaya;

import java.util.Scanner;

public class App {
    public static int percentage(int percent, int value){
        var result = value * 100 / percent;
        return result;
    }
    public static int inputValues(Scanner sc, String prompt){
        System.out.print(prompt);
        return sc.nextInt();
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        var percentage = inputValues(sc, "Enter Percentage needed be calculated for a number: ");
        var valueForWhichPerNeeded = inputValues(sc, "Enter the value for which percentage needed: ");
        var res = percentage(percentage, valueForWhichPerNeeded);
        System.out.printf("For the amount %d (with %d%%  target)  %d rupees revenue is earned on Advertisement.",res, percentage, valueForWhichPerNeeded);
        System.out.println("\n\n ***********************");
        System.out.println("\n\n The above logic used to calculate the 'Adv.' revenue may be in YOUTUBE or  FACEBOOK and other similar kind of applications.");
    }
}
