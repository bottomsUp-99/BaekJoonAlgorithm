import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BaekJoon4134
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        while(t --> 0){
            long num = Long.parseLong(br.readLine());
            BigInteger prime = new BigInteger(String.valueOf(num));
            boolean prime_check = false;
            for (int i = 2 ; i <= Math.sqrt(num) ; i++){
                if (num % i == 0){
                    prime_check = true;
                }
            }
            if (prime_check){
                sb.append(prime.nextProbablePrime());
            } else if (num == 0 || num == 1) {
                sb.append(prime.nextProbablePrime());
            } else {
                sb.append(num);
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}