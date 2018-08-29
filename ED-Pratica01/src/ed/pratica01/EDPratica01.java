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
        int[][] matriz1 = new int[3][4];
        int[][] matriz2 = new int[4][2];

        for (int linha = 0; linha < matriz1.length; linha++) {
            for (int coluna = 0; coluna < matriz1[0].length; coluna++) {

                System.out.println("Digite o numero da matriz 1 ");
                matriz1[linha][coluna] = read.nextInt();
            }
        }
        for (int linha = 0; linha < matriz2.length; linha++) {
            for (int coluna = 0; coluna < matriz2[0].length; coluna++) {

                System.out.println("Digite o numero da matriz 2 ");
                matriz2[linha][coluna] = read.nextInt();
            }
        }

        int[][] matriz3 = new int[3][2];

        for (int linha = 0; linha < matriz3.length; linha++) {
            for (int coluna = 0; coluna < matriz3[0].length; coluna++) {

                    for (int elementoX = 0; elementoX < matriz2.length; elementoX++) {

                            System.out.print(matriz1[linha][elementoX] + " x \t");
                            System.out.print(matriz2[elementoX][coluna] + " =  \t");
                            System.out.println(matriz3[linha][coluna] = matriz3[linha][coluna] + (matriz1[linha][elementoX] * matriz2[elementoX][coluna]));
                            System.out.println("");

                 
                }

            }
            System.out.println("");
        }

        for (int linha = 0; linha < matriz3.length; linha++) {
            for (int coluna = 0; coluna < matriz3[0].length; coluna++) {
                System.out.print(matriz3[linha][coluna] + " \t");
            }
            System.out.println("");
        }
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

    public static void E7() {
        int[][] matriz = new int[3][4];

        String posicaoMaior = "";
        String posicaoMenor = "";

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                System.out.println("Digite o numero");
                matriz[linha][coluna] = read.nextInt();
            }
        }

        int maior = matriz[0][0]; //Integer.MIN_VALUE;
        int menor = matriz[0][0];//Integer.MAX_VALUE;

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                if (matriz[linha][coluna] >= maior) {
                    maior = matriz[linha][coluna];
                    posicaoMaior = "Posição: " + (linha + 1) + "X" + (coluna + 1);
                }
                if (matriz[linha][coluna] > menor) {
                } else {
                    menor = matriz[linha][coluna];
                    posicaoMenor = "Posição: " + (linha + 1) + "X" + (coluna + 1);
                }

            }
        }
        System.out.println("O maior é: " + maior + " e esta na " + posicaoMaior);
        System.out.println("O menor é: " + menor + " e esta na " + posicaoMenor);
    }

    public static void E8() {
        int n = 0;
        boolean sair = false;
        while (!sair) {
            System.out.println("Digite o numero maior que 1 e menor que 6: ");
            n = read.nextInt();
            if (n > 1 && 6 > n) {
                sair = true;
            } else {
                System.out.println("Você não sabe ler ?");
            }
        }

        int[][] matriz = new int[n][n];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                System.out.println("Digite o numero");
                matriz[linha][coluna] = read.nextInt();
            }
        }

        int diagonalPrimaria = 0;
        int diagonalSecundaria = 0;
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                if (coluna == linha) {
                    diagonalPrimaria = diagonalPrimaria + matriz[linha][coluna];
                }
                if (coluna + linha == matriz.length - 1) {
                    diagonalSecundaria = diagonalSecundaria + matriz[linha][coluna];
                }

                System.out.print(matriz[linha][coluna] + " \t");
            }
            System.out.println("");
        }

        System.out.println("diagonal primaria: " + diagonalPrimaria);
        System.out.println("diagonal secundaria:" + diagonalSecundaria);
    }

}
