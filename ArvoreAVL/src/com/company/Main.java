package com.company;

class Main {
    public static void main(String[] args) {

        Arvore arvore = new Arvore();
        arvore.insere_elemento(9);
        arvore.insere_elemento(12);
        arvore.insere_elemento(16);
        arvore.insere_elemento(3);
        arvore.insere_elemento(21);
        arvore.insere_elemento(13);
        arvore.insere_elemento(45);
        arvore.insere_elemento(23);
        arvore.insere_elemento(14);
        arvore.insere_elemento(8);
        arvore.insere_elemento(1);

        arvore.remove_elemento(21);

        arvore.imprimePreordem(arvore.getRaiz());

        System.out.println();

    }
}
