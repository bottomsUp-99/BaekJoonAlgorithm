import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon1735
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str;
        int[] son = new int[2];
        int[] par = new int[2];
        for (int i = 0 ; i < 2 ; i++){
            str = new StringTokenizer(br.readLine());
            son[i] = Integer.parseInt(str.nextToken());
            par[i] = Integer.parseInt(str.nextToken());
        }
        int lcm = par[0]*par[1]/gcd(par[0], par[1]);
        int num = son[0]*(lcm/par[0]) + son[1]*(lcm/par[1]);
        int abbreviation = gcd(lcm, num);
        if (abbreviation != 1){
            lcm /= abbreviation;
            num /= abbreviation;
        }
        System.out.println(num + " " + lcm);
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
