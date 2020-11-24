import java.util.Scanner;

public class Exercici11 {

    public void DisplayMode(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduiex la quantitat de dobes: ");
        int dobes = sc.nextInt();
        int dobesInicials = dobes;

        int bill50 = dobes / 50;
        dobes = dobes - (bill50 * 50);

        int bill20 = dobes / 20;
        dobes = dobes - (bill20 * 20);

        int bill10 = dobes / 10;
        dobes = dobes - (bill10 * 10);

        int bill5 = dobes / 5;
        dobes = dobes - (bill5 * 5);

        int mon2 = dobes / 2;
        dobes = dobes - (mon2 * 2);

        int mon1 = dobes / 1;
        dobes = dobes - (mon1 * 1);

        System.out.println("Si tenim " + dobesInicials + " el nostre canvi sera: " + bill50 + " billets de 50€, " + bill20 +
                " billets de 20€, " + bill10 + " billets de 10€, " + bill5 + " billets de 5€, \n"
                + mon2 + " monedes de 2€ i " + mon1 + " monedes de 1€.");


    }
}
