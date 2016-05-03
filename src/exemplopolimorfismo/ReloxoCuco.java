/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplopolimorfismo;

/**
 *
 * @author agomezcastro
 */
public class ReloxoCuco extends Reloxo{

    public ReloxoCuco(String marca) {
        super(marca);
    }
    
    @Override
    public void falar(){
        System.out.println("cucu cucu");
    }
}
