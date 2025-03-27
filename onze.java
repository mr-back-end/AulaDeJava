import java.util.Scanner;

public class onze {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o custo de fábrica do carro: R$ ");
        double custoFabrica = scanner.nextDouble();
        
        double percentualDistribuidor = 0.28; 
        double percentualImpostos = 0.45; 
        
        double custoDistribuidor = custoFabrica * percentualDistribuidor;
        double custoImpostos = custoFabrica * percentualImpostos;
        double custoFinal = custoFabrica + custoDistribuidor + custoImpostos;
        
        System.out.printf("O custo final ao consumidor é: R$ %.2f%n", custoFinal);
        
        scanner.close();
    }
}
