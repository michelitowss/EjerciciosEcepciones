package Excepciones;
import java.util.Scanner;

public class Animales {
    Scanner sc = new Scanner(System.in);
    String name;
    String size;
    double peso;

    public Animales() {
    }

    public Animales(String name, String size, double peso) {
        this.name = name;
        this.size = size;
        this.peso = peso;
    }

    public String getName() {
        return name;
    }

    public double getPeso() {
        return peso;
    }

    public String getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Animales{" +
                "name='" + name + '\'' +
                ", raza='" + size + '\'' +
                ", peso=" + peso +
                '}';
    }

    public String nombre (){
        System.out.println("Escriba el tipo de animal : ");
        String nombre = sc.nextLine();
        return nombre;
    }
    public String tamaño (){
        System.out.println("Tamaño del animal : ");
        String tamaño = sc.nextLine();
        return tamaño;
    }
    public double masa () {
        System.out.println("Masa del animal : ");
        double masa = sc.nextDouble();
        return masa;
    }
}
