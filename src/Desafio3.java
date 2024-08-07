public class Desafio3 {

    public Long encontrarMaiorFator(Long n){

        long i;

        for (i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    n /= i;
                }
            }
        }

       return n;
    }
}
