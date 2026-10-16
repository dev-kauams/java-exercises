import java.util.Scanner;

public class DataeSigno{
    public static void main(String[] args) {
        //Declaração de variável
        int dia, mês, option = 0;

        //Criação e instância do objeto de entrada
        Scanner entrada = new Scanner(System.in);
    do{
        //Apresentação
        System.out.println("\n\t\t\t -- Descubra o seu signo! --\n ");

        //Entradas
        System.out.print("Informe o dia do seu nascimento: (1 - 31) ");
        dia = entrada.nextInt();

        System.out.print("Informe o mês do seu nascimento: (1 - 12) ");
        mês = entrada.nextInt();

        //Caso bisonho
        if ((dia > 31 || dia < 1) || (mês > 12 || mês < 1)) {
            System.out.println("Dia ou mês inexistente, digite de novo.");
            continue;
        }
        //Saída dos meses.

        if (dia >=21 && mês == 3 || dia <= 19 && mês == 4)
            System.out.println("Você é do signo de Áries.");

            else if(dia >=20 && mês == 4 || dia <= 20 && mês == 5)
            System.out.println("Você é do signo de Touro.");

            else if(dia >=21 && mês == 5 || dia <= 20 && mês == 6)
            System.out.println("Você é do signo de Gêmeos.");

            else if(dia >=22 && mês == 6 || dia <= 22 && mês == 7)
            System.out.println("Você é do signo de Câncer");

            else if(dia >=23 && mês == 7 || dia <= 22 && mês == 8)
            System.out.println("Você é do signo de Leão.");

            else if(dia >=23 && mês == 8 || dia <= 22 && mês == 9)
            System.out.println("Você é do signo de Virgem.");

            else if(dia >=23 && mês == 9 || dia <= 22 && mês == 10)
            System.out.println("Você é do signo de Libra.");

            else if(dia >=23 && mês == 10 || dia <= 21 && mês == 11)
            System.out.println("Você é do signo de Escorpião.");

            else if(dia >=22 && mês == 11 || dia <= 21 && mês == 12)
            System.out.println("Você é do signo de Sagitário.");

            else if(dia >= 22 && mês == 12 || dia <= 19 && mês == 1)
            System.out.println("Você é do signo de Capricórnio.");

            else if(dia >=20 && mês == 1 || dia <= 18 && mês == 2)
            System.out.println("Você é do signo de Aquário.");

            else if(dia >=19 && mês == 2 || dia <= 20 && mês == 3)
            System.out.println("Você é do signo de Peixes.");
         

        //Continuar depois do signo for escolhido.
            System.out.print("\nDeseja verificar outro signo? (1-Sim / 2-Não): ");
            option = entrada.nextInt();
    
        }while (option == 1); // 
        
        entrada.close();
        System.out.println("Programa encerrado. Até mais, meu chapinha!");
    }
}