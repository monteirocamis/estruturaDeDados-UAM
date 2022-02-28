package com.listaEncadeada;

public class No<T> {
    private T conteudo;
    private No proximoNo = null;

    public No(T conteudo) {
        this.conteudo = conteudo;
    }

    public No(T conteudo, No proximoNo) {
        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
    }

    public T getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximoNo() {
        return this.proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    public String toString() {
        return "No{" + this.conteudo + "}";
    }

    public String toStringEncadeado() {
        String str = "No{" + this.conteudo + "}";
        if (this.proximoNo != null) {
            str = str + "->" + this.proximoNo.toString();
        } else {
            str = str + "->null";
        }

        return str;
    }
}
