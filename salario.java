/* Crie um programa que leia o nome e o salário de um funcionário, mostrando no final uma mensagem. 
 * Algoritmo de número 03 do Curso em vídeo.
 * URL: http://www.cursoemvideo.com/wp-content/uploads/2019/08/exercicios-algoritmos.pdf.
*/
import java.util.Scanner;
/* Importa biblioteca Scanner! */
public class salario {
    public static void main(String[] Args) {
        try (Scanner entradaDados = new Scanner(System.in)) {
            System.out.printf("Olá, qual o seu nome? " + "\n");
            String nome = entradaDados.nextLine();
            
            System.out.println("Certo " + nome + " e qual é o seu salário atual?" + "\n");
            float salario = entradaDados.nextFloat();

            System.out.print("O funcioário " + nome + " tem um salário de: " + salario + ".");
        }
    }
}

// Revisão do algoritmo: 31/01/2024.