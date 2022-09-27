package Excepciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PreguntasBucle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animales animal = new Animales();
        //System.out.println("Escribe tu nombre");
        //String nombre = sc.nextLine();
        //System.out.println(nombre);


        Map<String,Animales> animales = new HashMap<String,Animales>();
        animales.put(animal.nombre(), new Animales(animal.nombre(), animal.tamaño(), animal.masa()));
    }
}
