/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import static manejoarchivos.ManejoArchivos.crearArchivo;

import java.util.*;
import manejoarchivos.ManejoArchivos;
import static manejoarchivos.ManejoArchivos.anexaAppendrArchivo;
import static manejoarchivos.ManejoArchivos.leerArchivo;

/**
 *

 */
public class TestManejoArchivos {
    
    public static void main(String[] args) {
        
        
        String nombreArchivo = "prueba.txt";
        
        String contenido;
        
        Scanner input = new Scanner(System.in);

        System.out.println("INTRODUZCA CONTENIDO DE ARCHIVO");
        contenido = input.nextLine();
  
    
        //escribir informacion archivo
        anexaAppendrArchivo(nombreArchivo, contenido);
        leerArchivo(nombreArchivo);
    }
    
}
