package org.example;

import java.util.List;

public class OutputFormatter {
    public void format(List<Integer> numbers, int result, String operation) {
        int runningTotal = operation.equals("*") ? 1 : 0;

        for (int number : numbers) {
            if (operation.equals("+")) {
                runningTotal += number;
            } else if (operation.equals("*")) {
                runningTotal *= number;
            }
            System.out.println(operation + number + " (=" + runningTotal + ")");
        }

        System.out.println("-------\ntotal = " + result);
    }
}
