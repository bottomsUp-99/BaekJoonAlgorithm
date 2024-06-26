import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon11005
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(str.nextToken());
        int B = Integer.parseInt(str.nextToken());

        StringBuilder sb = new StringBuilder();

        while(N != 0){
            if ((N % B) >= 10) {
                sb.append((char) ((N % B) + 55));
            } else {
                sb.append(N % B);
            }
            N /= B;
        }
        System.out.println(sb.reverse().toString());
    }
}
