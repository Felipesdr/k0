import java.util.ArrayList;
import java.util.List;

public class Desafio2 {

    public Integer somarNumerosParesDaSequenciaFibonacci(Integer valorMaximo){

        Integer sum =0;
        List<Integer> sequenciaFibbonaci = popularListaComFibonnaci(valorMaximo);

        for(Integer n: sequenciaFibbonaci){
            if(verificarSeEPar(n)){
                sum += n;
            }
        }

        return sum;
    }

    private boolean verificarSeEPar(Integer n){
        return n % 2 == 0;
    }

    private List<Integer> popularListaComFibonnaci(Integer valorMaximo){
        List<Integer> sequenciaFibonacci = new ArrayList<>();
        Integer valorAtual = 0;
        int i = 0;

        while (valorAtual < valorMaximo){

            if(i == 0){
                sequenciaFibonacci.add(1);
            }

            if(i == 1){
                sequenciaFibonacci.add(2);
            }

            if(i > 1){
                valorAtual = sequenciaFibonacci.get(i-1) + sequenciaFibonacci.get(i - 2);
                sequenciaFibonacci.add(valorAtual);
            }
            i++;
        }
        return sequenciaFibonacci;
    }
}
