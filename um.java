import java.util.Scanner;

public class um {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1=0,num2=0;

        System.out.print("Digite um numero ");
        num1=scan.nextInt();

        System.out.print("Digite um segundo numero ");
        num2=scan.nextInt();

        System.out.printf("a soma de " + num1 + " com " + num2 + " e igual a %d%n", num1+num2);
        System.out.printf("a subtracao de " + num1 + " com " + num2 + " e igual a %d%n", num1-num2);
        System.out.printf("a multiplicacao de " + num1 + " com " + num2 + " e igual a %d%n", num1*num2);
        System.out.printf("a divisao de " + num1 + " com " + num2 + " e igual a %d%n", num1/num2);
        










        scan.close();

    }
}
