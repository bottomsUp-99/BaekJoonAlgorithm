import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon2738
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer NUM = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(NUM.nextToken());
        int M = Integer.parseInt(NUM.nextToken());

        int[][] A = new int[N][M];
        int[][] B = new int[N][M];
        for (int i = 0 ; i < N ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0 ; j < M ; j++){
                    A[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0 ; i < N ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0 ; j < M ; j++){
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < N ; i++){
            for (int j = 0 ; j < M ; j++){
                sb.append(A[i][j] + B[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
