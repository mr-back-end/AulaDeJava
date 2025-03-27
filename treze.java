import java.util.Scanner;

public class treze {
    public static void main(String[] args) {
        // Criação do objeto Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário o nome
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        // Solicita a altura
        System.out.print("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();
        
        // Solicita o sexo
        System.out.print("Digite seu sexo (M para masculino, F para feminino): ");
        char sexo = scanner.next().toUpperCase().charAt(0);
        
        // Variável para armazenar o peso ideal
        double pesoIdeal;
        
        // Cálculo do peso ideal com base no sexo
        if (sexo == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido. Por favor, insira 'M' ou 'F'.");
            scanner.close();
            return; // Encerra o programa se o sexo for inválido
        }
        
        // Exibe o resultado
        System.out.printf("O peso ideal de %s é: %.2f kg%n", nome, pesoIdeal);
        
        // Fecha o scanner
        scanner.close();
    }
}