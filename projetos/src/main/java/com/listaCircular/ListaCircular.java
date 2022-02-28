package com.listaCircular;

public class ListaCircular<T> {
    private No<T> cabeca = null;
    private No<T> cauda = null;
    private int tamanhoLista = 0;

    public ListaCircular() {
    }

    public void add(T conteudo) {
        No<T> novoNo = new No(conteudo);
        if (this.tamanhoLista == 0) {
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setNoProximo(this.cauda);
        } else {
            novoNo.setNoProximo(this.cauda);
            this.cabeca.setNoProximo(novoNo);
            this.cauda = novoNo;
        }

        ++this.tamanhoLista;
    }

    public void remove(int index) {
        if (index >= this.tamanhoLista) {
            throw new IndexOutOfBoundsException("O índice maior que o tamanho da lista");
        } else {
            No<T> noAuxiliar = this.cauda;
            if (index == 0) {
                this.cauda = this.cauda.getNoProximo();
                this.cabeca.setNoProximo(this.cauda);
            } else if (index == 1) {
                this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
            } else {
                for(int i = 0; i < index - 1; ++i) {
                    noAuxiliar = noAuxiliar.getNoProximo();
                }

                noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
            }

            --this.tamanhoLista;
        }
    }

    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    private No<T> getNo(int index) {
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("A lista está vazia");
        } else if (index == 0) {
            return this.cauda;
        } else {
            No<T> noAuxiliar = this.cauda;

            for(int i = 0; i < index && noAuxiliar != null; ++i) {
                noAuxiliar = noAuxiliar.getNoProximo();
            }

            return noAuxiliar;
        }
    }

    public boolean isEmpty() {
        return this.tamanhoLista == 0;
    }

    public int size() {
        return this.tamanhoLista;
    }

    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = this.cauda;

        for(int i = 0; i < this.size(); ++i) {
            strRetorno = strRetorno + "[No{conteudo=" + noAuxiliar.getConteudo() + "}]--->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        strRetorno = strRetorno + (this.size() != 0 ? "(Retorna ao início)" : "[]");
        return strRetorno;
    }
}
