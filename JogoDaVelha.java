import java.util.Scanner;

public class JogoVelha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] quadro = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        char jogador = 'X';
        int linha, coluna;

        while(true) {
            System.out.println("  0 1 2");
            System.out.println("0 "+quadro[0][0]+"|"+quadro[0][1]+"|"+quadro[0][2]);
            System.out.println("  -+-+-");
            System.out.println("1 "+quadro[1][0]+"|"+quadro[1][1]+"|"+quadro[1][2]);
            System.out.println("  -+-+-");
            System.out.println("2 "+quadro[2][0]+"|"+quadro[2][1]+"|"+quadro[2][2]);

            System.out.println("Vez do jogador "+jogador+".");
            System.out.print("Digite a linha: ");
            linha = scanner.nextInt();
            System.out.print("Digite a coluna: ");
            coluna = scanner.nextInt();

            //define os limites do quadro utilizado para o jogo

            if(linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || quadro[linha][coluna] != ' ') {
                System.out.println("Jogada inválida.");
                continue;
            }

            quadro[linha][coluna] = jogador;

            //determina condições para vencer

            if(quadro[0][0] == jogador && quadro[0][1] == jogador && quadro[0][2] == jogador ||
            quadro[1][0] == jogador && quadro[1][1] == jogador && quadro[1][2] == jogador ||
            quadro[2][0] == jogador && quadro[2][1] == jogador && quadro[2][2] == jogador ||
            quadro[0][0] == jogador && quadro[1][0] == jogador && quadro[2][0] == jogador ||
            quadro[0][1] == jogador && quadro[1][1] == jogador && quadro[2][1] == jogador ||
            quadro[0][2] == jogador && quadro[1][2] == jogador && quadro[2][2] == jogador ||
            quadro[0][0] == jogador && quadro[1][1] == jogador && quadro[2][2] == jogador ||
            quadro[0][2] == jogador && quadro[1][1] == jogador && quadro[2][0] == jogador) {
                System.out.println("Jogador "+jogador+" venceu!");
                break;
            }

            // alterna os jogadores entre X e O

            if (jogador == 'X') {
                jogador = 'O';
            }    
            else {
               jogador = 'X';
            
            }


        }

    }
}
