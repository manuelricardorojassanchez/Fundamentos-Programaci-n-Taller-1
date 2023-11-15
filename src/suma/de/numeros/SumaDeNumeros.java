
package suma.de.numeros;

import java.util.Scanner;

/**************************************
 **************************************
 * @author Manuel Ricardo Rojas Sanchez
 ***************************************/
public class SumaDeNumeros {

 
    public static void main(String[] args) {
        
        
        double Numero1,Numero2,Suma;
        
        Scanner N1 = new Scanner(System.in);
        Scanner N2 = new Scanner(System.in);
        System.out.println("Ingrese el primer valor :");
        
        Numero1=N1.nextDouble();
        System.out.println("Ingrese el Segundo valor :");
        
        Numero2=N2.nextDouble();
        
        
        
        Suma= Numero1+Numero2;
        
        System.out.println("El Resultado de la suma es : "+Suma);
        
        
        
        
        
        
        
       
    }
    
}
