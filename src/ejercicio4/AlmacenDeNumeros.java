/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author josue
 */
public class AlmacenDeNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int arreglo[] = new int[10];
        Scanner sc = new Scanner(System.in);
        
        int agregado,sumador=0;

        for(int i=0;i<10;i++){
            System.out.println("Ingrese "+(i+1)+" valor:");
            agregado=sc.nextInt();
            arreglo[i]=agregado;
        }
        int mayor=arreglo[0],menor=arreglo[0];
        for(int i=0;i<10;i++){
            sumador=sumador+arreglo[i];
            System.out.println(+i+" valor: "+arreglo[i]);
            if (mayor<arreglo[i]){
                mayor=arreglo[i];
            }
            if (menor>arreglo[i]){
                menor=arreglo[i];
            }     
        }
        
        System.out.println("Promedio es: "+(sumador/10));
        System.out.println("el mayor es: "+mayor);
        System.out.println("el menor es: "+menor);
}
}
