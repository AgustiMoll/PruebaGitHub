import java.util.Scanner;

public class Exercici3 {

    public void DisplayMode() {
        Scanner innum = new Scanner(System.in);
        System.out.print("Introduce el primer numero: ");
        int numero1 = innum.nextInt();

        System.out.print("Introduce el segundo numero: ");
        int numero2 = innum.nextInt();

        if(numero1 > numero2){
            System.out.println("El primer numero es major");
        }
        else if(numero1 < numero2){
            System.out.println("El segon numero es major");
        }
        else
            System.out.println("Els numeros son iguals");


    }
}
