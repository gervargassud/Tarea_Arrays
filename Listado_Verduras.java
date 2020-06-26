/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listado_verduras;

import java.util.Scanner;

public class Listado_Verduras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
         String[] Verduras = new String[3];
             float[]  Precios = new float[3];
             Scanner leer = new Scanner(System.in);
             
             for(int i=0 ;i < 3;i++ ){
                 
                 System.out.print("Ingrese una verdura: ");
                 Verduras[i] = leer.next();
                 System.out.print("Ingrese el precio: ");
                 Precios[i] = leer.nextFloat();
             
             }
             for (int k = 0; k <= 3 ; k++){
                 
                 
                 System.out.println("El precio de: $" +Verduras[k]+ " es ------> $" +Precios[k]);
                 

                 
             }    
                 
             
    }
    
    
}
