
import java.util.Scanner;

public class Exercici8 {

    public void DisplayMode() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduiex el any: ");
        int any = sc.nextInt();

        System.out.print("Introduiex el mes: ");
        int mes = sc.nextInt();

        System.out.print("Introduiex el dia: ");
        int dia = sc.nextInt();



        if (any >= 1900 && any <= 2020) {
            System.out.println("Any correcte");
        } else System.out.println("Any incorrecte");


        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("Mes correcte");
                if (dia >= 1 && dia <= 31) {
                    System.out.println("Dia valid");
                } else System.out.println("Dia no valid");
                break;

            case 4: case 6: case 9: case 11:
                System.out.println("Mes correcte");
                if (dia >= 1 && dia <= 30) {
                    System.out.println("Dia valid");
                } else System.out.println("Dia no valid");
                break;

            case 2:
                System.out.println("Mes correcte");
                if (dia >= 1 && dia <=28) {
                    System.out.println("Dia valid");
                } else System.out.println("Dia no valid");
                break;

            default:
                System.out.println("Mes incorrecte");
        }
    }
}


