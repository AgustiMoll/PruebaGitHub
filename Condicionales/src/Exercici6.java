import java.util.Scanner;

public class Exercici6 {

    public void DisplayMode(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Indrodueix la teva nota: ");
        int nota = sc.nextInt();

        switch (nota){
            case 0: case 1: case 2: case 3: case 4:
                System.out.println("Insuficient");
                break;

            case 5:
                System.out.println("Suficient");
                break;

            case 6:
                System.out.println("Bé");
                break;

            case 7: case 8:
                System.out.println("Notable");
                break;

            case 9: case 10:
                System.out.println("Exelent");
                break;
            default:

        }

    }
}
