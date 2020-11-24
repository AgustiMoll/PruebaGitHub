import java.util.Scanner;

public class Exercici10 {

    public void DisplayMode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        if (edad >= 0 && edad <= 17){
            System.out.println("Eres menor de edad.");
        } else if (edad >= 18 && edad <= 125){
            System.out.println("Eres mayor de edad");
        } else System.out.println("Edad incorrecta.");



    }
}
