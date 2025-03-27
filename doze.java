import java.util.Scanner;

public class doze {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Digite o número de carros vendidos: ");
        int numeroCarrosVendidos = scanner.nextInt();
        
      
        System.out.print("Digite o valor total das vendas: R$ ");
        double valorTotalVendas = scanner.nextDouble();
        
        
        System.out.print("Digite o salário fixo do vendedor: R$ ");
        double salarioFixo = scanner.nextDouble();
        
        
        System.out.print("Digite o valor da comissão por carro vendido: R$ ");
        double comissaoPorCarro = scanner.nextDouble();
        
        
        double comissaoTotal = (numeroCarrosVendidos * comissaoPorCarro) + (valorTotalVendas * 0.05);
        double salarioFinal = salarioFixo + comissaoTotal;
        
       
        System.out.printf("O salário final do vendedor é: R$ %.2f%n", salarioFinal);
        
        
        scanner.close();
    }
}
