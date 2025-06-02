package com.enguga.app.utils;

import java.util.Scanner;

public class InputUtils {

    public static double readDouble(Scanner scanner, String prompt) {
        double value = 0;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print(prompt);
                String input = scanner.nextLine();

                input = input.toLowerCase()
                        .replaceAll("[a-zA-Z]+", "")  // remove kg, m, s etc.
                        .replaceAll("[,]", ".")       // troca vírgula por ponto
                        .replaceAll("\\s+", "");      // remove espaços

                value = Double.parseDouble(input);
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Tente novamente.");
            }
        }
        return value;
    }

    public static int readInt(Scanner scanner) {
        int value = 0;
        boolean valid = false;
        while (!valid) {
            try {
                String input = scanner.nextLine().replaceAll("\\s+", "");
                value = Integer.parseInt(input);
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
            }
        }
        return value;
    }
}
