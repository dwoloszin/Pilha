/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tad_pilha_com_alocação_.linear_vetor;

/**
 *
 * @author Dwoloszin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             
        //objetos
        Pilha p1 = new Pilha();
        
        
        
        p1.Empilha(1);
        p1.Empilha(2);
        p1.Empilha(3);
        p1.Desempilha();//retira o ultimo a entrar
 
        System.out.println("ULTIMO: " + p1.Ultimo());
      
    }
}