import java.util.Scanner;

public class Dog {
    private String nom;
    private int edad;
    private String raca;
    private int num_vacunes;
    private boolean pedigri;

    public Dog (String nom, int edad, String raca, int num_vacunes, boolean pedigri){
        this.nom = nom;
        this.edad = edad;
        this.raca = raca;
        this.num_vacunes = num_vacunes;
        this.pedigri = pedigri;
    }

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

    public void setNum_vacunes(int num_vacunes){
        this.num_vacunes = num_vacunes;
    }

    public void sumaVacunes(){
        this.num_vacunes = this.num_vacunes + 1;
    }

    public void DisplayMode() {
        System.out.println("Datos Dog1: ");
        System.out.println("Nom: " + getNom());
        System.out.println("Edad: " + getEdad());
        System.out.println("Raca: " + getRaca());
        System.out.println("Nombre vacunes: " + this.num_vacunes);
        System.out.println("Pedigri: " + getPedigri());
    }


}
