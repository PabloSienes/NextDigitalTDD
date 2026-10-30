package string_calculator;

import java.util.regex.Pattern;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) return 0;

        String delimiter = ",";
        String numbersToProcess = numbers;

        // Detectar si hay delimitador personalizado
        if (numbers.startsWith("//")) {
            int delimiterEndIndex = numbers.indexOf("\n");
            // Extraer el delimitador ignorando el "//" inicial
            delimiter = numbers.substring(2, delimiterEndIndex);
            // Aislar solo la parte de los números
            numbersToProcess = numbers.substring(delimiterEndIndex + 1);
        }

        // Pattern.quote asegura que si el delimitador contiene caracteres especiales regex (como | o *) se traten literalmente
        String[] nums = numbersToProcess.split(Pattern.quote(delimiter));

        return sumarArray(nums);
    }

    private int sumarArray(String[] numeros) {
        int sum = 0;
        for (String n : numeros) {
            sum += Integer.parseInt(n);
        }
        return sum;
    }
}