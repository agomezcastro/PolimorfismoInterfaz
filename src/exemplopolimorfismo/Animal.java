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
public abstract class Animal implements InterfazAnimal{
     private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Animal{" + "nome=" + nome + '}';
    }
     
    
    public abstract void falar();
     
     
     
}
