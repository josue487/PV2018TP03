/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

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
        Triangulo unTriangulo = new Triangulo();
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.println("Ingrese primer lado");
        a=sc.nextDouble();
        System.out.println("Ingrese segundo lado");
        b=sc.nextDouble();
        System.out.println("Ingrese tercer lado");
        c=sc.nextDouble();
        unTriangulo.determinarSiEsTrianguloYCalcularPerimetro(a, b, c);
    }
    
}
