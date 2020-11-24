import java.util.Scanner;

public class Exercici1 {

    public static void main(String[] args){
        Scanner numin = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num = numin.nextInt();

        int respaldo = -1;

        while (num > respaldo){
            respaldo++;
            System.out.println(respaldo);

        }
    }
}
