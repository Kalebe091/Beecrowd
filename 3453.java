import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();
        long K = sc.nextLong();
        
        long jogadaAlice = primeiraJogada(N, K);
        
        if (jogadaAlice != -1) {
            System.out.println(jogadaAlice);
        } else {
            System.out.println("Não há jogadas possíveis para Alice");
        }
    }
    
    public static long primeiraJogada(long N, long jogadaBob) {

        ArrayList<Long> numeros = new ArrayList<Long>();
        for (long i = 1; i <= 2*N; i++) {
            numeros.add(i*i);
        }
        
        numeros.remove(jogadaBob);
        
        ArrayList<Long> possiveisJogadas = new ArrayList<Long>();
        for (long num : numeros) {
            if (Math.abs(num - jogadaBob) % (2*N + 1) == 0) {
                possiveisJogadas.add(num);
            }
        }
        
        if (!possiveisJogadas.isEmpty()) {
            long jogadaAlice = possiveisJogadas.get(0);
            for (long num : possiveisJogadas) {
                if (num > jogadaAlice) {
                    jogadaAlice = num;
                }
            }
            return jogadaAlice;
        } else {
            return -1;
        }
    }
}
