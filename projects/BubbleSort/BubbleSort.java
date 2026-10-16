import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        // Declaração de Variáveis
        int zero, um;
        
        // Declaração de Entrada
        Scanner entrada = new Scanner(System.in);

        // Início
        System.out.println("-- Bubble Sort --\n");
        System.out.println("by: Sans\n");

        // Entrada
        System.out.print("Informe n1:");
        zero = entrada.nextInt();

        System.out.print("Informe n2:");
        um = entrada.nextInt();

        // Processamento
        if(zero > um){
            int swap = um;
            um = zero;
            zero = swap;
        }

        // Saída
        System.out.println("\n" + zero + ", " + um);
    }
}

        