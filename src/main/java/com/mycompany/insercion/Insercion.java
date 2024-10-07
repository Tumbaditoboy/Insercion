/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.insercion;

/**
 *
 * @author aleja
 */
public class Insercion {
public static void insercion(Integer[] data) {
        for (int i = 1; i < data.length; i++) {
            // act/actual = valor actual de data[i]
            Integer act = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > act) {
                data[j + 1] = data[j];
                j--;
                //se disminuye j para comparar con los elementos restantes
           }
            data[j + 1] = act;
       }
   }
   
}
