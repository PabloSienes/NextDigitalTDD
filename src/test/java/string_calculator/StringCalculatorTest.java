package string_calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {
    @Test
    void deberiaSumarNumerosSeparadosPorComas() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(6, calculator.add("1,2,3"));
        assertEquals(30, calculator.add("3,4,20,1,2"));
    }
}