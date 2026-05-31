package com.akshaya;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
===============================================================================
                       LEETCODE PROBLEM STATEMENT
===============================================================================
Problem ID: 9001. AI Tutor Solution (Summation Engine)

Difficulty: Easy

Task:
You are building the core software module for an AI math tutor application.
Given two integers `num1` and `num2`, return an ordered list of strings containing
a step-by-step breakdown explaining how to solve their mathematical sum.

The returned `List<String>` must follow this explicit structural format:
  - Index 0: Problem statement string -> "Problem: Find the sum of [num1] and [num2]."
  - Index 1: Mathematical evaluation  -> "Equation: [num1] + [num2] = [result]"
  - Index 2: Explanatory conclusion   -> "Conclusion: The total sum is [result]."

Constraints:
  - -10^6 <= num1, num2 <= 10^6
===============================================================================
*/

// --- 1. YOUR LEETCODE SOLUTION CLASS ---
class Solution {
    public List<String> solveAndExplainSum(int num1, int num2) {
        List<String> steps = new ArrayList<>();
        int result = num1 + num2;

        steps.add("Problem: Find the sum of " + num1 + " and " + num2 + ".");
        steps.add("Equation: " + num1 + " + " + num2 + " = " + result);
        steps.add("Conclusion: The total sum is " + result + ".");

        return steps;
    }
}

// --- 2. INTERACTIVE TEST BENCH (MAIN SYSTEM) ---
public class App {
    public static void main(String[] args) {
        Solution solver = new Solution();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.println("   WELCOME TO THE AI TUTOR LEETCODE JUDGE ENGINE ");
        System.out.println("=================================================");

        // ---------------------------------------------------------
        // PART 1: INTERACTIVE CUSTOM INPUT PANEL
        // ---------------------------------------------------------
        System.out.println("\n[PLAYGROUND] Test your Custom Input Case:");
        try {
            System.out.print("Enter custom value for num1: ");
            int customNum1 = Integer.parseInt(scanner.nextLine().trim());

            System.out.print("Enter custom value for num2: ");
            int customNum2 = Integer.parseInt(scanner.nextLine().trim());

            System.out.println("\nExecuting your custom case...");
            List<String> customOutput = solver.solveAndExplainSum(customNum1, customNum2);

            System.out.println("-------------------------------------------------");
            System.out.println("OUTPUT RECEIVED FROM YOUR SOLUTION:");
            for (String step : customOutput) {
                System.out.println(" > " + step);
            }
            System.out.println("-------------------------------------------------");

        } catch (NumberFormatException e) {
            System.out.println("❌ Invalid Input: Please enter integer numbers only.");
        }

        // ---------------------------------------------------------
        // PART 2: SUBMIT CODE (RUNNING THE 5 HIDDEN SUITE TEST CASES)
        // ---------------------------------------------------------
        System.out.println("\nPress [ENTER] to execute official system submission against hidden test cases...");
        scanner.nextLine();

        System.out.println("⚙️ Running 5 Hidden System Cases...");
        int passed = 0;

        // Hidden Case 1: Standard Positive boundaries
        if (runValidation(solver, 14, 6, "Equation: 14 + 6 = 20")) passed++;
        // Hidden Case 2: Zero limits
        if (runValidation(solver, 0, -22, "Equation: 0 + -22 = -22")) passed++;
        // Hidden Case 3: Fully negative coordinates
        if (runValidation(solver, -50, -50, "Equation: -50 + -50 = -100")) passed++;
        // Hidden Case 4: Mirror inverses
        if (runValidation(solver, 100, -100, "Equation: 100 + -100 = 0")) passed++;
        // Hidden Case 5: Large scale integration limits
        if (runValidation(solver, 9999, 1, "Equation: 9999 + 1 = 10000")) passed++;

        // Final submission output evaluation
        System.out.println("\n=================================================");
        if (passed == 5) {
            System.out.println("👑 STATUS: ACCEPTED");
            System.out.println("🎯 SCORE: 5/5 Hidden Tests Passed successfully!");
        } else {
            System.out.println("❌ STATUS: WRONG ANSWER");
            System.out.println("⚠️ SCORE: Only " + passed + "/5 Hidden Tests Passed. Review formatting.");
        }
        System.out.println("=================================================");

        scanner.close();
    }

    /**
     * Automated judge assertion block
     */
    private static boolean runValidation(Solution solver, int n1, int n2, String expectedMatch) {
        try {
            List<String> output = solver.solveAndExplainSum(n1, n2);
            if (output.size() >= 2 && output.get(1).equals(expectedMatch)) {
                return true;
            }
        } catch (Exception ignored) {}
        return false;
    }
}