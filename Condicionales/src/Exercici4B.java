import java.util.Scanner;

public class Exercici4B {

    public void DisplayMode() {
        Scanner valors = new Scanner(System.in);
        System.out.print("Introdueix un valor de l'1 al 7: ");
        int diaSet = valors.nextInt();


        switch (diaSet){
            case 1:
                System.out.println("Dilluns");
                break;
            case 2:
                System.out.println("Dimarts");
                break;
            case 3:
                System.out.println("Dimecres");
                break;
            case 4:
                System.out.println("Dijous");
                break;
            case 5:
                System.out.println("Divendres");
                break;
            case 6:
                System.out.println("Dissabte");
                break;
            case 7:
                System.out.println("Diumenge");
                break;
            default:
                System.out.println("Dia erroni");



        }
    }
}
