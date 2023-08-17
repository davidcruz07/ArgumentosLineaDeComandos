public class Ejercicio2 {

    public static void main(String[] args) {

        int[] A = new int[args.length - 1];

        int x = Integer.parseInt(args[0]);

        System.out.println("La suma de los nÃºmeros debe dar: " + x);

        //for para convertir los elementos del arreglo args a enteros

        for (int i = 1; i < args.length; i++) {

            A[i - 1] = Integer.parseInt(args[i]);

        }


        //declaramos una variable booleana para comprobar las sumas

        boolean resultado = false;

        //for para realizar las sumas y comprobar que den el mismo valor que x

        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] + A[j] == x) {
                    resultado = true;
                    break;
                }

                int suma = A[i] + A[j];
                System.out.println(A[i] + " + " + A[j] + " = " + suma);
            }
            if (resultado) {
                break;
            }
        }

        //imprimir el resultado
        if (resultado) {
            System.out.println("Si");
        } else {
            System.out.println("No");
        }
    }
}
