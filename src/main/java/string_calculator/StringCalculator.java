package string_calculator;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) return 0;
        return sumarArray(numbers.split(","));
    }

    private int sumarArray(String[] numeros) {
        int sum = 0;
        for (String n : numeros) {
            sum += Integer.parseInt(n);
        }
        return sum;
    }
}