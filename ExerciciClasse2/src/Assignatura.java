import java.util.ArrayList;

public class Assignatura {
    private String nom;
    private ArrayList<Alumne> alumnes;

    public Assignatura (String nom, ArrayList<Alumne>alumnes){
    this.nom = nom;
    this.alumnes = alumnes;
    }

    public String getNom(){
        return this.nom = nom;
    }
    public ArrayList getAlumnes(){
        return this.alumnes;
    }

    public void setNom(String nom){
        this.nom = nom;
    }
    public void setAlumnes(ArrayList<Alumne>alumnes){
        this.alumnes = alumnes;
    }

    public void nouMatriculat(Alumne alumnes){
        this.alumnes.add(alumnes);
    }

    public void baixaAlumne (Alumne alumnes){
        this.alumnes.remove(alumnes);
    }

    public Alumne millorAlumne(){
        Alumne alumne1 = new Alumne();
        double nota = 0;
        for (int i = 0; i < alumnes.size(); i++){
            if (alumnes.get(i).mitjanaNotes() > nota) {
                nota = alumnes.get(i).mitjanaNotes();
                alumne1 = alumnes.get(i);
            }
            }
        return alumne1;
        }

    }

