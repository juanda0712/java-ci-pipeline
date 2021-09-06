public class Calculadora {
    public int suma(int a, int b) {
        if (a < 0 || b < 0)
            throw new IllegalArgumentException("parametros no pueden ser negativos");
        return a + b;
    }
    public int resta(int a, int b) {
        if (a < 0 || b < 0)
            throw new IllegalArgumentException("parametros no pueden ser negativos");
        return a - b;
    }
    public int multiplicacion(int a, int b) {
        if (a < 0 || b < 0)
            throw new IllegalArgumentException("parametros no pueden ser negativos");
        return a * b;
    }
    public int divisionEntera(int a, int b) {
        if (a < 0 || b < 0)
            throw new IllegalArgumentException("parametros no pueden ser negativos");
        return a / b;
    }
}
