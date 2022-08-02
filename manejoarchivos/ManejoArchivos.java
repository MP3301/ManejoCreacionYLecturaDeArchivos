/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manejoarchivos;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManejoArchivos {


    
    public static void crearArchivo(String nombreArchivo,String contenido) {
    
        //se crea objecto archivo
        File archivo = new File(nombreArchivo);
        try {
            //se tiene que encerrar en un catch
            //se crea objecto salida
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);
            //se cierra flujo
            salida.close();
            System.out.println("se ha creado el archivo");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManejoArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        

        
    
    }
    
    
     public static void anexaAppendrArchivo(String nombreArchivo,String contenido) {
    
        //se crea objecto archivo
        File archivo = new File(nombreArchivo);
        try {
            //se tiene que encerrar en un catch
            //se crea objecto salida
            PrintWriter salida = new PrintWriter(new FileWriter(archivo,true));
            salida.println(contenido);
            //se cierra flujo
            salida.close();
            System.out.println("se ha creado el archivo");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManejoArchivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManejoArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        

        
    
    }
     
     
     public static void leerArchivo(String nombreArchivo){
     
    File archivo = new File(nombreArchivo);
        try {
            //para leer lineas completas del archivo bufferedReader
            BufferedReader entrada = new  BufferedReader(new FileReader(archivo));
            //se lee archivo por linea
            String lectura = entrada.readLine();
            
            while (lectura != null) {
                System.out.println("lectura="+lectura);                
                lectura = entrada.readLine();
                
            }
            
            entrada.close();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManejoArchivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManejoArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
         
     }
    
}
