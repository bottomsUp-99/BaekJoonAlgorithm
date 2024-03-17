import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2839
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int con = 0;
        int min = 1666;
        int sh_3 = N / 3;
        int sh_5 = N / 5;
        for (int i = 0 ; i <= sh_3 ; i++){
            for (int j = 0 ; j <= sh_5 ; j++){
                if (3 * i + 5 * j == N){
                    con++;
                    if (min > i + j){
                        min = i + j;
                    }
                }
            }
        }
        if (con == 0){
            System.out.println(-1);
        } else {
            System.out.println(min);
        }
    }
}
