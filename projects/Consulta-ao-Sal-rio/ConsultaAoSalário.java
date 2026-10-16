import java.util.*;
import java.lang.Math;

class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Empresa X
        System.out.println("Sistema da Empresa X");

        // Declaração de variáveis
        String nome;
        double salario;
        double salarioi;
        int imposto;

        // Entrada
        System.out.println("Informe seu nome:");
        nome = input.nextLine();
        System.out.println("Olá " + nome + ", informe seu salário:");
        salario = input.nextDouble();

        // Processamento
        if (salario >= 5000) {
            imposto = (int) (salario * 0.2);
            salarioi = salario * 0.8;
            System.out.println("Seu salário teve 20% de imposto retirado.");
            System.out.println("Seu salário atual é: R$" + salarioi + ". E o imposto pago foi de: R$" + imposto);

            // Saída caso tenha sido recolhido imposto
        } else {
            System.out.println("Nada de imposto foi retirado do seu salário.");
            System.out.println("Seu salário atual é: R$" + salario);

            // Saída caso não tenha sido recolhido imposto
        }
    }
}
