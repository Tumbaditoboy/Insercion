/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementacion;

import com.mycompany.insercion.Insercion;

/**
 *
 * @author aleja
 */
public class Ordenar {
    
    public static void main(String[] args) {
        
                // Se crea un arreglo de enteros llamado vals
        Integer[] valrs = {15, 60, 8, 16, 44, 27, 12, 35};
        
        
        Insercion.insercion(valrs);
        
        // Se imprime el arreglo ordenado
        for (Integer val : valrs) {
            System.out.print(val + ",");
       }
        System.out.println();
   }
    

}

