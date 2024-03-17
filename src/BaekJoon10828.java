import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BaekJoon10828
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stk = new Stack<>();
        StringTokenizer str;
        for (int i = 0 ; i < N ; i++){
            str = new StringTokenizer(br.readLine());
            String s = str.nextToken();
            switch (s){
                case "push":
                    stk.push(Integer.parseInt(str.nextToken()));
                    break;
                case "pop":
                    if (!stk.isEmpty()){
                        System.out.println(stk.pop());
                    } else {
                        System.out.println(-1);
                    }
                    break;
                case "size":
                    System.out.println(stk.size());
                    break;
                case "empty":
                    if (stk.empty()){
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case "top":
                    if (!stk.empty()){
                        System.out.println(stk.peek());
                        //System.out.println("c");
                    } else {
                        System.out.println(-1);
                    }
                    break;
            }
        }
    }
}
