import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon3015
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] oasis = new int[N];
        for (int i = 0 ; i < N ; i++){
            oasis[i] = Integer.parseInt(br.readLine());
        }
        int result = 0;
        Stack<int[]> waitingLine = new Stack<>();
        for(int i = 0; i < N ; i++) {
            while(!waitingLine.isEmpty() && waitingLine.peek()[0] < oasis[i]) {
                result += waitingLine.pop()[1];
            }
            if(waitingLine.isEmpty()) {
                waitingLine.push(new int[] {oasis[i],1});
            }else {
                if(waitingLine.peek()[0] > oasis[i]) {
                    waitingLine.push(new int[] {oasis[i],1});
                    result++;
                } else {
                    result += waitingLine.peek()[1]++;
                    if(waitingLine.size() > 1) result++;
                }
            }
        }
        System.out.println(result);
    }
}