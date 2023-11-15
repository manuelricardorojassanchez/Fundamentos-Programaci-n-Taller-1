/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areatriangulo;

import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class AreaTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        double Base,Altura,Area;
        
        Scanner teclado = new Scanner(System.in); 
        Scanner teclado1 = new Scanner(System.in);
        System.out.println("Ingrese el Valor de la Base :");
        Base = teclado.nextDouble();
        System.out.println("Ingrese el valor de la altura : ");
        Altura=teclado1.nextDouble();
        Area=(Base*Altura)/2;
        System.out.println("La base del Triangulo es " + Area );
        
        
        
        
       
        
    }
    
}
