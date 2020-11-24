import java.util.Scanner;

public class Exercici4A {

    public void DisplayMode() {
        Scanner valors = new Scanner(System.in);
        System.out.print("Introdueix un valor de l'1 al 7: ");
        int diaSet = valors.nextInt();

        if (diaSet == 1) {
            System.out.println("Dilluns");
        }
        else if (diaSet == 2) {
            System.out.println("Dimarts");
        }
        else if (diaSet == 3) {
            System.out.println("Dimecres");
        }
        else if (diaSet == 4) {
            System.out.println("Dijous");
        }
        else if (diaSet == 5) {
            System.out.println("Divendres");
        }
        else if (diaSet == 6) {
            System.out.println("Dissabte");
        }
        else if (diaSet == 7) {
            System.out.println("Diumenge");
        } else
            System.out.println("Error");


    }
}


