import java.util.Scanner;

public class Exercici2 {
    public static void main(String[] args) {
        Scanner numin = new Scanner(System.in);
        int numero;

        System.out.print("Introdueix un numero: ");
        numero = numin.nextInt();

        while (numero >= 0) {
            System.out.print("Introdueix un altre nombre: ");
            numero = numin.nextInt();
        }


    }

}



