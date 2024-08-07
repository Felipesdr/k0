import java.util.ArrayList;
import java.util.List;

public class Desafio1 {

    public  Integer somarMultiplosDe3e5(Integer range){
        List<Integer> lista = popularLista(range);
        Integer sum = 0;

        for(Integer n: lista){
            if(verificarMultiploDeCinco(n) || verificarMultiploDeTres(n)){
                sum += n;
            }
        }

        return sum;
    }

    private boolean verificarMultiploDeCinco(Integer n){
        return n % 5 ==0;
    }

    private boolean verificarMultiploDeTres(Integer n){
        return n % 3 ==0;
    }

    private List<Integer> popularLista(Integer range){
        List<Integer> lista = new ArrayList<>();
        for(int i = 0; i < range; i++){
            lista.add(i);
        }
        return lista;
    }
}
