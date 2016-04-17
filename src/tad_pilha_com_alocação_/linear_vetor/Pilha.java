/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tad_pilha_com_alocação_.linear_vetor;



/**
 *
 * @author dario.lwoloszin
 */
public class Pilha {
    //Variavel para definição do topo da pilha.
   Nodo topo = null;
   
   //Método que empilha valores.
   public void Empilha(int valor){
      Nodo novo = new Nodo();
      novo.setValor(valor);
      novo.setAnterior(topo);
      topo = novo;
      
   }
   
   
   //Retorna o ultimo valor empilhado
   public int Ultimo(){
       return topo.getValor();
   
   }
   
 
   //Método para desempilhar valores
   public int Desempilha(){

         int valor = topo.getValor();
         topo = topo.getAnterior();
         return valor;
      }
    
}
  