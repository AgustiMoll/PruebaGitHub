public class Obra {
    private String titol;
    private String tematica;
    private int pagines;

    public Obra () {}
    public Obra (String titol, String tematica, int pagines){
        this.titol = titol;
        this.tematica = tematica;
        this.pagines = pagines;
    }

    public String getTitol(){
        return this.titol;
    }
    public int getNumPagines(){
        return this.pagines;
    }


}
