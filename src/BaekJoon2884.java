import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon2884
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(str.nextToken());
        int M = Integer.parseInt(str.nextToken());

        if (M < 45){
            if (H == 0) {
                int x = 60-(45-M);
                System.out.println("23"+" "+x);
            }
            else {
                int y = 60-(45-M);
                System.out.println((H-1)+" "+y);
            }
        }
        else {
            System.out.println(H+" "+(M-45));
        }
    }
}