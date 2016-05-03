/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplopolimorfismo;

import java.util.ArrayList;

/**
 *
 * @author agomezcastro
 */
public class ExemploPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Animal> listaAnimais = new ArrayList();
        
        Animal can = new Can("palleiro", "Brisa");
        Animal ga = new Gato("Negro", "Minino");
        listaAnimais.add(ga);
        listaAnimais.add(can);
        /*for (Animal ani: listaAnimais)
            System.out.println(ani.toString());
        for (Animal ani:listaAnimais){
            ani.falar();
            if (ani instanceof Can){
                ((Can)ani).andar();
        }
        }            
        for (Animal ani:listaAnimais)
            falarPolimorfico(ani);*/
        
        InterfazAnimal canciño = new Can("pastor", "Tobi");
        falarPolimorfico(canciño);
        System.out.println(canciño.toString());
        
        InterfazAnimal rel = new ReloxoCuco("Rolex");
        rel.falar();
        
        ArrayList <InterfazAnimal> listaInterfaz = new ArrayList();
        
        }
        //metodo con parametro xeralista
        public static void falarPolimorfico(InterfazAnimal a){
            a.falar();
            
        
    }
    
}
