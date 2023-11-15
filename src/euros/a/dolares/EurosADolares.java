/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euros.a.dolares;

import java.util.Scanner;

/**
 *
 * @author Manuel Ricardo Rojas sanchez
 */
public class EurosADolares {

   
    public static void main(String[] args) {
        
        System.out.println("Ingrese la cantidad de euros a convertir ");
        double Neuros,Vdolares;
        Scanner N1 = new Scanner(System.in);
        Neuros=N1.nextDouble();
        Vdolares=Neuros*1.05715;
        System.out.println("El valor en Dolares que ingreso es : "+ Vdolares);
        
        
        
    }
    
}
