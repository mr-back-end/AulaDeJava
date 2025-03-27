import java.util.Scanner;

public class quatorze {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
       
        final double PRECO_ALCOOL = 2.90;
        final double PRECO_GASOLINA = 3.30;
        
      
        System.out.print("Digite o número de litros vendidos: ");
        double litros = scanner.nextDouble();
        
      
        System.out.print("Digite o tipo de combustível (A para álcool, G para gasolina): ");
        char tipoCombustivel = scanner.next().toUpperCase().charAt(0);
        
      
        double precoFinal;
        

        if (tipoCombustivel == 'A') {
        
            double desconto = (litros <= 20) ? 0.03 : 0.05; 
            precoFinal = litros * PRECO_ALCOOL * (1 - desconto);
        } else if (tipoCombustivel == 'G') {
       
            double desconto = (litros <= 20) ? 0.04 : 0.06; 
            precoFinal = litros * PRECO_GASOLINA * (1 - desconto);
        } else {
            System.out.println("Tipo de combustível inválido. Por favor, insira 'A' ou 'G'.");
            scanner.close();
            return;
        }
        
   
        System.out.printf("O valor a ser pago é: R$ %.2f%n", precoFinal);
        
       
        scanner.close();
    }
}
