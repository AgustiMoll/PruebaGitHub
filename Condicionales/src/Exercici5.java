import java.util.Scanner;

public class Exercici5 {

    public void DisplayMode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriu una hora: ");
        int hora = sc.nextInt();

        switch (hora) {
            case 8: case 9: case 10: case 11:
                System.out.println("Mati");
                break;

            case 12: case 13: case 14: case 15: case 16:
                System.out.println("Mitjdia");
                break;

            case 17: case 18: case 19: case 20:
                System.out.println("Capvespres");
                break;

            case 21: case 22: case 23:
                System.out.println("Vespre");
                break;
            default:
                System.out.println("Valor erroni");




        }


    }
}
