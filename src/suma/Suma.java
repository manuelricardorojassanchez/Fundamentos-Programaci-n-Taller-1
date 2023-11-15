/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author carlos
 */
public class Suma {
public static void main (String [] args) {
    
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader (isr);
int s1, s2, suma;
try {
System.out.println("Sumando 1 : ");
s1 = Integer.parseInt(br.readLine());
System.out.println("Sumando 2 : ");
s2 = Integer.parseInt(br.readLine());
}catch (IOException | NumberFormatException e) {
System.out.println("Se ha producido un error Asegúrese de haber introducido dos números");
s1 = 0; s2 = 0;
}
suma=s1+s2;
System.out.println ("La suma es " + s1 + "+" + s2 +"="+ suma);
}
}
             