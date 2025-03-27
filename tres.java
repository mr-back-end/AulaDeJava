import java.util.Scanner;

public class tres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome="";
        float sal=0.0f;
        float vendas=0.0f,total=0.0f,comi=0.0f;     

         System.out.println("Diga seu nome: ");
         nome=scan.nextLine();
         System.out.println("Quanto voce ganha: ");
         sal=scan.nextFloat();
         System.out.println("quanto ganhou em venda: ");
         vendas=scan.nextFloat();
         comi=vendas*0.15f;
         total=sal+comi;
         System.out.printf("Vendedor %s, seu salario e %.2f seu salario total sera igual a %.2f ",nome,sal,total);
        

        scan.close();
    }
}
