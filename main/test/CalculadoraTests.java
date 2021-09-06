import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculadoraTests {
    Calculadora calculadora = new Calculadora();
    @Test
    @DisplayName("1 + 1 = 2")
    void sumarDosNumeros() {

        Assertions.assertEquals(2, calculadora.add(1, 1), "1 + 1 should equal 2");
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    void suma(int first, int second, int expectedResult) {

        Assertions.assertEquals(expectedResult, calculadora.add(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }
}
