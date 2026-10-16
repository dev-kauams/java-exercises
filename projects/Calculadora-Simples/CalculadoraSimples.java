import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        //  Declaração de Variáveis
        int n1, n2, total, op;

        // Criação e Instância do Obj. de Entrada
        Scanner entrada = new Scanner(System.in);

        do{
            // Apresentação
            System.out.println("\n\t\t\t -- Calculadora Simples --\n");

            // Menu
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Sair");

            System.out.print("Opção: ");
            op = entrada.nextInt();

            switch(op){
            //if (op == 1) { obsoleto
                case 1:
                    // Entrada
                    System.out.println("Soma Simples: ");
                    System.out.println("Informe um número:");
                    n1 = entrada.nextInt();
                    System.out.println("Informe outro número:");
                    n2 = entrada.nextInt();

                    // Processamento
                    total = n1 + n2;

                    // Saída
                    System.out.println("O Calculo é: " + n1 + " + " + n2 + " = " + total);
                    break;
            //}

            //if (op == 2) {
                case 2:
                    // Entrada
                    System.out.println("Subtração Simples: ");
                    System.out.println("Informe um número:");
                    n1 = entrada.nextInt();
                    System.out.println("Informe outro número:");
                    n2 = entrada.nextInt();

                    // Processamento
                    total = n1 - n2;

                    // Saída
                    System.out.println("O Calculo é: " + n1 + " - " + n2 + " = " + total);
                    break;
            //}
            //if (op == 3) {
                case 3:
                    System.out.println("\n Forte Abraço");
                    break;
            //}
            //else if(op >= 3) {
                default:
                    System.out.println("Escolha uma opção correta...");

            //}
            }

        }while(op != 3);

    }    
}
