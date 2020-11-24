import java.util.Scanner;

public class Exercici7 {

    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdueix un nombre: ");
        int numero = scanner.nextInt();
        int suma = 0;
        double mitjana = 0;
        int contador = 0;

        while (numero != 0){
            contador++;
            suma += numero;
            System.out.print("Introdueix un nombre: ");
            numero = scanner.nextInt();
        }

        mitjana = suma / contador;

        System.out.println("La mitjana es: " + mitjana);
    }

}
