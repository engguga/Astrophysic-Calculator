package com.enguga.app;

import com.enguga.app.utils.InputUtils;
import com.enguga.app.calculations.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===============================");
            System.out.println("Astro Calculator - Engguga");
            System.out.println("===============================");
            System.out.println("1 - Calcular Força Gravitacional");
            System.out.println("2 - Calcular Velocidade de Escape");
            System.out.println("3 - Calcular Lente Gravitacional");
            System.out.println("4 - Calcular Tempo de Dilatação Gravitacional");
            System.out.println("5 - Calcular Raio de Schwarzschild");
            System.out.println("0 - Sair");
            System.out.println("===============================");
            System.out.print("Escolha uma opção: ");

            opcao = InputUtils.readInt(scanner);

            switch (opcao) {
                case 1 -> calcularForcaGravitacional(scanner);
                case 2 -> calcularVelocidadeEscape(scanner);
                case 3 -> calcularLenteGravitacional(scanner);
                case 4 -> calcularDilatacaoTempo(scanner);
                case 5 -> calcularRaioSchwarzschild(scanner);
                case 0 -> System.out.println("Encerrando o programa...");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }

    private static void calcularForcaGravitacional(Scanner scanner) {
        System.out.println("\nCálculo da Força Gravitacional");
        double massa1 = InputUtils.readDouble(scanner, "Digite a massa 1 (kg): ");
        double massa2 = InputUtils.readDouble(scanner, "Digite a massa 2 (kg): ");
        double distancia = InputUtils.readDouble(scanner, "Digite a distância (m): ");

        double resultado = GravitationalForce.calculate(massa1, massa2, distancia);
        System.out.printf("Resultado: %.5e N\n", resultado);
    }

    private static void calcularVelocidadeEscape(Scanner scanner) {
        System.out.println("\nCálculo da Velocidade de Escape");
        double massa = InputUtils.readDouble(scanner, "Digite a massa do corpo (kg): ");
        double raio = InputUtils.readDouble(scanner, "Digite o raio (m): ");

        double resultado = EscapeVelocity.calculate(massa, raio);
        System.out.printf("Resultado: %.2f m/s\n", resultado);
    }

    private static void calcularLenteGravitacional(Scanner scanner) {
        System.out.println("\nCálculo da Lente Gravitacional");
        double massa = InputUtils.readDouble(scanner, "Digite a massa do objeto (kg): ");
        double impacto = InputUtils.readDouble(scanner, "Digite o parâmetro de impacto (m): ");

        double resultado = GravitationalLens.calculateDeflectionAngle(massa, impacto);
        System.out.printf("Resultado: %.5e rad\n", resultado);
    }

    private static void calcularDilatacaoTempo(Scanner scanner) {
        System.out.println("\nCálculo de Dilatação Temporal");
        double massa = InputUtils.readDouble(scanner, "Digite a massa do corpo (kg): ");
        double raio = InputUtils.readDouble(scanner, "Digite o raio (m): ");
        double tempo = InputUtils.readDouble(scanner, "Digite o tempo fora do campo gravitacional (s): ");

        double resultado = GravitationalTimeDilation.calculate(massa, raio, tempo);
        System.out.printf("Resultado: %.5f segundos\n", resultado);
    }

    private static void calcularRaioSchwarzschild(Scanner scanner) {
        System.out.println("\nCálculo do Raio de Schwarzschild");
        double massa = InputUtils.readDouble(scanner, "Digite a massa (kg): ");

        double resultado = SchwarzschildRadius.calculate(massa);
        System.out.printf("Resultado: %.5f metros\n", resultado);
    }
}
