package org.example;

import java.io.IOException;
import java.util.List;

public class Calculator {
    private CSVReader reader;

    public Calculator(CSVReader reader) {
        this.reader = reader;
    }

    public int process(List<Integer> numbers, String operation) throws IOException {
        int result = operation.equals("*") ? 1 : 0;

        for (int number : numbers) {
            if (operation.equals("+")) {
                result += number;
            } else if (operation.equals("*")) {
                result *= number;
            }
        }
        return result;
    }
}
