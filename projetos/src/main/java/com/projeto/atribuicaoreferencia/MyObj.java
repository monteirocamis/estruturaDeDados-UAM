package com.projeto.atribuicaoreferencia;

public class MyObj {

    Integer num;

    public MyObj(Integer num) {
        this.num = num;
    }

    public void setNum(Integer num){
        this.num = num;

    }
    @Override
    public String toString() {
        return this.num.toString();
    }

}
