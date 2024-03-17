import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon9063
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if (N == 1){
            System.out.println("0");
            System.exit(0);
        }
        int x;
        int y;
        int max_x;
        int min_x;
        int max_y;
        int min_y;
        StringTokenizer st = new StringTokenizer(br.readLine());
        max_x = Integer.parseInt(st.nextToken());
        min_x = max_x;
        max_y = Integer.parseInt(st.nextToken());
        min_y = max_y;
        for (int i = 0 ; i < N-1 ; i++){
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            if (x >= max_x){
                max_x = x;
            } else if (min_x > x){
                min_x = x;
            }
            if (y >= max_y){
                max_y = y;
            } else if (min_y > y){
                min_y = y;
            }
        }
        System.out.println((max_x - min_x)*(max_y - min_y));
    }
}
