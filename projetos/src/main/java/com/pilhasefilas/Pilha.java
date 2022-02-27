package com.pilhasefilas;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha; //cria
        refNoEntradaPilha = novoNo;  //reatribui
        refNoEntradaPilha.setRefNo(refAuxiliar); // prox com o ult
    }

    public No pop(){
        if(!this.isEmpty()){
            No noPoped = refNoEntradaPilha; //cria
            refNoEntradaPilha = refNoEntradaPilha.getRefNo(); //pega prox
            return noPoped;
        }
        return null;
    }

    public  No top(){
        return refNoEntradaPilha;
    }


    public boolean isEmpty(){
      /*  if(refNoEntradaPilha == null){
            return true;
        }

        return false
               */
        return refNoEntradaPilha == null ? true : false;
    }

    @Override
        public String toString(){
        String stringRetorno = "--------------\n";
        stringRetorno += "    Pilha\n";
        stringRetorno +=  "--------------\n";

        No noAuxiliar = refNoEntradaPilha;

        while (true){
            if(noAuxiliar != null){
                stringRetorno += " [No{dado= " + noAuxiliar.getDado() + " }]\n";
                noAuxiliar  = noAuxiliar.getRefNo(); // passa a ser o prox no, ate chegar na pilha que é null
            }else{
                break;
            }
        }
            stringRetorno += "----- FIM ------\n";
            return stringRetorno;


    }


}
