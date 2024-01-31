/*
 * Exercício livro Caelum.
 * 1 - Variáveis e tipos primitivos.
 * Na  empresa  em  que trabalhamos,  há tabelas  com  o  gasto  de  cada mês. Para fechar  o  balanço  do primeiro trimestre, precisamos somar o gasto total.
 * Sabendo que, em janeiro, foram gastos 15 mil reais, em fevereiro, 23 mil reais e, em março,
 * 17 mil reais, faça um programa que calcule e imprima a despesa total no trimestre e a média mensal de gastos.
 */

import java.util.Scanner;
//importa modulo Scanner.

public class balancoGastos {
    public static void main(String[] Args) {
        try (Scanner entradaDados = new Scanner(System.in)) {
            System.out.printf("Qual é o valor gasto em Janeiro?" + "\n");
            float gastoJaneiro = entradaDados.nextFloat();

            System.out.printf("Qual é o valor gasto em Fevereiro?" + "\n");
            float gastoFevereiro = entradaDados.nextFloat();

            System.out.printf("Qual é o valor gasto em Março?" + "\n");
            float gastoMarço = entradaDados.nextFloat();

            float gastoTotal = gastoJaneiro + gastoFevereiro + gastoMarço;
            float mediaGeral = gastoTotal / 3;

            System.out.printf("A despesa total do trimestre foi de: " + gastoTotal + "\n" + "E a media geral é de " + mediaGeral);
        }
    }
}

/* Porque não declarei variaveis do tipo "int"?
 * Para poder atribuir valores maiores no input de entrada de dados, prefiri utilizar dados do tipo float para considerar valores que não são exatos, mesmo considerando
 * que o algoritmo sejá simples.
 * Revisão do algoritmo: 30/01/2024.
 */