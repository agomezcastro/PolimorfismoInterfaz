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
public class Can extends Animal{
    private String raza;

    public Can(String raza, String nome) {
        super(nome);
        this.raza = raza;
    }


    public String getRaza() {
        return raza;
    }

    @Override
    public String toString() {
        return "Can{" + "raza=" + raza + '}';
    }

    
    @Override
    public void falar() {
        System.out.println("such programming, much class, wow");
    }
    
    public void andar(){
        System.out.println("anda o can");
    }
    
    
}
