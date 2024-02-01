/*
 *Faça um programa que leia as duas notas de um aluno em uma matéria e mostre na tela a sua média na disciplina.
 * Algoritmo de número 05 do Curso em vídeo.
 * URL: http://www.cursoemvideo.com/wp-content/uploads/2019/08/exercicios-algoritmos.pdf.
 */

import java.util.Scanner;
//Importa modulo Scanner.

public class mediaAluno {
    public static void main(String[] Args) {
        try (Scanner entradaDados = new Scanner(System.in)) {
            System.out.printf("Olá, qual é a sua primeira nota?" + "\n");
            float primeiraNota = entradaDados.nextFloat();

            System.out.printf("Certo, e qual é a sua segunda nota?" + "\n");
            float segundaNota = entradaDados.nextFloat();

            float calculo = (primeiraNota + segundaNota) / 2;

            System.out.printf("Certo estou realizando o calculo para chegar na média de suas notas. Mas enquanto isso qual é o seu nome?" + "\n");
            String nome = entradaDados.next();

            System.out.printf("Perfeito, " + nome + " sua média é de: " + calculo);
        }
    }
}

// Revisão do algoritmo: 31/01/2024.