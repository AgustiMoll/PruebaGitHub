import java.util.ArrayList;

public class Assignatura {

    private String nom;
    private ArrayList <Alumne> alumnes = new ArrayList();


    //CONTRUCTOR
    public Assignatura (String nom){
        this.nom = nom;
    }

    //GETTERS
    public String getNom(){
        return this.nom = nom;
    }

    public ArrayList<Alumne> getAlumnes() {
        return alumnes;
    }

    //SETTERS
    public void setNom(){
        this.nom = nom;
    }
    public void setAlumnes(ArrayList <Alumne> alumnes){
        this.alumnes = alumnes;
    }

    //METODES
    public void printAssignatura(){
        System.out.println("Nom assignatura: " + getNom());
    }

}
