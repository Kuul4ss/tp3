package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.List;

class CalculatorTest {

    @Test
    void testAddition() throws IOException {
        CSVReader mockReader = new CSVReader() {
            @Override
            public List<Integer> readNumbers(String filename) {
                return List.of(1, 2, 3);
            }
        };

        Calculator calculator = new Calculator(mockReader);
        int result = calculator.process(mockReader.readNumbers("oui.csv"), "+");
        assertEquals(6, result);
    }

    @Test
    void testMultiplication() throws IOException {
        CSVReader mockReader = new CSVReader() {
            @Override
            public List<Integer> readNumbers(String filename) {
                return List.of(1, 2, 3);
            }
        };

        Calculator calculator = new Calculator(mockReader);
        int result = calculator.process(mockReader.readNumbers("oui.csv"), "*");
        assertEquals(6, result);
    }
}
