public class Alumne {
    private String nom;
    private int edad;
    private int id;
    private int [] notes;

public Alumne (String nom, int edad, int id, int [] notes){
    this.nom = nom;
    this.edad = edad;
    this.id = id;
    this.notes = notes;
}

public Alumne (){
}

    public String getNom(){
    return this.nom = nom;
    }
    public int getEdad(){
        return this.edad = edad;
    }
    public int getId(){
        return this.id = id;
    }
    public int[] getNotes(){
        return this.notes = notes;
    }

    public void setNom(String nom){
        this.nom = nom;
    }
    public void setEdad(int edad){
        this.nom = nom;
    }
    public void setId(int id){
        this.nom = nom;
    }
    public void setNotes(int [] notes){
        this.notes = notes;
    }

    public double mitjanaNotes(){
        int suma = 0;
        int contador = 0;
        double mitjana;
        for (int i = 0; i < notes.length; i++){
            suma += notes[i];
            contador++;
        }
        return mitjana = suma / contador;
    }


}
