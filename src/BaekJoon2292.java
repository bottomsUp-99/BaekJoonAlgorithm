import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2292
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 1;
        int rest = 2;
        if (N==1) {
            System.out.println("1");
        } else {
            while (rest <= N){
                rest = rest + (6*count);
                count++;
            }
            System.out.println(count);
        }
    }
}