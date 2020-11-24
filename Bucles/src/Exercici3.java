import java.util.Scanner;

public class Exercici3 {
    public static void main(String[] args) {
        Scanner numin = new Scanner(System.in);
        int numero;
        System.out.print("Introduzca un numero: ");
        numero = numin.nextInt();

        while (numero != 0) {
            if (numero > 0){
                System.out.print("ERROR, es positiu. Introdueix un altre nombre: ");
                numero = numin.nextInt();
            } else if (numero < 0){
                System.out.print("ERROR, es negatiu. Introdueix un altre nombre: ");
                numero = numin.nextInt();
            } else {
                System.out.print("Correcte.");
            }

        }

    }
}


