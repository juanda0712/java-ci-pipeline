import junit.framework.TestCase;

public class TestCalculadora extends TestCase {

    Calculadora calculator = new Calculadora();

    //SUMA
    public void testSumarDosNumeros() {
        int sum = calculator.suma(1,1);
        assertEquals(2, sum);
    }
    public void testFalloSumaPorParametrosNegativos(){
        var thrown = false;
        try{
            calculator.suma(-2,2);
        }catch (IllegalArgumentException e){
            thrown = true;
        }
        assertTrue(thrown);

        thrown = false;
        try{
            calculator.suma(2,-2);
        }catch (IllegalArgumentException e){
            thrown = true;
        }
        assertTrue(thrown);
    }

    //RESTA
    public void testRestaDosNumeros() {
        int resta = calculator.resta(4,2);
        assertEquals(2, resta);
    }
    public void testFalloRestaPorParametrosNegativos(){
        var thrown = false;
        try{
            calculator.resta(-3,2);
        }catch (IllegalArgumentException e){
            thrown = true;
        }
        assertTrue(thrown);

        thrown = false;
        try{
            calculator.resta(3,-2);
        }catch (IllegalArgumentException e){
            thrown = true;
        }
        assertTrue(thrown);
    }

    //MULTIPLICACION
    public void testMultiplicacionDosNumeros() {
        int mult = calculator.multiplicacion(4,2);
        assertEquals(8, mult);
    }
    public void testFalloMultiplicacionPorParametrosNegativos(){
        var thrown = false;
        try{
            calculator.multiplicacion(-6,2);
        }catch (IllegalArgumentException e){
            thrown = true;
        }
        assertTrue(thrown);

        thrown = false;
        try{
            calculator.multiplicacion(6,-2);
        }catch (IllegalArgumentException e){
            thrown = true;
        }
        assertTrue(thrown);
    }

    //DIVISION
    public void testDivisionDosNumeros() {
        int div = calculator.divisionEntera(8,2);
        assertEquals(4, div);
    }
    public void testFalloDivisionPorParametrosNegativos(){
        var thrown = false;
        try{
            calculator.divisionEntera(-9,3);
        }catch (IllegalArgumentException e){
            thrown = true;
        }
        assertTrue(thrown);

        thrown = false;
        try{
            calculator.divisionEntera(9,-3);
        }catch (IllegalArgumentException e){
            thrown = true;
        }
        assertTrue(thrown);
    }
}


