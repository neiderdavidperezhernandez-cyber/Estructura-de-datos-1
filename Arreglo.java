
package com.mycompany.arreglo;

import java.util.Random;
public class Arreglo {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[10];
        int[] pares = new int[10];
        int[] impares = new int[10];
        int contPares = 0;
        int contImpares = 0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(2001)-1000; 
            if (numeros[i] % 2 == 0) {
                pares[contPares] = numeros[i];
                contPares++;
            } else {
                impares[contImpares] = numeros[i];
                contImpares++;
            }
        }
        System.out.println("Arreglo original:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        System.out.println("Arreglo de pares:");
        for (int i = 0; i < contPares; i++) {
            System.out.print(pares[i] + " ");
        }
        System.out.println();
        System.out.println("Arreglo de impares:");
        for (int i = 0; i < contImpares; i++) {
            System.out.print(impares[i] + " ");
        }
    }
}
