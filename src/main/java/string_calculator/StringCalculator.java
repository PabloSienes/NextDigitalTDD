package string_calculator;

import java.util.regex.Pattern;

public class StringCalculator {

    private static final String CUSTOM_DELIMITER_PREFIX = "//";
    private static final String DEFAULT_DELIMITER = ",";

    public int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) return 0;

        String delimiter = DEFAULT_DELIMITER;
        String numbersToProcess = numbers;

        if (hasCustomDelimiter(numbers)) {
            delimiter = extractDelimiter(numbers);
            numbersToProcess = extractNumbers(numbers);
        }

        return sumarArray(numbersToProcess.split(Pattern.quote(delimiter)));
    }

    private boolean hasCustomDelimiter(String numbers) {
        return numbers.startsWith(CUSTOM_DELIMITER_PREFIX);
    }

    private String extractDelimiter(String numbers) {
        int newlineIndex = numbers.indexOf("\n");
        return numbers.substring(2, newlineIndex);
    }

    private String extractNumbers(String numbers) {
        int newlineIndex = numbers.indexOf("\n");
        return numbers.substring(newlineIndex + 1);
    }

    private int sumarArray(String[] numeros) {
        int sum = 0;
        for (String n : numeros) {
            sum += Integer.parseInt(n);
        }
        return sum;
    }
}