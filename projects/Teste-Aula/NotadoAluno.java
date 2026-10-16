import java.util.*;
import java.lang.Math;

class NotadoAluno {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Sistema de Notas");

        // Declaração de variávei
        String nome;
        int nota;

        // Entrada
        System.out.println("Informe seu nome:");
        nome = input.nextLine();
        System.out.println("Olá, " + nome + "!");
        System.out.println("Informe sua nota:");
        nota = input.nextInt();

        // Processamento
        if (nota >= 50) {
            System.out.println("Parabéns " + nome + ", você está aprovado(a)!");

            // Saída para aluno aprovado
        } else {
            System.out.println(nome + ", você está reprovado(a)...");

            // Saída para aluno reprovado
        }
    }