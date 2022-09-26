package Excepciones;


public class TryCatchFinally {
    public static void main(String[] args) throws Exception {
        int numero1 = 10;
        int numero2 = 0;
        float result = 0.0f;

        TryCatchFinally metodo = new TryCatchFinally(); //Instanciamos un objeto del metodo1
        metodo.metodo1(); //llamamos al metodo1

        try { // Instrucciones que hacer anteste de la excepcion
            result = numero1 / numero2;
            System.out.println(result);
        } catch (ArithmeticException ex) { // Instrucciones cuando se produce una excepcion
            result = 0.0f; // Damos un valor a la variable que nos dara la excepcion
            System.out.println("Error :" + ex.getMessage()); // imprimimos el error con .getMessage()
        } finally {
            System.out.println("Resultado Division :" + result); // imprimimos result con el valor dado en catch
            System.out.println("Despues de la division");
        }


    }

    public void metodo1() throws Exception { //Creamos un metodo y luego extendemos de la clase throws
        try { //Exception es la excepcion superior asi no tenemos que especificar la excepcion
            float result = 10 / 0;
        } catch (Exception e) { // atrapamos el error en el catch creamos una variable e de la clase Exception

            System.out.println("Error : " + e.getMessage()); //Imprimos el error con .getMessage()
        }
        System.out.println("Fin");

    }
}