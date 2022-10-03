package Excepciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PreguntasBucle {
    public static <interger> void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animales animal = new Animales();
        //String key = sc.nextLine();


        //String pregunta = sc.nextLine();
        //System.out.println("Escribe tu nombre");
        //String nombre = sc.nextLine();
        //System.out.println(nombre);


        //String pregunta = sc.nextLine();

        String pregunta;
        Integer i = 0;

        for (i = 0; i < 10; i++) {



            do {
                i++;

                Integer j = i;

                Map< Integer, Animales> animales = new HashMap<Integer, Animales>();
                animales.put(j, new Animales(animal.nombre(), animal.tamaño(), animal.masa()));


                for (Map.Entry<Integer, Animales> anim : animales.entrySet()) {
                    Integer valor = anim.getKey();
                    String valor2 = String.valueOf(anim.getValue());
                    System.out.println(valor + " - " + valor2);
                }

                System.out.println("Desea ingresar mas parametros? responnda si o no ");
                pregunta = sc.nextLine();
                System.out.println(animal.size);

            } while (pregunta.equals("si"));





        }

    }

}
