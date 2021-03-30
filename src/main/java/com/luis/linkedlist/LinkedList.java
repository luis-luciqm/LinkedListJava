package com.luis.linkedlist;

import javax.swing.JOptionPane;

/**
 * @author luis
 */
public class LinkedList {
    // temos que criar um ponteiro que aponte para o inicio da lista
    No inicio = null; // nesse momento ele não aponta para ninguém (NULL) 
    int tam = 0;
    
    public void InserirInicio(Object info){
        No no = new No(); // criei um No na memoria
        no.setInfo(info); // atribuindo valor passado pelo parametro ao no.info do No
        no.setProximo(inicio);
        inicio = no; // apontando para o próximo No
        tam++;
    }

    @Override
    public String toString(){
        // para varrer a minha lista eu preciso criar um No local
        No local = inicio; // ou seja, ele está apontando para o inicio da lista
        String lista = ""; // apenas para salvar os dados
        
        while(local != null){
            lista += local.getInfo() + " ";
            local = local.getProximo(); // apontando para o proximo no
        }
        return lista;
    }
    
    public boolean PesquisarValorEmLista(Object info){
        No pesquisa = inicio; // aponta para o Inicio

        while(pesquisa != null){
            if(pesquisa.getInfo() == info){
                System.out.println("Encontrei o valor " + info);
                return true;
            }
            pesquisa = pesquisa.getProximo();
        }
        
        System.out.println("O valor "+ info + " não foi encontrado!");
        return false;
    }
    
    public Object deletarDoInicio(){
        if(estaVazia()) return null;
        Object temp = inicio; // variavel auxiliar que armazena o elemento que está na cabeça
        inicio = inicio.getProximo(); // a cabeça vai ter o próximo elemento que ela armazena
        tam--;
        System.out.println("Item removido do Inico");
        return temp;
    }
    
    public Object deletarDoFim(){
        if(estaVazia()) return null;
        No temp = inicio; // ponteiro que vai apontar para o inicio
        No aux; 
        
        while(temp.getProximo() != null){ // enquanto ele não chegar no ultimo Nó
            aux = temp; // onde temp estiver apontando, aux irá apontar tbm
            temp = temp.getProximo(); // incremento o temp para o proximo Nó
            
            if(temp.getProximo() == null){ // se chegar o ultimo nó
                aux.setProximo(null); // ele irá apontar para para null, e o nó seguinte será desconsiderado
                tam--;
                return temp.getInfo(); // retorno o elemento que vai ser removido
                // será removido aquele que foi desconsiderado, e que é o Nó final
            }
        }
        
        inicio = null; // mais uma vez desconectando da lista
        tam--;
        return temp.getInfo();
    }
    
    public void inserirNoFim(Object info){ // perguntar na aula, duvidas sobre adicionar elemento na lista
        No no = new No(); // Criei um No
        no.setInfo(info); // atribuí um valor para ele
        
        No local = inicio; // criando um ponteiro para apontar para o inicio;
        
        while(local.getProximo() != null){ // enquanto o ponteiro não chegar no ultimo nó
            local = local.getProximo();  // incrementa o ponteiro para o proximo Nó
        }
        
        local.setProximo(no); // o ponteiro vai apontar para o nó criado
        no.setProximo(null);
        tam++;
    }
    
    public Object buscarPrimeiroElemento(){
        No aux = inicio;
        return aux.getInfo();
    }
    
    public Object buscarUltimoElemento(){
        No aux = inicio;
        
        while(aux.getProximo() != null){
            aux = aux.getProximo();
        }
        return aux.getInfo();
    }
    
    public boolean estaVazia(){
        return tam == 0;
    }
    
    public void mostrarLista(){
        JOptionPane.showMessageDialog(null, "Elementos da Lista: \n" + toString(), "Elementos da Lista Encadeada!", JOptionPane.INFORMATION_MESSAGE);
    }

}
