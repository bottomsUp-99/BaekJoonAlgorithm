import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon2566
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[9][9];
            for (int j = 0 ; j < 9 ; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int k = 0 ; k < 9 ; k++){
                    arr[j][k] = Integer.parseInt(st.nextToken());
            }
        }
        int max = -1;
        int max_x = -1;
        int max_y = -1;
        for (int j = 0 ; j < 9 ; j++){
            for (int k = 0 ; k < 9 ; k++){
                if (max < arr[j][k]){
                    max = arr[j][k];
                    max_x = j+1;
                    max_y = k+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(max_x + " " + max_y);
    }
}
