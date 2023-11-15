/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero.al.cuadrado;

import java.util.Scanner;

/**
 *
 * @author Manuel Ricardo Rojas Sanchez
 */
public class NumeroAlCuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("Ingrese el Numero que desea elevar a la Potencia---> 2   ");
        double Numero, Potencia;
        Scanner N1 = new Scanner(System.in);
        Numero=N1.nextDouble();
        Potencia=Math.pow(Numero, 2);
        System.out.println("El Valor de "+Numero+"  Elevado a la potencia 2 es: "+Potencia);
        
        
    }
    
}
