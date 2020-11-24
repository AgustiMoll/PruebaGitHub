import java.util.Scanner;

public class Exercici4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = 3;
        int suma = 0;
        int [] num = new int[N];

        for (int i = 0; i < num.length; i++){
            System.out.print("Introdueix un numero: ");
            num[i] = sc.nextInt();
        }

        for (int i = 0; i <num.length; i++){
            suma += num[i];
        }
        System.out.println("La suma es: " + suma);
    }
}
