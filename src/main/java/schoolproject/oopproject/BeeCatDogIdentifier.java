/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolproject.oopproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author emmanuel
 */
public class BeeCatDogIdentifier {

    private ArrayList<Integer> getFactorsLessThanNumber(int number) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        int count = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                factors.add(i);
                count++;
            }
        }
        return factors;
    }

    public String identify(int number, boolean verbose) {
        if (number < 0) {
            throw new IllegalArgumentException("Argument can not be negative");
        }
        ArrayList<Integer> factors = getFactorsLessThanNumber(number);
        if (verbose) {
            System.out.println("Factors: " + factors);
        }

        int sumOfFactors = 0;
        for (int num : factors) {
            sumOfFactors += num;
        }
        if (verbose) {
            System.out.println("Sum of Factors: " + sumOfFactors);
        }

        if (sumOfFactors < number) {
            return "cat";
        } else if (sumOfFactors > number) {
            return "dog";
        } else {
            return "bee";
        }
    }

    public Map<String, Integer> identify(int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException("Start should be less than end");
        } else if (start < 0 || end < 0) {
            throw new IllegalArgumentException("Arguments can not be negative");
        }
        Map<String, Integer> animalMap = new HashMap<>();
        animalMap.put("cat", 0);
        animalMap.put("dog", 0);
        animalMap.put("bee", 0);
        for (int i = start; i <= end; i++) {
            try {
                String answer = identify(i, false);
                switch (answer) {
                    case "cat": {
                        int count = animalMap.get("cat");
                        count++;
                        animalMap.put("cat", count);
                        break;
                    }
                    case "dog": {
                        int count = animalMap.get("dog");
                        count++;
                        animalMap.put("dog", count);
                        break;
                    }
                    default: {
                        int count = animalMap.get("bee");
                        count++;
                        animalMap.put("bee", count);
                        break;
                    }
                }
            } catch (Exception e) {
                throw e;
            }

        }
        return animalMap;
    }
}
