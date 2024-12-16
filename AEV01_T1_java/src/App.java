import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public void sayHello () {

        System.out.println("Hola Mundo");

    }

    public int mostrarPrimos () {

        Scanner teclado = new Scanner(System.in);

        int contador = 0;
        int numero1 = 0;
        int numero2 = 0;
        int suma = 0;
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        boolean fin = true;
        String primo = "";

        System.out.print("Añade un numero entero: ");
        numero1 = teclado.nextInt();
        System.out.print("Añade un segundo numero entero mayor: ");
        numero2 = teclado.nextInt();

        contador = numero1;

        listaNumeros.add(numero1);

        if (numero1 != numero2) {

            if (numero1 < numero2) {

                do {

                    numero1 = numero1 +1;

                    if (numero1 != numero2) {

                        listaNumeros.add(numero1);

                    } else {

                        fin = false;

                    }

                } while (fin) ;
                listaNumeros.add(numero1);
               for (Integer i : listaNumeros) {
                   suma = suma + i;
                   for (Integer b: listaNumeros) {

                       if ((i % b+1) == 0) {
                       } else contador++;
                   }

                if (contador <= numero2) {

                    System.out.println(i + "Si es primo");

                } else System.out.println(i + "No es primo");

               }

                System.out.print("La suma total es: " + suma);


            }else System.out.print("Escribelo con el orden correcto!");

        } else System.out.print("Los numeros no puedes ser iguales!");

        return 0;
    }

    public void compañeros () {

        Scanner teclado = new Scanner(System.in);

        String[] arrayCompañeros = new String[6];

        arrayCompañeros[0] = "pepe";
        arrayCompañeros[1] = "rafa";
        arrayCompañeros[2] = "carles";
        arrayCompañeros[3] = "alex";
        arrayCompañeros[4] = "jose";
        arrayCompañeros[5] = "adrian";

    }

}
