import java.util.Scanner;

public class VerificadorEstação{
    public static void main(String[] args) {
          //Declaração de variável
          int dia, mês, option = 0;

          //Criação e instância do objeto de entrada
          Scanner entrada = new Scanner(System.in);
    do{
         //Apresentação
         System.out.println("\n\t\t\t -- Descubra a estação do ano! --\n ");

         //Entradas
         System.out.println("Informe o dia do mês: (1 - 31) ");
            dia = entrada.nextInt();

         System.out.print("Informe o mês do ano: (1 - 12) ");
            mês = entrada.nextInt();
        
         //Caso bisonho
        if ((dia > 31 || dia < 1) || (mês > 12 || mês < 1)) {
            System.out.println("Dia ou mês inexistente, digite de novo.");
                continue;
 }
        //Verificação das estações.

        if (dia >=21 && mês == 12 || dia <= 19 && mês == 3)
        System.out.println("Estamos no verão.");

        else if (dia >=20 && mês == 3 || dia <= 19 && mês == 6)
        System.out.println("Estamos no Outono.");

        else if (dia >=20 && mês == 6 || dia <= 21 && mês == 9)
        System.out.println("Estamos no Inverno.");

        else if (dia >=22 && mês == 9 || dia <= 20 && mês == 12)
        System.out.println("Estamos no Primavera.");


    //Continuar depois de saber:
        System.out.print("\nDeseja verificar outra data? (1-Sim / 2-Não): ");
        option = entrada.nextInt();

    }while (option == 1);
    }
}     