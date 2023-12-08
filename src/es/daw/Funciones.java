/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw;

import java.util.Scanner;

/**
 *
 * @author ed
 */
public class Funciones {

    //***ejemplo 1***
    public static int contarMascotas() {
        int numGatos = 2;
        int numPerros = 4;
        int totalMascotas = numGatos + numPerros;

        return totalMascotas;
    }
    
    /*
    código mejorable:
     
    public static int contarMascotas() {
    int totalMascotas=2+4;
    return totalMascotas;
    }
    */
        

    //***ejemplo 2***
    public static int[] mostrarNumeros() {
        int numeros[] = {1, 2, 3};

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        return numeros;
    }
    
    /*
    código mejorable:
     
    public static int[] array() {
        int array[] = {1, 2, 3};

        for (int i = 1; i < 4 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        return array;
    }
    */
    
    
    //***ejemplo 3***
    public static void mostrarMenu() {

        System.out.println("¿Qué quieres que diga?:\n"
                + "1.Hola\n"
                + "2.Adiós\n"
                + "3.Hasta luego");

    }

    public static void elegirOpcion() {

        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Hola");
                break;
            case 2:
                System.out.println("Adiós");
                break;
            case 3:
                System.out.println("Hasta luego");
                break;
            default:
                System.out.println("Opción incorrecta.");
        }
    }

    /*
    código mejorable:
    
    public static void opciones() {
    
    System.out.println("¿Qué quieres que diga?:\n"
            + "1.Hola\n"
            + "2.Adiós\n"
            + "3.Hasta luego");

        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Hola");
                break;
            case 2:
                System.out.println("Adiós");
                break;
            case 3:
                System.out.println("Hasta luego");
                break;
            default:
                System.out.println("Opción incorrecta.");
        }
    }
    */

}
