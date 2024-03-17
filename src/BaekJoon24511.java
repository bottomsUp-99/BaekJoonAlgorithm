import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BaekJoon24511
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] type = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            type[i] = Integer.parseInt(st.nextToken());
        }
        Deque<Integer> queueStack = new ArrayDeque<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int element = Integer.parseInt(st.nextToken());
            if(type[i] == 0){
                queueStack.addLast(element);
            }
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while(M != 0){
            int insertNum = Integer.parseInt(st.nextToken());
            queueStack.addFirst(insertNum);
            sb.append(queueStack.pollLast()).append(" ");
            M--;
        }
        System.out.println(sb.toString());
    }
}