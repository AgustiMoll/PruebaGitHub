import java.util.Scanner;

public class Exercici9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Intenta endivinar en nombre: ");
        int numero = sc.nextInt();

        int numeroOcult = 93;

        while (numero != numeroOcult){
            if (numero > numeroOcult){
                System.out.println("El numero es major");
                System.out.print("Torna a introduir un nombre: ");
                numero = sc.nextInt();
            } else {
                System.out.println("El numero es menor");
                System.out.print("Torna a introduir un nombre: ");
                numero = sc.nextInt();
            }


        }
        System.out.println("Correcte");

    }
}