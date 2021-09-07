import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculadoraTests{
    Calculadora calculadora = new Calculadora();

    //SUMAS
    @Test
    @DisplayName("1 + 1 = 2")
    void sumarDosNumeros() {
        Assertions.assertEquals(2, calculadora.suma(1, 1), "1 + 1 es 2");
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    void suma(int n1, int n2, int resultadoEsperado) {
        Assertions.assertEquals(resultadoEsperado, calculadora.suma(n1, n2),
                () -> n1 + " + " + n2 + " es igual a " + resultadoEsperado);
    }

    @Test
    void falloEnSumaPorParametrosNegativos(){
        Assertions.assertThrows(IllegalArgumentException.class,() -> {
            calculadora.suma(-2, 2);
        });
        Assertions.assertThrows(IllegalArgumentException.class,() -> {
            calculadora.suma(2, -2);
        });
    }

    //RESTAS
    @Test
    @DisplayName("10 - 3 = 7")
    void restarDosNumeros() {
        Assertions.assertEquals(7, calculadora.resta(10, 3), "10 - 3 es 7");
    }

    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "5,    1,   4",
            "9,    4,   5",
            "49,  51, -2",
            "1,  100, -99"
    })
    void resta(int n1, int n2, int resultadoEsperado) {
        Assertions.assertEquals(resultadoEsperado, calculadora.resta(n1, n2),
                () -> n1 + " - " + n2 + " es igual a " + resultadoEsperado);
    }

    @Test
    void falloEnRestaPorParametrosNegativos(){
        Assertions.assertThrows(IllegalArgumentException.class,() -> {
            calculadora.resta(-2, 2);
        });
        Assertions.assertThrows(IllegalArgumentException.class,() -> {
            calculadora.resta(2, -2);
        });
    }


    //MULTIPLICACION
    @Test
    @DisplayName("10 * 3 = 30")
    void multiplicarDosNumeros() {
        Assertions.assertEquals(30, calculadora.multiplicacion(10, 3), "10 * 3 es 30");
    }

    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "5,    1,   5",
            "10,    4,   40",
            "49,  51, 2499",
            "1,  100, 100"
    })
    void multiplicar(int n1, int n2, int resultadoEsperado) {
        Assertions.assertEquals(resultadoEsperado, calculadora.multiplicacion(n1, n2),
                () -> n1 + " * " + n2 + " es igual a " + resultadoEsperado);
    }

    @Test
    void falloEnMultiplicacionPorParametrosNegativos(){
        Assertions.assertThrows(IllegalArgumentException.class,() -> {
            calculadora.multiplicacion(-2, 2);
        });
        Assertions.assertThrows(IllegalArgumentException.class,() -> {
            calculadora.multiplicacion(2, -2);
        });
    }


    //DIVISION
    @Test
    @DisplayName("10 / 3 = 3")
    void dividirEnteraDosNumeros() {
        Assertions.assertEquals(3, calculadora.divisionEntera(10, 3), "10 / 3 es 3");
    }

    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "5,    1,   5",
            "9,    4,   2",
            "49,  51, 0",
            "1,  100, 0"
    })
    void division(int n1, int n2, int resultadoEsperado) {
        Assertions.assertEquals(resultadoEsperado, calculadora.divisionEntera(n1, n2),
                () -> n1 + " / " + n2 + " es igual a " + resultadoEsperado);
    }

    @Test
    void falloEnDivisionPorParametrosNegativos(){
        Assertions.assertThrows(IllegalArgumentException.class,() -> {
            calculadora.divisionEntera(-2, 2);
        });
        Assertions.assertThrows(IllegalArgumentException.class,() -> {
            calculadora.divisionEntera(2, -2);
        });
    }
}



