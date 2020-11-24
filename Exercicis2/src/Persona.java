public class Persona {
    private String nom;
    private int edad;
    private String DNI;
    private String sexe;
    private int telefon;

    /* A continuacio feim el contructor */

    public Persona (String nom, int edad, String DNI, String sexe, int telefon) {
        this.nom = nom;
        this.edad = edad;
        this.DNI = DNI;
        this.sexe = sexe;
        this.telefon = telefon;


     /* Aquest this.nom es referim a l'atribut de la classe. Es nom de defora l'asignam al
     nostre atribut. */
    }

    public String getNom(){
        return this.nom;
    }

    public int getEdad(){
        return this.edad;
    }

    public String getDNI(){
        return this.DNI;
    }

    public String getSexe(){
        return this.sexe;
    }

    public int getTelefon(){
        return this.telefon;
    }

    /* Aquest medote despres el cridam desde el main perque
      ens torni el valor per poder-lo imprimir */


    public void setNom(String nom){
        this.nom = nom;

     /* Aquest metode serveix per poder canviar les dades */

    }

  
    }