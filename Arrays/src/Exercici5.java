public class Exercici5 {
    public static void main(String[] args) {
        char[] lletres = {'a', 'e', 'i', 'o', 'u'};
        String nom = "";

        for (int i = 0; i < lletres.length; i++) {
            nom += lletres[i];

        }
        System.out.println("L'array es: " + nom);

    }
}
