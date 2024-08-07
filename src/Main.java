
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Desafio 1
        Desafio1 desafio1 = new Desafio1();
        Integer resultadoDesafio1 = desafio1.somarMultiplosDe3e5(1000);
        System.out.println("O resultado do desafio 1 é:" + resultadoDesafio1);

        //Desafio 2
        Desafio2 desafio2 = new Desafio2();
        Integer resultadoDesafio2 = desafio2.somarNumerosParesDaSequenciaFibonacci(4000000);
        System.out.println("O resultado do desafio 2 é:" + resultadoDesafio2);

        //Desafio 3
        Desafio3 desafio3 = new Desafio3();
        Long resultadoDesafio3 = desafio3.encontrarMaiorFator(600851475143L);
        System.out.println("O resultado do desafio 3 é:" + resultadoDesafio3);
    }
}