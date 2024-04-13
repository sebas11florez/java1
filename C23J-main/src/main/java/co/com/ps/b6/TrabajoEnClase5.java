package co.com.ps.b6;


import java.util.Scanner;

public class TrabajoEnClase5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        int opcion;

        System.out.print("Ingresa el primer número: ");
        num1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        num2 = scanner.nextDouble();

        do {
            System.out.println("\nMenú de Operaciones:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            try {
                switch (opcion) {
                    case 1:
                        System.out.println("Resultado de la suma: " + sumar(num1, num2));
                        break;
                    case 2:
                        System.out.println("Resultado de la resta: " + restar(num1, num2));
                        break;
                    case 3:
                        System.out.println("Resultado de la multiplicación: " + multiplicar(num1, num2));
                        break;
                    case 4:
                        System.out.println("Resultado de la división: " + dividir(num1, num2));
                        break;
                    case 0:
                        System.out.println("Saliendo de la calculadora. ¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                }
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (opcion != 0);
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }
        return a / b;
    }
}
