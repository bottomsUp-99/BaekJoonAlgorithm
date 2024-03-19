import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BaekJoon6549 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] list = new int[n-1];
        for (int i = 0 ; i < n -1 ; i++){
            list[i] = Integer.parseInt(st.nextToken());
        }
        Stack<Integer> rect = new Stack<>();
    }
}
