package clase2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculadora {

    public static void main(String[] args) {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        double num1 = 0;
        double num2 = 0;
        char operacion = ' ';

        double resultado = 0;
        boolean resuelta = false;
        boolean numeroValido = false;


        while (!numeroValido) {
            System.out.println("Ingrese el primer número");
            try {
                num1 = Double.valueOf(entrada.readLine());
                numeroValido = true;
            } catch (Exception e) {
                System.out.println("No es un número válido");
            }
        }

        numeroValido = false;
        while (!numeroValido) {
            System.out.println("Ingrese el segundo número");
            try {
                num2 = Double.valueOf(entrada.readLine());
                numeroValido = true;
            } catch (Exception e) {
                System.out.println("No es un número válido");
            }
        }

        System.out.println("Ingrese la operación a realizar (+ - * /)");
        while (operacion != '+' && operacion != '-' && operacion != '*' && operacion != '/') {
            try {
                operacion = entrada.readLine().charAt(0);
                if (operacion != '+' && operacion != '-' && operacion != '*' && operacion != '/') {
                    System.out.println("No es una operación válida");
                    System.out.println("Ingrese una operación válida (+ - * /)");
                }
            } catch (Exception e) {
                System.out.println("No es una operación válida");
                System.out.println("Ingrese una operación válida (+ - * /)");
            }
        }


        switch (operacion) {
            case '+': {
                resultado = num1 + num2;
                resuelta = true;
            } break;
            case '-': {
                resultado = num1 - num2;
                resuelta = true;
            } break;
            case '*': {
                resultado = num1 * num2;
                resuelta = true;
            } break;
            case '/': {
                if (num2 != 0) {
                    resultado = num1 / num2;
                    resuelta = true;
                }
            } break;
            default: {
                resuelta = false;
            }
        }

        if (resuelta) {
            System.out.print(num1 + " " + operacion + " " + num2 + " = " + resultado);
        } else {
            System.out.print("Operación inválida");
        }

    }
}
