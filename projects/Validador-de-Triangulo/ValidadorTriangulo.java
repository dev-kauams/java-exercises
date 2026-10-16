import java.util.Scanner;

public class ValidadorTriangulo{
    public static void main(String[] args) {
        // Declaração de Variáveis
        int a, b, c;

        // Instancia
        Scanner entrada = new Scanner(System.in);

        // Home
        System.out.println("\n\t\t\t Validador de Triangulos\n");
        System.out.println("-- O Melhor Validador de Triangulos da face da Terra -- by:Sans_");

        // Entradas
        System.out.print(" Informe lado 'a':");
        a = entrada.nextInt();

        System.out.print("Informe lado 'b':");
        b = entrada.nextInt();

        System.out.print("Informe lado 'c':");
        c = entrada.nextInt();

        // Processamento

        if( (a < (b+c) && (b < (a+c) && (c < (a+b))))) {
                System.out.printf("Olha!%d, %d e %d formam um triângulo!", a, b, c);
        } else {
            System.out.printf("\n\n Vixe...%d, %d e %d f não formam um triângulo.\n", a, b, c);
        }

    }
        
        
    
}