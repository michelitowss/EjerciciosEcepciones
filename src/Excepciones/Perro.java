package Excepciones;
import java.util.Scanner;

public class Perro extends Animales {
    Scanner sc = new Scanner(System.in);

    String raza;

    public Perro (String name, String size, double peso, String raza) {
        super(name, size, peso);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                '}';
    }
    //metodo para ingresar datos al diccionario
    public String razaPerro() {
        System.out.println("Escriba la raza del perro");
        String raza = sc.nextLine();
        return raza;
    }
}
