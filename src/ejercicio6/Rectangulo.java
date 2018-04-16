/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author josue
 */
public class Rectangulo {

    /**
     * @return the ejex
     */
    
    private double ejex;
    private double ejey;
    private double base;
    private double altura;
    
        public Rectangulo(double ejex, double ejey, double base, double altura) {
        this.ejex = ejex;
        this.ejey = ejey;
        this.base = base;
        this.altura = altura;
    }
    
        public void calcularPerimetroYSuperficie(){
            System.out.println("Superficie: "+(this.base*this.altura));
            System.out.println("Perimetro: "+(((this.base*2)+(this.altura*2))));
}
        
    public double getEjex() {
        return ejex;
    }

    /**
     * @param ejex the ejex to set
     */
    public void setEjex(double ejex) {
        this.ejex = ejex;
    }

    /**
     * @return the ejey
     */
    public double getEjey() {
        return ejey;
    }

    /**
     * @param ejey the ejey to set
     */
    public void setEjey(double ejey) {
        this.ejey = ejey;
    }

    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    

    
    
}
