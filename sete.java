import java.util.Scanner;

public class sete {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0;
        boolean foi = true;

     while(foi){
         try{
                System.out.print("Diga um numero inteiro:");
                a = scan.nextInt();

                System.out.printf("O antecessor de %d e %d",a,a-1);
                foi = false;
         }catch(Exception e){
                System.out.println("Erro faca de novo");
                scan.next();
            }
    }

     scan.close();
 }
}