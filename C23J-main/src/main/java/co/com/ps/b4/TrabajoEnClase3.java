package co.com.ps.b4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrabajoEnClase3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> palabras = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            System.out.print("Ingresa una palabra: ");
            String palabra = scanner.nextLine();
            palabras.add(palabra);
        }

        System.out.println("Palabras con 4 o más letras:");
        for (String palabra : palabras) {
            if (palabra.length() >= 4) {
                System.out.println(palabra);
            }
        }
    }
}
