import java.util.Scanner;

public class dois {
    
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args){
        int km=0,lt=0;
        float total=0.0f;
        

        System.out.print("Digite quantos km foram percorridos: ");
        km=scan.nextInt();
        System.out.print("Digite quantos litros foram gastos: ");
        lt=scan.nextInt();
        total=km/lt;

        System.out.printf("Voce gastou 1 litro por %.2f kilometro rodado\n",total);

        




        scan.close();
    }
}
