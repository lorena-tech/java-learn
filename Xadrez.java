//CÓDIGO EM CONSTRUÇÃO//

import java.util.Scanner;

public class xadrez {
    public static void main(String[] args) {
        
        char[][] tabuleiro = {{' ', ' ', ' ',' ', ' ', ' ',' ', ' '},{' ', ' ', ' ',' ', ' ', ' ',' ', ' '},{' ', ' ', ' ',' ', ' ', ' ',' ', ' '},{' ', ' ', ' ',' ', ' ', ' ',' ', ' '},{' ', ' ', ' ',' ', ' ', ' ',' ', ' '},{' ', ' ', ' ',' ', ' ', ' ',' ', ' '},{' ', ' ', ' ',' ', ' ', ' ',' ', ' '},{' ', ' ', ' ',' ', ' ', ' ',' ', ' '}};
        String jogador = "brancas";
        int linha, coluna;

        while(true) {
            System.out.println("  1 2 3 4 5 6 7 8");
            System.out.println("A "+tabuleiro[0][0]+"|"+tabuleiro[0][1]+"|"+tabuleiro[0][2]+"|"+tabuleiro[0][3]+"|"+tabuleiro[0][4]+"|"+tabuleiro[0][5]+"|"+tabuleiro[0][6]+"|"+tabuleiro[0][7]);
            System.out.println("  ---------");
            System.out.println("B "+tabuleiro[1][0]+"|"+tabuleiro[1][1]+"|"+tabuleiro[1][2]+"|"+tabuleiro[1][3]+"|"+tabuleiro[1][4]+"|"+tabuleiro[1][5]+"|"+tabuleiro[1][6]+"|"+tabuleiro[1][7]);
            System.out.println("  ---------");
            System.out.println("C "+tabuleiro[2][0]+"|"+tabuleiro[2][1]+"|"+tabuleiro[2][2]+"|"+tabuleiro[2][3]+"|"+tabuleiro[2][4]+"|"+tabuleiro[2][5]+"|"+tabuleiro[2][6]+"|"+tabuleiro[2][7]);
            System.out.println("  ---------");
            System.out.println("D "+tabuleiro[3][0]+"|"+tabuleiro[3][1]+"|"+tabuleiro[3][2]+"|"+tabuleiro[3][3]+"|"+tabuleiro[3][4]+"|"+tabuleiro[3][5]+"|"+tabuleiro[3][6]+"|"+tabuleiro[3][7]);
            System.out.println("  ---------");
            System.out.println("E "+tabuleiro[4][0]+"|"+tabuleiro[4][1]+"|"+tabuleiro[4][2]+"|"+tabuleiro[4][3]+"|"+tabuleiro[4][4]+"|"+tabuleiro[4][5]+"|"+tabuleiro[4][6]+"|"+tabuleiro[4][7]);
            System.out.println("  ---------");
            System.out.println("F "+tabuleiro[5][0]+"|"+tabuleiro[5][1]+"|"+tabuleiro[5][2]+"|"+tabuleiro[5][3]+"|"+tabuleiro[5][4]+"|"+tabuleiro[5][5]+"|"+tabuleiro[5][6]+"|"+tabuleiro[5][7]);
            System.out.println("  ---------");
            System.out.println("G "+tabuleiro[6][0]+"|"+tabuleiro[6][1]+"|"+tabuleiro[6][2]+"|"+tabuleiro[6][3]+"|"+tabuleiro[6][4]+"|"+tabuleiro[6][5]+"|"+tabuleiro[6][6]+"|"+tabuleiro[6][7]);
            System.out.println("  ---------");
            System.out.println("H "+tabuleiro[7][0]+"|"+tabuleiro[7][1]+"|"+tabuleiro[7][2]+"|"+tabuleiro[7][3]+"|"+tabuleiro[7][4]+"|"+tabuleiro[7][5]+"|"+tabuleiro[7][6]+"|"+tabuleiro[7][7]);
            
            //define o jogador da vez e o local onde será incluída a peça

            System.out.println("Vez do jogador "+jogador+".");
            System.out.print("Digite a linha: ");
            linha = scanner.nextInt();
            System.out.print("Digite a coluna: ");
            coluna = scanner.nextInt();

            //define os limites do tabuleiro utilizado para o jogo

            if(linha < 0 || linha > 7 || coluna < 0 || coluna > 7 || tabuleiro[linha][coluna] != ' ') {
                System.out.println("Jogada inválida.");
                continue;
            }

            tabuleiro[linha][coluna] = jogador;

            //determina condições para vencer

            

            // alterna os jogadores entre brancas e pretas

            if (jogador == "brancas") {
                jogador = "pretas";
            }    
            else {
               jogador = "brancas";
            
            }
        }
    }
}
