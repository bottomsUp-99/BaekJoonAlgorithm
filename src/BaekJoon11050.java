import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon11050
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
//        int ans = 1;
//        for (int i = N ; i > 0 ; i--){
//            ans *= i;
//        }
//        for (int i = K ; i > 0 ; i--){
//            ans /= i;
//        }
//        for (int i = N - K; i > 0 ; i--) {
//            ans /= i;
//        }
//        System.out.println(ans);
        System.out.println(factorial(N) / (factorial(N-K) * factorial(K)));
    }
    static int factorial(int N){
        int ans = 1;
        if (N <= 1)	{
            return 1;
        }
        return N * factorial(N - 1);
    }
}
