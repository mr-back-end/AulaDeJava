import java.util.Scanner;

public class seis {
    public static void main(String[] args) {
        float kmpl = 0.0f, kms = 0.0f, precrl = 0.0f;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite os Km/L: ");
        kmpl = scan.nextFloat();

        System.out.print("Digite os Km: ");
        kms = scan.nextFloat();

        System.out.print("Digite o preco por L: R$");
        precrl = scan.nextFloat();

        System.out.printf("O preco total da viajem sera R$ %.2f\n",(kms/kmpl)*precrl);

        scan.close();
    }
}