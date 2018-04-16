/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author josue
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo unRectangulo = new Rectangulo();
        Scanner sc = new Scanner(System.in);
        double base,altura,x,y;
        System.out.println("Ingrese base ");
        base=sc.nextDouble();
        System.out.println("Ingrese altura ");
        altura=sc.nextDouble();
        System.out.println("Ingrese y ");
        y=sc.nextDouble();
        System.out.println("Ingrese x ");
        x=sc.nextDouble();
        
        unRectangulo.determincaionDePuntosFaltantesCalcularPerimetroYSuperficie(base, altura, x, y);
        
    }
    
}
