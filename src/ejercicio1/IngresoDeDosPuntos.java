/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author josue
 */
public class IngresoDeDosPuntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Calculadora cal = new Calculadora();
        double primerpunto,segundopunto;
        System.out.println("Ingrese primer punto");
        primerpunto=sc.nextDouble();
         System.out.println("Ingrese segundo punto");
        segundopunto=sc.nextDouble();
        double resultado = cal.distanciaEntreDosObjetos(primerpunto, segundopunto);
        
        System.out.println(resultado);
        
                
    }
    
}
