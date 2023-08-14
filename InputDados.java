import java.util.Scanner;

class InputDados{
    public static void main(String[] args){
        //a linha seguinte cria um scanner que ajuda a ler as informações colocadas pelo usuário
        Scanner ler = new Scanner(System.in);

        //esta linha está declarando a variável
        String nome;

        System.out.printf("Por favor, insira seu nome: \n");
        nome = ler.next();
        
        System.out.println("Seja Bem Vind@ " + nome);
    }
}