import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2441
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0 ; i < N ; i++){
            for (int k = N - i ; k < N ; k++){
                System.out.print(" ");
            }
            for (int j = N - i ; j > 0 ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
