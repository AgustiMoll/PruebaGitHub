public class Principal {
    public static void main(String[] args){
        Persona treballador1 = new Persona("Agusti", 20, "41620356L",
                "Home", 971819045 );

        treballador1.getNom();


        System.out.println(treballador1.getNom());
        System.out.println(treballador1.getEdad());
        System.out.println(treballador1.getDNI());
        System.out.println(treballador1.getSexe());
        System.out.println(treballador1.getTelefon());

        treballador1.setNom("Guerrero");

        System.out.println(treballador1.getNom());





        }
        /* Hem passat els parametres del contructor a l'objecte treballador */

    }

