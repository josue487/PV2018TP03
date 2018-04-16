/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.ArrayList;

public class GestorRectangulos {
    private ArrayList<Rectangulo> Rectangulos = new ArrayList();


    public void agregarRectangulo(Rectangulo rectangulo){
        
        this.Rectangulos.add(rectangulo);
    }

    /**
     * @return the Rectangulos
     */
    public ArrayList<Rectangulo> getRectangulos() {
        return Rectangulos;
    }

    /**
     * @param Rectangulos the Rectangulos to set
     */
    public void setRectangulos(ArrayList<Rectangulo> Rectangulos) {
        this.Rectangulos = Rectangulos;
    }
    
}
