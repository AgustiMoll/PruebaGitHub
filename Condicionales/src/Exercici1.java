import java.util.Scanner;

public class Exercici1 {

    public void DisplayMode() {

        Scanner innum = new Scanner(System.in);
        System.out.print("Introduiex un numero: ");
        int numero = innum.nextInt();

        if (numero > 0) {
            System.out.println("Es positiu");
        }
        else if (numero < 0) {
            System.out.println("Es negatiu");
        } else
            System.out.println("Es 0");


    }

}

