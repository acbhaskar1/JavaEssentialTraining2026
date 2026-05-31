package com.akshaya;

import java.util.ArrayList;
import java.util.List;

// 1. YOUR LEETCODE SOLUTION CLASS
class AITutorSolution {
    public List<String> solveAndExplainSum(int num1, int num2) {
        List<String> steps = new ArrayList<>();
        int result = num1 + num2;

        steps.add("Problem: Find the sum of " + num1 + " and " + num2 + ".");
        steps.add("Equation: " + num1 + " + " + num2 + " = " + result);
        steps.add("Conclusion: The total sum is " + result + ".");

        return steps;
    }
}

// 2. THE LEETCODE JUDGE / MAIN CLASS
public class App {
    public static void main(String[] args) {
        AITutorSolution tutor = new AITutorSolution();
        int passedCases = 0;
        int totalCases = 0;

        System.out.println("🔄 Running AI Tutor Test Suite...\n");

        // ---------------------------------------------------------
        // SECTION A: CUSTOM TEST CASES (Visible cases you can change)
        // ---------------------------------------------------------
        System.out.println("--- Running Custom Test Cases ---");

        // Custom Case 1: Standard positive numbers
        if (validateTestCase(tutor, 5, 7, "Equation: 5 + 7 = 12")) passedCases++;
        totalCases++;

        // Custom Case 2: Adding zero
        if (validateTestCase(tutor, 10, 0, "Equation: 10 + 0 = 10")) passedCases++;
        totalCases++;


        // ---------------------------------------------------------
        // SECTION B: HIDDEN TEST CASES (Edge cases to catch bugs)
        // ---------------------------------------------------------
        System.out.println("\n--- Running Hidden Test Cases ---");

        // Hidden Case 3: Negative numbers
        if (validateTestCase(tutor, -3, -5, "Equation: -3 + -5 = -8")) passedCases++;
        totalCases++;

        // Hidden Case 4: Mixing positive and negative
        if (validateTestCase(tutor, -10, 15, "Equation: -10 + 15 = 5")) passedCases++;
        totalCases++;

        // Hidden Case 5: Large boundary numbers (Checking for overflow limits)
        if (validateTestCase(tutor, 200000, 300000, "Equation: 200000 + 300000 = 500000")) passedCases++;
        totalCases++;


        // ---------------------------------------------------------
        // FINAL JUDGEMENT SCORE
        // ---------------------------------------------------------
        System.out.println("\n-----------------------------------------");
        if (passedCases == totalCases) {
            System.out.println("🎉 SUCCESS: " + passedCases + "/" + totalCases + " cases passed. Code Accepted!");
        } else {
            System.out.println("❌ FAILURE: Only " + passedCases + "/" + totalCases + " cases passed. Check your logic!");
        }
        System.out.println("-----------------------------------------");
    }

    /**
     * Helper method acting as the LeetCode automated judge validation line.
     */
    private static boolean validateTestCase(AITutorSolution tutor, int n1, int n2, String expectedEquationLine) {
        try {
            List<String> result = tutor.solveAndExplainSum(n1, n2);
            // Check if the 2nd line (Index 1) matches our expected mathematical evaluation
            if (result.get(1).equals(expectedEquationLine)) {
                System.out.println("✅ Test Passed for inputs: (" + n1 + ", " + n2 + ")");
                return true;
            } else {
                System.out.println("❌ Test Failed for inputs: (" + n1 + ", " + n2 + ") -> Expected: \"" + expectedEquationLine + "\" but got: \"" + result.get(1) + "\"");
                return false;
            }
        } catch (Exception e) {
            System.out.println("💥 Test Crashed for inputs: (" + n1 + ", " + n2 + ") due to exception: " + e.getMessage());
            return false;
        }
    }
}