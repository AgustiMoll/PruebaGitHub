public class Alumne {

    private String nom;
    private int edad;
    private int mitjNotes;

    //CONSTRUCTOR
    public Alumne(String nom, int edad){
        this.nom = nom;
        this.edad = edad;
    }

    //GETTERS
    public String getNom(){
       return this.nom = nom;
    }
    public int getEdad(){
        return this.edad = edad;
    }

    public int getMitjNotes() {
        return this.mitjNotes = mitjNotes;
    }
    //SETTERS
    public void setEdad(){
        this.edad = edad;
    }

    public void setNom(String nom){
        this.nom = nom;
    }
    public void setMitjNotes(int mitjNotes){
        this.mitjNotes = mitjNotes;
    }

    //METODES
    public void printAlumne(){
        System.out.println("El nom es: " + getNom());
        System.out.println("L'edad es: " + getEdad());
    }

    public void printAlumnes(){

    }

}
