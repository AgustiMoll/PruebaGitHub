import java.util.Scanner;

public class Exercici2 {

    public void DisplayMode() {

        Scanner innum = new Scanner(System.in);
        System.out.print("Introduiex un numero: ");
        int numero = innum.nextInt();


        if (numero % 2 == 0){
            System.out.println("El numero es par");
        } else System.out.println("Es impar");

    }
}
