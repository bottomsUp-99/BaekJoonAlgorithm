import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BaekJoon1929
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(str.nextToken());
        int N = Integer.parseInt(str.nextToken());
        for (int i = M ; i <= N ; i++){
            BigInteger num = new BigInteger(String.valueOf(i));
            if (num.isProbablePrime(10)){
                //sb.append(i).append('\n');
                //sb.append(i).append("\n");
                //sb.append(i + "\n");
                //sb.append(i + '\n');
            }
        }
        System.out.println(sb);
    }
}