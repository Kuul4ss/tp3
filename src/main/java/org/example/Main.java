package org.example;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Working Directory = " + System.getProperty("user.dir"));

        if (args.length != 2) {
            System.out.println("Usage: java org.example.Main <filename> <operation>");
            return;
        }

        String filename = args[0];
        String operation = args[1];

        CSVReader csvReader = new CSVReader();
        Calculator calculator = new Calculator(csvReader);
        OutputFormatter formatter = new OutputFormatter();

        try {
            List<Integer> numbers = csvReader.readNumbers(filename);
            int result = calculator.process(numbers, operation);
            formatter.format(numbers, result, operation);
        } catch (IOException e) {
            System.err.println("Error processing file: " + e.getMessage());
        }
    }
}
