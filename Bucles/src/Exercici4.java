import java.util.Scanner;

public class Exercici4 {

    public static void main(String[] args) {
        Scanner numin = new Scanner(System.in);
        int numero;
        System.out.print("Introdueix un numero multiple de dos: ");
        numero = numin.nextInt();

        while (numero % 2 != 0) {
            System.out.print("Incorrecte. Introdueix un altre numero");
            numero = numin.nextInt();
        }
    }
}
