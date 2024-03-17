import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon2480
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(str.nextToken());
        int b = Integer.parseInt(str.nextToken());
        int c = Integer.parseInt(str.nextToken());

        if( a!=b && b!=c && a !=c){
            int max = Math.max(a, Math.max(b,c));
            System.out.println(max*100);
        } else if (a == b && a==c) {
            System.out.println(10000 + a*1000);
        } else if (a == b || a==c) {
            System.out.println(1000 + a*100);
        }
        else {
            System.out.println(1000+b*100);
        }
    }
}