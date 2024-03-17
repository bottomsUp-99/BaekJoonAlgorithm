import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BaekJoon2493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Stack<int[]> koi = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++) {
            int tower = Integer.parseInt(st.nextToken());
            if(koi.isEmpty()) {
                sb.append(0 + " ");
            }
            else{
                while(true) {
                    int[] info = koi.peek();
                    int infoIndex = info[0];
                    int infoHeight = info[1];
                    if(infoHeight > tower) {
                        sb.append(infoIndex + " ");
                        break;
                    }else {
                        koi.pop();
                    }
                    if(koi.isEmpty()) {
                        sb.append(0 + " ");
                        break;
                    }
                }
            }
            koi.push(new int[] { i + 1 , tower});
        }
        System.out.println(sb);
    }
}