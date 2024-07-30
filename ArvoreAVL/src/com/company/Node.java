package com.company;

import javax.swing.tree.TreeNode;

class Node {

    Node esquerda;
    Node direita;
    private int valor;

    Node(int valor) {
        this.valor = valor;
    }

    int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Node getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Node esquerda) {
        this.esquerda = esquerda;
    }

    public Node getDireita() {
        return direita;
    }

    public void setDireita(Node direita) {
        this.direita = direita;
    }

    public int min() {
        if (esquerda == null) {
            return valor;
        }
        else {
            return esquerda.min();
        }
    }
}
