package prac_2;

import java.util.Scanner;
public class Prac_2 {

    public static void main(String[] args) {
        Scanner tc = new Scanner (System.in);
        

                System.out.print("Introduce el tamaño del arreglo: ");
        int tamano = tc.nextInt();

        int[] arreglo = new int[tamano];

        for (int i = 0; i < tamano; i++) {
            System.out.print("Introduce el valor para la posición [" + i + "] : ");
            arreglo[i] = tc.nextInt();
        }

        int maximo = arreglo[0];
        int minimo = arreglo[0];
        int pares = 0;
        int impares = 0;

        for (int i = 1; i < tamano; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }

            if (arreglo[i] < minimo) {
                minimo = arreglo[i];
            }

            if (arreglo[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("El valor máximo del arreglo es: " + maximo);
        System.out.println("El valor mínimo del arreglo es: " + minimo);
        System.out.println("Número de pares en el arreglo: " + pares);
        System.out.println("Número de impares en el arreglo: " + impares);
    }
}



