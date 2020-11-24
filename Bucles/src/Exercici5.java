import java.util.Scanner;

public class Exercici5 {

    public static void main(String[] args) {
        Scanner numin = new Scanner(System.in);
        int numero;
        System.out.print("Introdueix un numero: ");
        numero = numin.nextInt();

        int intentos = 0;

        while (numero >= 0){
            intentos++;
            System.out.print("Introdueix un numero: ");
            numero = numin.nextInt();
        }
        System.out.println("Numero de intentos: " + intentos);


        }

        }



