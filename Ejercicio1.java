
public class Ejercicio1 {
    public static void main(String[] args) {

        int[] arreglo = new int[args.length];

        //for para convertir los elementos del arreglo args a enteros

        for (int i = 0; i < args.length; i++) {

            arreglo[i] = Integer.parseInt(args[i]);



        }//endfor

        int sumaPrefijos = 0;

        //for para sumar los numeros

        for (int i = 0; i < args.length ; i++) {

            sumaPrefijos += arreglo[i];

            System.out.println(arreglo[i] + ", " + sumaPrefijos);

        }//endfor



    }
}