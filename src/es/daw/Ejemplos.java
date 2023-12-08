/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.daw;

import static es.daw.Funciones.contarMascotas;
import static es.daw.Funciones.mostrarNumeros;
import static es.daw.Funciones.elegirOpcion;
import static es.daw.Funciones.mostrarMenu;

/**
 *
 * @author ed
 */
public class Ejemplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //***ejemplo 1***
        
        int totalMascotas = contarMascotas();
        System.out.println("Total de mascotas: " + totalMascotas);
        
        
        //***ejemplo 2***
        
        int[] numeros = mostrarNumeros();

        
        //***ejemplo 3***
        
        mostrarMenu();
        elegirOpcion();

    }

}
