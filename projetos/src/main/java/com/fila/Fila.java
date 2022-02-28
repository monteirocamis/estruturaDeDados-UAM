package com.fila;

public class Fila<T>  {

    private No<T> refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;

    }





    public void enqueue(T object){
        No novoNo = new No(object);

        novoNo.setRefNo(refNoEntradaFila);       //--->           entra na fila aponta pro ultimo e muda pro prox
        refNoEntradaFila = novoNo;               //--->          muda ref entrada o novono

    }





    //quem eh o primeiro da fila
    public T first(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            while(true){
                if(primeiroNo.getRefNo() != null){ // se nao tiver nos a frente
                    primeiroNo = primeiroNo.getRefNo(); //pega e passa a ser o prox da fila
                }else{
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }





//desenfilerar
    public T dequeue(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while(true){
                if(primeiroNo.getRefNo() != null){ // se nao tiver nos a frente
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo(); //pega e passa a ser o prox da fila

                }else{
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }





    public  boolean isEmpty(){
        return refNoEntradaFila == null ? true : false;
    }





    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;

        if(refNoEntradaFila != null){   //se a fila nao estivet vazia
            while(true){
                stringRetorno += "[No { objeto= " + noAuxiliar.getObject() + " }] --> ";

                if(noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else{
                    stringRetorno += "null";
                    break;
                }
            }
        }else{
            stringRetorno = "null";
        }


        return stringRetorno;
    }
}







