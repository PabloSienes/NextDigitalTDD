package string_calculator;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) return 0;
        String[] nums = numbers.split(",");
        int sum = 0;
        for (String n : nums) {
            sum += Integer.parseInt(n);
        }
        return sum;
    }
}