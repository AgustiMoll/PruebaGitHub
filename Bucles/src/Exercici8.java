public class Exercici8 {

    public static void main(String[] args) {
        int num = 10;
        int llistaenters = 1;

        for (int i = 0; i < num; i++) {
            if (i % 2 != 2) {
                llistaenters *= i;
            }

        }

        System.out.println("Llista enters: " + llistaenters);

    }
}
