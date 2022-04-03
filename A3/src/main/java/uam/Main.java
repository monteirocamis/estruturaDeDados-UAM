package uam;
import java.util.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaDeNumeros = new ArrayList<>();
        Stack<Integer>  pilhaDeNumeros = new Stack<>();
        Queue<Integer> filaDeNumeros = new LinkedList<>(); // força comportamento de lista
        int i;


        //Passo 1: Insira os números [1, 2, 3, 4 e 5] em uma lista - com 5 células;

        for (i = 5; i >= 1; i--) {
            listaDeNumeros.add(i);

        }
        //verifica andamento
        System.out.println("\n Passo 1: Insira os números [1, 2, 3, 4 e 5] em uma lista - com 5 células;  \n numero de celulas da lista: " + listaDeNumeros.size());
        System.out.println("inseri os elementos na lista: " + listaDeNumeros);





        //Passo 2: Remova todos os dados da lista e insira-os em uma Pilha
        // - com 5 células.
        // Deve-se sempre remover os dados da célula inicial da lista;


        while(!listaDeNumeros.isEmpty()){

            int auxiliar = listaDeNumeros.remove(0);
            pilhaDeNumeros.push(auxiliar);

            //tira da lista , coloca num elemento auxiliar e dps coloca na pilha
        }

        // avisos sobre conteudos da lista
        if (listaDeNumeros.isEmpty()) {
            System.out.println("\n Passo 2:  Remova todos os dados da lista e insira-os em uma Pilha \n limpei a lista!");
            System.out.println("elementos da PILHA : " + pilhaDeNumeros);
        } else {
            System.out.println("\n deu bug, lista não está vazia! ");
            System.out.println("numero de celulas da lista: " + listaDeNumeros.size());
            System.out.println("elementos da lista : " + listaDeNumeros);


        }




        //Passo 3: Remova os dados da Pilha e insira-os em uma Fila - com 10 células);


        //enquanto a pilha nao estiver vazia...
        while(!pilhaDeNumeros.isEmpty()) {
            int auxiliar = pilhaDeNumeros.pop();
            filaDeNumeros.add(auxiliar);
            //tira da pilha , coloca num elemento auxiliar e dps coloca na fila
        }


        //verifica se a pilha ta vazia e avisa sobre conteudos da pilha
        if (pilhaDeNumeros.isEmpty()) {
            System.out.println("\n Passo 3:Remova os dados da Pilha e insira-os em uma Fila, \n  PILHA vazia!");
            System.out.println("  elementos na FILA: " + filaDeNumeros );
        } else {

            //verifica andamento
          //  System.out.println("Passo 3:\n numero de elementos da PILHA : " + pilhaDeNumeros.size());
            System.out.println("elementos da PILHA: " + pilhaDeNumeros);

        }




        //Passo 4: Insira os números [6, 7, 8, 9 e 10] na lista;
        for (i = 10; i >= 1; i--) {
            listaDeNumeros.add(i);

        }
        //verifica andamento
        System.out.println("\n  Passo 4: Insira os números [6, 7, 8, 9 e 10] na lista  - com 10 células);  \n celulas da lista: " + listaDeNumeros.size());
        System.out.println("inseri os elementos na lista: " + listaDeNumeros);



        //Passo 5: Repita os passos 2 e 3.
        System.out.println("\n Passo 5: Repita os passos 2 e 3. ");





        //Passo 2: Remova todos os dados da lista e insira-os em uma Pilha
        // - com 5 células.
        // Deve-se sempre remover os dados da célula inicial da lista;


        while(!listaDeNumeros.isEmpty()){

            int auxiliar = listaDeNumeros.remove(0);
            pilhaDeNumeros.push(auxiliar);

            //tira da lista , coloca num elemento auxiliar e dps coloca na pilha
        }

        // avisos sobre conteudos da lista
        if (listaDeNumeros.isEmpty()) {
            System.out.println("\n Passo 2:  Remova todos os dados da lista e insira-os em uma Pilha \n limpei a lista!");
            System.out.println("elementos da PILHA : " + pilhaDeNumeros);
        } else {
            System.out.println("\n deu bug, lista não está vazia! ");
            System.out.println("numero de celulas da lista: " + listaDeNumeros.size());
            System.out.println("elementos da lista : " + listaDeNumeros);


        }




        //Passo 3: Remova os dados da Pilha e insira-os em uma Fila - com 10 células);


        //enquanto a pilha nao estiver vazia...
        while(!pilhaDeNumeros.isEmpty()) {
            int auxiliar = pilhaDeNumeros.pop();
            filaDeNumeros.add(auxiliar);
            //tira da pilha , coloca num elemento auxiliar e dps coloca na fila
        }


        //verifica se a pilha ta vazia e avisa sobre conteudos da pilha
        if (pilhaDeNumeros.isEmpty()) {
            System.out.println("\n Passo 3:Remova os dados da Pilha e insira-os em uma Fila, \n  PILHA vazia!");
            System.out.println("  elementos na FILA: " + filaDeNumeros );
        } else {

            //verifica andamento
            //  System.out.println("Passo 3:\n numero de elementos da PILHA : " + pilhaDeNumeros.size());
            System.out.println("elementos da PILHA: " + pilhaDeNumeros);

        }






        // Passo 6: Exiba todos os números que foram inseridos na fila.
        System.out.printf("\n Passo 6:Exiba todos os números que foram inseridos na fila. \n ");
        for(Integer numeroDaFila: filaDeNumeros){

              System.out.printf(" %d ,", numeroDaFila);

        }




    }



}