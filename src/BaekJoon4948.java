import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon4948
{
    public static boolean[] primeNum = new boolean[246913];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        isPrime();
        while(true){
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            int count = 0;
            for(int i = n + 1; i <= 2 * n; i++) {
                if(!primeNum[i]) count++;
            }
            sb.append(count).append('\n');
        }
        System.out.println(sb);
    }
    public static void isPrime(){
        primeNum[0] = primeNum[1] = true;
        for(int i = 2; i <= Math.sqrt(primeNum.length); i++) {
            for(int j = i * i; j < primeNum.length; j += i) {
                primeNum[j] = true;
            }
        }
    }
}
