package com.luis.linkedlist;

public class No {   
    private Object info; // variavel que será o conteúdp do nosso No
    private No proximo = null; // criamos um ponteiro que é um link para o próximo No

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
