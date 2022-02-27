import com.projeto.atribuicaoreferencia.MyObj;

public class Main {
    public static void main(String[] args){


        int intA = 1;
        int intB = intA;

        System.out.println(" intA= " + intA + " intB= " + intB);
         intA = 2;
        System.out.println(" intA= " + intA + " intB= " + intB);

        MyObj objA;
        objA = new MyObj(1);
        MyObj objB = objA;
        System.out.println(" objA= " + objA + " objB= " + objB);
        objA.setNum(2);
        System.out.println(" objA= " + objA + " objB= " + objB);


    }
}
