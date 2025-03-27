import java.util.Scanner;

public class quatro {
    static Scanner scan = new Scanner(System.in);
 
    public static void main(String[] args){

    float base=0.0f,altura=0.0f,area=0.0f;

    System.out.print("Me de o tamanho da base: ");
    base=scan.nextFloat();

    System.out.print("Me de o tamanho da altura: ");
    altura=scan.nextFloat();
    
    area=base*altura;
    System.out.format("A area do retangulo e igual a %.2f ",area);

 }


}