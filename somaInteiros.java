/*
 * Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório entre eles.
 * Algoritmo de número 04 do Curso em vídeo.
 * URL: http://www.cursoemvideo.com/wp-content/uploads/2019/08/exercicios-algoritmos.pdf.
 */

import java.util.Scanner;
//Importa modulo Scanner.

public class somaInteiros {
    public static void main(String[] Args) {
        try (Scanner entradaDados = new Scanner(System.in)) {
            System.out.printf("Insira o primeiro valor!" + "\n");
            int primeiroValor = entradaDados.nextInt();

            System.out.printf("Insira o segundo valor!" + "\n");
            int segundoValor = entradaDados.nextInt();

            int somaValores = primeiroValor + segundoValor;

            System.out.printf("A soma dos valores é de: " + somaValores + "\n" + "Obrigado por executar este algoritmo!");
        }
    }
}
