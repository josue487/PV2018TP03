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
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo unRectangulo = new Rectangulo(2,4,2,4);
        Rectangulo segundoRectangulo = new Rectangulo(3,5,3,5);
        Rectangulo tercerRectangulo = new Rectangulo(0,0,2,4);
        GestorRectangulos gc = new GestorRectangulos();
        
        gc.agregarRectangulo(unRectangulo);
        gc.agregarRectangulo(segundoRectangulo);
        gc.agregarRectangulo(tercerRectangulo);
        
        for(Rectangulo rec: gc.getRectangulos()){
            System.out.println("Altura:" + rec.getAltura());
            System.out.println("Base:" + rec.getBase());
            System.out.println("Eje x: "+ rec.getEjex());
            System.out.println("Eje y: "+ rec.getEjey());
            rec.calcularPerimetroYSuperficie();
    }
    
}
}
