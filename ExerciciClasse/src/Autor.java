import java.util.ArrayList;

public class Autor {
    private String nom;
    private ArrayList<Obra> obres;

    public Autor(String nom, ArrayList<Obra> obres) {
        this.nom = nom;
        this.obres = obres;
    }

    public Obra obraMesLlarga() {
        int longitud = 0;
        Obra obra1 = new Obra();
        for (int i = 0; i < this.obres.size(); i++) {
            if (this.obres.get(i).getNumPagines() > longitud) {
                longitud = this.obres.get(i).getNumPagines();
                obra1 = this.obres.get(i);
            }
        }
        return obra1;
    }
}


