import java.util.Scanner;

public class oito {
    public static void main(String[] args) {
        int anos = 0, meses = 0, dias = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Diga sua idade em anos meses e dias");

        System.out.print("anos: ");
        anos = scan.nextInt();

        System.out.print("meses: ");
        meses = scan.nextInt();

        System.out.print("dias: ");
        dias = scan.nextInt();

        System.out.printf("Numero de dias vivido: %d \n",(anos * 365)+(meses*30)+dias);

        scan.close();
    }
}
