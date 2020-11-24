import java.util.Scanner;
public class Exercici3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = 3;
        int [] num = new int[N];

        for(int i = 0; i < num.length; i++){
            System.out.print("Introdueix un numero: ");
            num[i] = sc.nextInt();
        }

        for (int i = num.length -1; i >= 0; i--){
            System.out.println(num[i]);
        }

    }
}
