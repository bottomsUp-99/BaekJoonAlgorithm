import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BaekJoon28278{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer str;
        int n;
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stk = new Stack<>();
        for (int i = 0 ; i < N ; i++){
            str = new StringTokenizer(br.readLine());
            n = Integer.parseInt(str.nextToken());
            switch (n){
                case 1:
                    int X = Integer.parseInt(str.nextToken());
                    stk.push(X);
                    break;
                case 2:
                    if (!stk.isEmpty()){
                        sb.append(stk.pop()).append('\n');
                    } else {
                        sb.append(-1).append('\n');
                    }
                    break;
                case 3:
                    sb.append(stk.size()).append('\n');
                    break;
                case 4:
                    if (stk.isEmpty()){
                        sb.append(1).append('\n');
                    } else {
                        sb.append(0).append('\n');
                    }
                    break;
                case 5:
                    if (!stk.isEmpty()){
                        sb.append(stk.peek()).append('\n');
                    } else {
                        sb.append(-1).append('\n');
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}
