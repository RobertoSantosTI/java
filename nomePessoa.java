/* Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas-vindas para ela. 
 * Algoritmo de número 02 do Curso em vídeo.
 * URL: http://www.cursoemvideo.com/wp-content/uploads/2019/08/exercicios-algoritmos.pdf.
*/
import java.util.Scanner;
/* Importa biblioteca Scanner! */
public class nomePessoa {
    public static void main(String[] Args) {
        try (Scanner entradaDados = new Scanner(System.in)) {
            System.out.printf("Olá, qual é o seu nome?" + "\n");
            String nome = entradaDados.next();
            System.out.printf("Olá " + nome + ", é um prazer lhe conhecer!");
        }
    }
}

// Revisão do algoritmo: 31/01/2024.