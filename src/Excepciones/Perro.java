package Excepciones;

public class Perro extends Animales {

    String raza;

    public Perro(String name, String size, double peso, String raza) {
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
}
