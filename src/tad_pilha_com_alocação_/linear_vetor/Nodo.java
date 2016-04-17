/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tad_pilha_com_alocação_.linear_vetor;

/**
 *
 * @author dwooszin
 */
public class Nodo {
    private int valor;
    private Nodo anterior;
   
   
   //Define nó anterior
   public void setAnterior(Nodo anterior) {
      this.anterior = anterior;
   }
   
   
   //Retorna nó anterior.
   public Nodo getAnterior() {
      return anterior;
   }
   
   
   //Define valor do nó
   public void setValor(int valor) {
      this.valor = valor;
   }
   
   //Retorna valor do nó
   public int getValor() {
      return valor;
   }
    
}
