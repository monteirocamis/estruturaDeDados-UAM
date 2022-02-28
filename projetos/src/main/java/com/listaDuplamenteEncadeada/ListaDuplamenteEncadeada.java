package com.listaDuplamenteEncadeada;

public class ListaDuplamenteEncadeada<T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private int tamanhoLista = 0;

    public ListaDuplamenteEncadeada() {
    }

    public void add(T elemento) {
        NoDuplo<T> novoNo = new NoDuplo(elemento);
        novoNo.setNoProximo((NoDuplo)null);
        novoNo.setNoPrevio(this.ultimoNo);
        if (this.primeiroNo == null) {
            this.primeiroNo = novoNo;
        }

        if (this.ultimoNo != null) {
            this.ultimoNo.setNoProximo(novoNo);
        }

        this.ultimoNo = novoNo;
        ++this.tamanhoLista;
    }

    public void add(int index, T elemento) {
        NoDuplo<T> noAuxiliar = this.getNo(index);
        NoDuplo<T> novoNo = new NoDuplo(elemento);
        novoNo.setNoProximo(noAuxiliar);
        if (novoNo.getNoProximo() != null) {
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
            novoNo.getNoProximo().setNoPrevio(novoNo);
        } else {
            novoNo.setNoPrevio(this.ultimoNo);
            this.ultimoNo = novoNo;
        }

        if (index == 0) {
            this.primeiroNo = novoNo;
        } else {
            novoNo.getNoPrevio().setNoProximo(novoNo);
        }

        ++this.tamanhoLista;
    }

    public void remove(int index) {
        if (index == 0) {
            this.primeiroNo = this.primeiroNo.getNoProximo();
            if (this.primeiroNo != null) {
                this.primeiroNo.setNoPrevio((NoDuplo)null);
            }
        } else {
            NoDuplo<T> noAuxiliar = this.getNo(index);
            noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());
            if (noAuxiliar != this.ultimoNo) {
                noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());
            } else {
                this.ultimoNo = noAuxiliar;
            }
        }

        --this.tamanhoLista;
    }

    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    private NoDuplo<T> getNo(int index) {
        NoDuplo<T> noAuxiliar = this.primeiroNo;

        for(int i = 0; i < index && noAuxiliar != null; ++i) {
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        return noAuxiliar;
    }

    public int size() {
        return this.tamanhoLista;
    }

    public String toString() {
        String strRetorno = "";
        NoDuplo<T> noAuxiliar = this.primeiroNo;

        for(int i = 0; i < this.size(); ++i) {
            strRetorno = strRetorno + "[No{conteudo=" + noAuxiliar.getConteudo() + "}]--->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        strRetorno = strRetorno + "null";
        return strRetorno;
    }
}
