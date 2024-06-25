package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    public List<Integer> readNumbers(String filename) throws IOException {
        List<Integer> numbers = new ArrayList<>();

        if (!filename.endsWith(".csv")) {
            throw new IOException("File is not a CSV file.");
        }

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    try {
                        int num = Integer.parseInt(line.trim());
                        numbers.add(num);
                    } catch (NumberFormatException e) {
                        throw new IOException("Invalid number format in CSV file: " + line, e);
                    }
                }
            }
        }
        return numbers;
    }
}
