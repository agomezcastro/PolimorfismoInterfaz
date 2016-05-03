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
public class Gato extends Animal{
    private String cor;

    public Gato(String cor, String nome) {
        super(nome);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Gato{" + "cor=" + cor + '}';
    }


    @Override
    public void falar() {
        System.out.println("meow meow motherfucker");
    }
}
