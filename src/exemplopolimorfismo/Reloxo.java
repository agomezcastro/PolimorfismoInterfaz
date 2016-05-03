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
public abstract class Reloxo implements InterfazAnimal{
    private String marca;
    
    
    public abstract void falar();

    public Reloxo(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Reloxo{" + "marca=" + marca + '}';
    }
    
    
}
