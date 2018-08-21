/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.pratica01;

import java.util.Scanner;

/**
 *
 * @author re91529z
 */
public class EDPratica01 {

    public static Scanner read = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        E6();

    }

    public void E1() {
        int[][] matriz = new int[2][3];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                System.out.println("Digite o numero");
                matriz[linha][coluna] = read.nextInt();
            }
        }
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + " \t");
            }
            System.out.println("");
        }
    }

    public static void exibeMatriz(int[][] matriz) {

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + " \t");
            }
            System.out.println("");
        }
    }

    public static void E2() {
        int[][] matriz = new int[2][3];
        int[][] matrizA = new int[2][3];
        int[][] matrizB = new int[2][3];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.println("Digite o numero");
                matrizA[linha][coluna] = read.nextInt();
                System.out.println("Digite o numero");
                matrizB[linha][coluna] = read.nextInt();
            }
        }
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                matriz[linha][coluna] = matrizB[linha][coluna] + matrizA[linha][coluna];
            }
        }
        System.out.println("Resultado");
        exibeMatriz(matriz);
    }

    public static void E3() {
        int[][] matriz = new int[3][3];
        int[] vetor = new int[3];
        int soma = 0;

        for (int coluna = 0; coluna < matriz[0].length; coluna++) {

            for (int linha = 0; linha < matriz.length; linha++) {
                System.out.println("Digite o numero");
                matriz[linha][coluna] = read.nextInt();
                soma = soma + matriz[linha][coluna];

            }

            vetor[coluna] = soma;
            soma = 0;
        }

        System.out.println("Resultado");
        exibeMatriz(matriz);

        for (int linha = 0; linha < vetor.length; linha++) {

            System.out.print(vetor[linha] + " \t");

        }
    }

    public static void E4() {
        String[][] matriz = new String[5][2];
        String pesquisa = "";

        for (int linha = 0; linha < matriz.length; linha++) {

            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                switch (coluna) {
                    case 0:
                        System.out.println("Digite o nome dos contatos");
                        break;
                    case 1:
                        System.out.println("Digite o numero dos contatos");
                        break;
                }
                matriz[linha][coluna] = read.nextLine();

            }
        }
        System.out.println("Digite o nome ");
        pesquisa = read.nextLine();
        for (int linha = 0; linha < matriz.length; linha++) {
            if (matriz[linha][0].equals(pesquisa)) {

                System.out.println("onumero do" + pesquisa + " é " + matriz[linha][1]);

            } else {
                System.out.println("Nome não encontrado");
                break;
            }

        }

    }

    public static void E5() {
        int[][] matriz = new int[4][2];
        int[] vetorA = new int[4];
        int[] vetorB = new int[4];

        for (int linha = 0; linha < vetorA.length; linha++) {
            System.out.println("Digite os numeros da primeira coluna");
            vetorA[linha] = read.nextInt();
            matriz[linha][0] = vetorA[linha];
        }
        for (int linha = 0; linha < vetorB.length; linha++) {
            System.out.println("Digite os numeros da Segunda coluna");
            vetorB[linha] = read.nextInt();
            matriz[linha][1] = vetorB[linha];
        }

        System.out.println("Resultado");

        exibeMatriz(matriz);
    }

    public static void exibeNum10a20(int[][] matriz) {
        int soma = 0;
        int total = 0;
        int somaPares = 0;
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                if (matriz[linha][coluna] < 21 && 9 < matriz[linha][coluna]) {
                    soma = soma + 1;
                }
            }
            System.out.println("na linha " + (linha + 1) + " tem " + soma + " numeros entre 10 e 20");
            System.out.println("");
            soma = 0;
        }

    }

    public static void E6() {
        System.out.println("Digite o numero de colunas");
        int numeroColunas = read.nextInt();

        System.out.println("Digite o numero de Linhas");
        int numeroLinhas = read.nextInt();

        int[][] matriz = new int[numeroColunas][numeroLinhas];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                System.out.println("Digite o numero");
                matriz[linha][coluna] = read.nextInt();
            }
        }
        exibeNum10a20(matriz);
        System.out.println("A Media é " + mediaPares(matriz));

    }

    public static int mediaPares(int[][] matriz) {
        int soma = 0;
        int total = 0;
        int somaPares = 0;
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                if (matriz[linha][coluna] < 21 && 9 < matriz[linha][coluna]) {
                    soma = soma + 1;
                    somaPares = somaPares + matriz[linha][coluna];
                }
            }
            total = total + soma;
            soma = 0;
        }

        return somaPares / total;
    }
}
