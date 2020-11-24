import java.util.Scanner;

public class Exercici9 {

    public void DisplayMode() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el segundo numero: ");
        int num2 = sc.nextInt();

        System.out.print("Introduce el tercer numero: ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3 && num2 > num3) {
            System.out.println(num1 + " " + num2 + " " + num3);
        } else if (num1 > num2 && num1 > num3 && num3 > num2) {
            System.out.println(num1 + " " + num3 + " " + num2);
        } else if (num2 > num1 && num2 > num3 && num1 > num3) {
            System.out.println(num2 + " " + num1 + " " + num3);
        } else if (num2 > num1 && num2 > num3 && num3 > num1) {
            System.out.println(num2 + " " + num3 + " " + num1);
        } else if (num3 > num2 && num3 > num1 && num1 > num2) {
            System.out.println(num3 + " " + num1 + " " + num2);
        } else if (num3 > num2 && num3 > num1 && num2 > num1) {
            System.out.println(num3 + " " + num2 + " " + num1);
        }

    }
}




