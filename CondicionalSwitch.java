//Estruturas condicionais

//Condicional Switch
import java.util.Scanner;

class CalcularDesconto {
    public static void main(String[] args) {
        int estoque = 100;

        if (estoque >= 100) {
	        System.out.println("Produto com quantidade suficiente.");
        } else if (estoque < 100 && estoque > 50) {
	        System.out.println("Alerta: Avaliar possibilidade de novo pedido.");
        } else {
	       System.out.println("ATENCAO! Faca um novo pedido.");
        }
    }
}