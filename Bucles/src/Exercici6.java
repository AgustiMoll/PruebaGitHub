import java.util.Scanner;

public class Exercici6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("Introdueix un numero: ");
        numero = sc.nextInt();

        int suma = 0;

        while (numero != 0){
            suma += numero;
            System.out.print("Introdueix un numero: ");
            numero = sc.nextInt();

        }
        System.out.println("La suma de tots els nombres introduits es: " + suma);

    }
}
