package com.company;

class Arvore {

    private Node raiz;

    Node getRaiz() {
        return raiz;
    }

    void insere_elemento(int valor) {

        Node novo = new Node(valor);

        if (vazia()) {
            raiz = novo;
            return;
        }

        Node pai = raiz;

        while ((pai.esquerda != null && valor < pai.getValor()) || (pai.direita != null && valor > pai.getValor())) {

            if (valor < pai.getValor())
                pai = pai.esquerda;
            else
                pai = pai.direita;
        }

        if (valor < pai.getValor())
            pai.esquerda = novo;
        else
            pai.direita = novo;

    }

    Node encontraMenorElemento(Node node) {

        Node raiz_atual = node;

        while (raiz_atual.esquerda != null) {
            raiz_atual = raiz_atual.esquerda;
        }

        return raiz_atual;
    }

    public void remove_elemento(int value) {
        raiz = remove_elemento(raiz, value);
    }

    private Node remove_elemento(Node subRaiz, int valor) {
        if (subRaiz == null) {
            return subRaiz;
        }

        if (valor < subRaiz.getValor()) {
            subRaiz.setEsquerda(remove_elemento(subRaiz.getEsquerda(), valor));
        }
        else if (valor > subRaiz.getValor()) {
            subRaiz.setDireita(remove_elemento(subRaiz.getDireita(), valor));
        }
        else {
            if (subRaiz.getEsquerda() == null) {
                return subRaiz.getDireita();
            }
            else if (subRaiz.getDireita() == null) {
                return subRaiz.getEsquerda();
            }

            subRaiz.setValor(subRaiz.getDireita().min());

            subRaiz.setDireita(remove_elemento(subRaiz.getDireita(), subRaiz.getValor()));
        }

        return subRaiz;
    }

    boolean existeElemento(int valor) {
        return encontraElemento(valor) != null;
    }

    Node encontraElemento(int valor) {
        if (vazia())
            return null;

        Node raiz_atual = raiz;

        while (raiz_atual != null) {
            if (valor == raiz_atual.getValor())
                break;

            if (valor < raiz_atual.getValor())
                raiz_atual = raiz_atual.esquerda;
            else
                raiz_atual = raiz_atual.direita;
        }

        return raiz_atual;
    }

    private boolean vazia() {
        return raiz == null;
    }

    void imprimePreordem(Node node) {
        if (node == null)
            return;
        System.out.println(node.getValor());
        imprimePreordem(node.esquerda);
        imprimePreordem(node.direita);
    }

    void imprimeInordem(Node node) {
        if (node == null)
            return;
        imprimeInordem(node.esquerda);
        System.out.println(node.getValor());
        imprimeInordem(node.direita);
    }

    void imprimePosordem(Node node) {
        if (node == null)
            return;
        imprimePosordem(node.esquerda);
        imprimePosordem(node.direita);
        System.out.println(node.getValor());
    }

    private int altura(Node node) {
        if (node != null)
            return 1 + Math.max(altura(node.esquerda), altura(node.direita));
        return 0;
    }

    private Node getPai(Node node) {

        if (node == raiz)
            return null;

        Node raiz_atual = raiz;

        while (raiz_atual != null) {
            if (node == raiz_atual.esquerda || node == raiz_atual.direita)
                break;
            if (node.getValor() < raiz_atual.getValor())
                raiz_atual = raiz_atual.esquerda;
            else
                raiz_atual = raiz_atual.direita;
        }

        return raiz_atual;

    }

    public int min() {
        if (raiz == null) {
            return Integer.MIN_VALUE;
        }
        else {
            return raiz.min();
        }
    }

}