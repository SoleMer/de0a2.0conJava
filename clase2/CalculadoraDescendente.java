package clase2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculadoraDescendente {

    public static void main(String[] args) {

        double num1 = pedirNumero();
        double num2 = pedirNumero();
        char operacion = pedirOperacion(num2);

        double resultado = resolver(num1, num2, operacion);

        System.out.print(num1 + " " + operacion + " " + num2 + " = " + resultado);

    }

    public static double pedirNumero() {
        boolean numeroValido = false;
        double num = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        while (!numeroValido) {
            System.out.println("Ingrese un número");
            try {
                num = Double.valueOf(entrada.readLine());
                numeroValido = true;
            } catch (Exception e) {
                System.out.println("No es un número válido");
            }
        }

        return num;
    }

    public static char pedirOperacion(double num2) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        char operacion = ' ';
        System.out.println("Ingrese la operación a realizar (+ - * /)");
        while (!esOperacionValida(operacion, num2)) {
            try {
                operacion = entrada.readLine().charAt(0);
                if (!esOperacionValida(operacion, num2)) {
                    System.out.println("No es una operación válida");
                    System.out.println("Ingrese una operación válida (+ - * /)");
                }
            } catch (Exception e) {
                System.out.println("No es una operación válida");
                System.out.println("Ingrese una operación válida (+ - * /)");
            }
        }
        return operacion;
    }

    public static boolean esOperacionValida(char operacion, double num2) {
        return operacion == '+' || operacion == '-' || operacion == '*' || (operacion == '/' && num2 != 0);
     }

    public static double resolver(double num1, double num2, char operacion) {
        double resultado = 0;
        switch (operacion) {
            case '+': {
                resultado = num1 + num2;
            } break;
            case '-': {
                resultado = num1 - num2;
            } break;
            case '*': {
                resultado = num1 * num2;
            } break;
            case '/': {
                resultado = num1 / num2;
            } break;
            default: {

            }
        }
        return resultado;
    }
}
