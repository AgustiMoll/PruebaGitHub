import java.util.Scanner;

public class Dog2 {
    private String nom;
    private int edad;
    private String raca;
    private int num_vacunes;
    private boolean pedigri;


    public String getNom(){
        return this.nom;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getRaca(){
        return this.raca;
    }
    public int getNum_vacunes(){
        return this.num_vacunes;
    }
    public boolean getPedigri(){
        return this.pedigri;
    }

    public void inputDatos(){
        Scanner Dog2 = new Scanner(System.in);
        String nom = Dog2.next();


    }

}