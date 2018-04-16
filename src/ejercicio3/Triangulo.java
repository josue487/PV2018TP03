package ejercicio3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josue
 */
public class Triangulo {
    
    void determinarSiEsTrianguloYCalcularPerimetro(double a,double b,double c){
        if(((a+b)>c)&&((a+c)>b)&&((b+c)>a)){
            System.out.println("El perimetro es "+(a+b+c));
        }
        else{
            System.out.println("No es un triangulo");
        }
    }
}
