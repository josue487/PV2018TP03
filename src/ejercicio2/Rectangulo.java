/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author josue
 */
public class Rectangulo {
    
    void determincaionDePuntosFaltantesCalcularPerimetroYSuperficie(double base,double altura, double ejex,double ejey){
        if((ejex==ejey)&&(ejex>0)){
            System.out.println("No es un rectangulo");
        }
        else{
            if ((ejey==altura)&&(ejex==base)){
                System.out.println("Puntos x e y faltante"+(ejey-altura)+"  "+(ejex-base));
                System.out.println("Puntos x e y faltante"+(ejey-altura)+"  "+ejex);
                System.out.println("Puntos x e y faltante"+(ejey)+"  "+(ejex-base));
            }
            if ((ejey==altura)&&(ejex==0)){
                System.out.println("Puntos x e y faltante"+(ejey)+"  "+(base));
                System.out.println("Puntos x e y faltante"+(ejey-altura)+"  "+(ejex));
                System.out.println("Puntos x e y faltante"+(ejey-altura)+"  "+(base));             
            }
            if((ejey==0)&&(ejex==base)){
                System.out.println("Puntos x e y faltante"+(altura)+"  "+(ejex));
                System.out.println("Puntos x e y faltante"+(ejey)+"  "+(ejex-base));
                System.out.println("Puntos x e y faltante"+(altura)+"  "+(ejex-base));
            }
            if((ejey==0)&&(ejex==0)){
                System.out.println("Puntos x e y faltante"+(altura)+"  "+(base));
                System.out.println("Puntos x e y faltante"+(ejey)+"  "+(base));
                System.out.println("Puntos x e y faltante"+(altura)+"  "+(ejex));
            }
            
            System.out.println("Perimetro es igual a "+(base*2+altura*2));
            System.out.println("Superficie es igual a "+(base*altura));
            
        }
    }
     
}
