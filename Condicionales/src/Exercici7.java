import java.util.Scanner;

public class Exercici7 {

    public void DisplayMode(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduiex el dia: ");
        int dia = sc.nextInt();

        if (dia == 30){
            System.out.println("Dia correcte");
        } else System.out.println("Dia incorrecte");



        System.out.print("Introduiex el mes: ");
        int mes = sc.nextInt();

        if (mes >=1 && mes <=12){
            System.out.println("Mes correcte");
        } else System.out.println("Mes incorrecte");



        System.out.print("Introduiex el any: ");
        int any = sc.nextInt();

        if (any >=2000 && any <=2020){
            System.out.println("Any correcte");
        } else System.out.println("Any incorrecte");



    }
}
