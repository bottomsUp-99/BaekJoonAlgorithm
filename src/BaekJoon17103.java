import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.jar.JarEntry;

public class BaekJoon17103
{
    static boolean[] primeNum = new boolean[1000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        isPrime();
        int testCase = Integer.parseInt(br.readLine());
        for (int i = 0 ; i < testCase ; i++){
            int N = Integer.parseInt(br.readLine());
            int goldPart = 0;
            if ( N % 2 ==0 && N != 0){
                for (int j = 2 ; j <= N / 2  ; j++){
                    if (!primeNum[j]){
                        if (!primeNum[N - j]){
                            goldPart++;
                        }
                    }
                }
                sb.append(goldPart).append('\n');
            } else {
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);
    }
      static void isPrime(){
//          primeNum[0] = primeNum[1] = true;
//          for(int i = 2; i <= Math.sqrt(primeNum.length); i++) {
//              for(int j = i * i; j < primeNum.length; j += i) {
//                  primeNum[j] = true;
//              }
//          }
        primeNum[0] = primeNum[1] = true;
        for (int i = 2 ; i < primeNum.length ; i++){
            if(!primeNum[i]){
                for (int j = 2 ; i * j < primeNum.length ; j ++){
                    primeNum[i * j] = true;
                }
            }
        }
    }
}
