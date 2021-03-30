package com.luis.linkedlist;

import javax.swing.JOptionPane;

public class MainLinkedList {
    public static void main(String[] args) {
        LinkedList lista = new LinkedList();
        int valor = -1;
        
        Object[] op = {
            "1 - Adicionar valor no Inicio",
            "2 - Adicionar valor no Fim",
            "3 - Deletar valor do Inicio",
            "4 - Deletar valor do Fim",
            "5 - Listar Elementos da Lista",
            "6 - Buscar Primeiro elemento da lista",
            "7 - Buscar Ultimo elemento da lista",
            "8 - Ver tamanho da lista",
            "0 - Sair"
        };
        
        Object selected = op[0];
        while(!selected.toString().equals("0 - Sair")){
            selected = JOptionPane.showInputDialog(null, "Escolha uma opção" ,"Linked List", JOptionPane.INFORMATION_MESSAGE,null, op, op[0]);
            switch(selected.toString()){
                case "1 - Adicionar valor no Inicio":
                    valor = -1;
                    do{
                        valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor para inserir no Inicio", "Linked List", JOptionPane.QUESTION_MESSAGE));
                        lista.InserirInicio(valor);
                        valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 1 para adicionar outro valor ou 0 (zero) para sair", "Linked List", JOptionPane.QUESTION_MESSAGE));
                    }while(valor != 0);
                break;
                
                case "2 - Adicionar valor no Fim":
                    valor = -1;
                    do{
                        valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor para inserir no Fim", "Linked List", JOptionPane.QUESTION_MESSAGE));
                        lista.inserirNoFim(valor);
                        valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 1 para adicionar outro valor ou 0 (zero) para sair", "Linked List", JOptionPane.QUESTION_MESSAGE));
                    }while(valor != 0);
                break;
                
                case "3 - Deletar valor do Inicio":
                    if(lista.estaVazia()){
                        JOptionPane.showMessageDialog(null, "Não existem Elementos na lista para remover!", "Linked List", JOptionPane.ERROR_MESSAGE);
                    }else{
                        int res = JOptionPane.showConfirmDialog(null, "Cuidado, pois esta função irá remover o primeiro elemento da lista! Deseja Continuar?", "CUIDADO MAN", JOptionPane.YES_NO_CANCEL_OPTION);
                        
                        if(res == 0){
                            lista.deletarDoInicio();
                            JOptionPane.showMessageDialog(null, "Elemento removido com sucesso do Inicio!", "Linked List", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            break;
                        }
                    }
                break;
                
                case "4 - Deletar valor do Fim":
                    if(lista.estaVazia()){
                        JOptionPane.showMessageDialog(null, "Não existem Elementos na lista para remover!", "Linked List", JOptionPane.ERROR_MESSAGE);
                    }else{
                        int res = JOptionPane.showConfirmDialog(null, "Cuidado, pois esta função irá remover o primeiro elemento da lista! Deseja Continuar?", "CUIDADO MAN", JOptionPane.YES_NO_CANCEL_OPTION);
                        
                        if(res == 0){
                            lista.deletarDoFim();
                            JOptionPane.showMessageDialog(null, "Elemento removido com sucesso do Inicio!", "Linked List", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            break;
                        }
                    }
                break;
                
                case "5 - Listar Elementos da Lista":
                    if(lista.estaVazia()){
                        JOptionPane.showMessageDialog(null, "Não existem Elementos na lista!", "Linked List", JOptionPane.ERROR_MESSAGE);
                    }else{ 
                        lista.mostrarLista();
                    }
                break;
                
                case "6 - Buscar Primeiro elemento da lista":
                    if(lista.estaVazia()){
                        JOptionPane.showMessageDialog(null, "Não existem Elementos na lista!", "Linked List", JOptionPane.ERROR_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null, "Primeiro Elemento da lista é: " + lista.buscarPrimeiroElemento(), "Linked List", JOptionPane.INFORMATION_MESSAGE);
                    }
                break;
                
                case "7 - Buscar Ultimo elemento da lista":
                    if(lista.estaVazia()){
                        JOptionPane.showMessageDialog(null, "Não existem Elementos na lista para remover!", "Linked List", JOptionPane.ERROR_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null, "O Ultimo Elemento da lista é: " + lista.buscarUltimoElemento(), "Linked List", JOptionPane.INFORMATION_MESSAGE);
                    }
                break;
                
                case "8 - Ver tamanho da lista":
                    if(lista.estaVazia()){
                        JOptionPane.showMessageDialog(null, "Não existem Elementos na lista!\n O Tamanho da Lista é: " + lista.tam, "Linked List", JOptionPane.ERROR_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null, "O Tamanho da Lista é: " + lista.tam, "Linked List", JOptionPane.INFORMATION_MESSAGE);
                    }
                break;
            }
        }   
    }
}
