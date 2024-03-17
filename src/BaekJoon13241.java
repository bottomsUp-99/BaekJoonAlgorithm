import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon13241
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        Long A = Long.parseLong(st.nextToken());
        Long B = Long.parseLong(st.nextToken());
        if(A > B){
            sb.append(A*B/gcd(A, B));
        }else if(A < B){
            sb.append(A*B/gcd(A, B));
        }else{
            sb.append(A);
        }
        System.out.println(sb);
    }
    public static long gcd(long A, long B){
        while(B != 0){
            long R = A%B;
            A = B;
            B = R;
        }
        return A;
    }
}
