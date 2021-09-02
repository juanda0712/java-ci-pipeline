import java.util.Scanner;
import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
        int numero1, numero2, resultado;
        String operacion;

        Scanner input = new Scanner(System.in);

        System.out.print("Ingresar primer numero: ");
        numero1 = input.nextInt();

        System.out.print("Ingresar segundo numero: ");
        numero2 = input.nextInt();

        Scanner op = new Scanner(System.in);
        System.out.print("Ingresar operacion [+] [-] [*] [/] : ");
        operacion = op.nextLine();

        switch(operacion){

            case "+":
                resultado = calculadora.suma(numero1,numero2);
                System.out.println(numero1 + " + " + numero2 + " = " + resultado);
                break;

            case "-":
                resultado = calculadora.resta(numero1,numero2);
                System.out.println(numero1 + " + " + numero2 + " = " + resultado);
                break;

            case "*":
                resultado = calculadora.multiplicacion(numero1,numero2);
                System.out.println(numero1 + " + " + numero2 + " = " + resultado);
                break;

            case "/":
                resultado = calculadora.division(numero1,numero2);
                System.out.println(numero1 + " + " + numero2 + " = " + resultado);
                break;
            default:
                System.out.println("Illigal Operation");
        }
    }
}
