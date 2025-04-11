
import java.util.Scanner;

public class CalculoComissao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float vendasTotal = 0;
        int totalClientes = 0;
        int diasTrabalhados;

        System.out.println("=====================================================");
        System.out.println("            CÁLCULO COMISSÃO FUNCIONÁRIOS            ");
        System.out.println("=====================================================");

        do {
            System.out.print("Informe a quantidade de dias para o cálculo da comissão: ");
            diasTrabalhados = scanner.nextInt();

            if (diasTrabalhados <= 0) {
                System.out.println("Quantidade de dias inválido! Digite um valor maior que zero. \n");
            }

        } while (diasTrabalhados <=0);

        for (int loop = 1; loop <= diasTrabalhados; loop++) {

            System.out.printf("Informe quantos clientes entraram no %d° dia: " , loop);
            int clientes = scanner.nextInt();

            System.out.print("Informe a quantidade de lampadas vendidas: ");
            int quantLampadas = scanner.nextInt();

            System.out.print("Infome o preço de cada lâmpadas vendida: ");
            float precoLampada = scanner.nextFloat();

            totalClientes += clientes;
            vendasTotal += precoLampada * quantLampadas;
        }
        float mediaDiaria = vendasTotal / diasTrabalhados;
        System.out.println("================================================");

        if (mediaDiaria >= 500 ){
            System.out.println("Meta batida! Todos os funcionários serão bonificados.");
        }else{
            System.out.println("Meta não atingida!");
        }
        System.out.println("A quantidade de clientes atendidos: " + totalClientes);
        System.out.printf("O total vendido foi de R$ %.2f e a média diária durante os %d dias foi de R$ %.2f\n" , vendasTotal, diasTrabalhados, mediaDiaria);
        System.out.println("================================================");

        scanner.close();

    }

}
