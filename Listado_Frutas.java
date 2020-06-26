/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listado_frutas;

import java.util.Scanner;

/**
 *
 * @author andrea
 */
public class Listado_Frutas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        
        
        
             String[] Frutas = new String[3];
             Scanner leer = new Scanner(System.in);
             
             for(int i=0 ;i < 3;i++ ){
                 
                 System.out.print("Ingrese una fruta: ");
                 Frutas[i] = leer.next();
             
             }
             
            for (String k : Frutas){
             
            System.out.println(k);
            }
    
        
        
    }
    
}
