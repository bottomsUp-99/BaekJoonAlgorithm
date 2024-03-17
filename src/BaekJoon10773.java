import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon10773
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stk = new Stack<>();
        int K = Integer.parseInt(br.readLine());
        for (int i = 0 ; i < K ; i++){
            int n = Integer.parseInt(br.readLine());
            if (n == 0){
                stk.pop();
            } else {
                stk.push(n);
            }
        }
        int sum = 0;
        for (int num : stk){
            sum += num;
        }
//        while (stk.isEmpty()){
//            sum+=stk.pop();
//        }
        System.out.println(sum);
    }
}
