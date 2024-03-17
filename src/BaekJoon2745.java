import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BaekJoon2745
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        String N = new String(str.nextToken());
        Integer B = Integer.parseInt(str.nextToken());
        int tmp = 1;
        int sum = 0;
        for (int i = N.length()-1 ; i >= 0 ; i--){
            char C = N.charAt(i);

            if ('A' <= C && C <= 'Z'){
                sum += (C - 'A' + 10)*tmp;
            }else {
                sum += (C - '0')*tmp;
            }
            tmp *= B;
        }
        System.out.println(sum);
    }
}
