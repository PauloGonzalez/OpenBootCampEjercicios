public class Main {
    /* Ejercicios Tema #3._

    Enunciado del ejercicio:
    Primera parte:
    -Crear una función con tres parámetros que sean números que se suman entre sí.
    -Llamar a la función en el main y darle valores.
    Segunda parte:
    -Crear una clase coche.
    -Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
    -Una función que incremente el número de puertas que tiene el coche.
    -Crear un objeto miCoche en el main y añadirle una puerta.
    -Mostrar el número de puertas que tiene el objeto. */


    public static void main(String[] args)
    {
        Coche miCoche = new Coche(1);

        miCoche.incrementarPuertas();
        System.out.println(miCoche.numeroPuertas);

        int result = sumaFuncion(5, 10, 15);
        System.out.println(result);

        System.out.println("Este es un mensaje nuevo. Se puede borrar esta linea de codigo.");
    }

    public static int sumaFuncion(int num1, int num2, int num3) {

        return num1 + num2 + num3;
    }
}