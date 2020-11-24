import java.util.Scanner;

public class Exercici2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = 5;
        int [] elements = new int[N];

        for (int i = 0; i < elements.length; i++ ){
            System.out.print("Introdueix un numero: ");
            elements[i] = sc.nextInt();
        }

        System.out.println("Els elements introduits son: ");

        for(int i = 0; i < elements.length; i++ ){
            System.out.println(elements[i] + " ");
        }
    }
}
