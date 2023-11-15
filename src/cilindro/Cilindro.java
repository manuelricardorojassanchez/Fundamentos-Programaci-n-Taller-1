/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cilindro;

import java.util.Scanner;

/**
 *
 * @author Manuel Ricardo Rojas Sanchez
 */
public class Cilindro {

    
    public static void main(String[] args) {
        
        double Area, volumen ,Radio, Altura;
        
        Scanner r1 = new Scanner(System.in);
        Scanner A1 = new Scanner(System.in);
        System.out.println("Ingrese el valor del Radio");
        Radio= r1.nextDouble();
        System.out.println("Ingrese el valor de la altura");
        Altura= A1.nextDouble();
        
              volumen=((3.14159265359)*(Radio*Radio))*Altura;
              Area=((2*3.14159265359)*(Radio)*Altura)+((2*3.14159265359)*(Radio*Radio));
        
        
     System.out.println("El Volumen es:"+volumen);
     System.out.println("El Area es:"+Area);
     
       
    }
    
}
