import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class BaekJoon11866
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> person = new ArrayDeque<>();
        for (int i = 1 ; i <= N ; i++){
            person.offer(i);
        }
        sb.append("<");
        while(person.size()>1){
            for (int j = 0 ; j < K-1 ; j++){
                person.offer(person.poll());
            }
            sb.append(person.poll()).append(", ");
        }
        sb.append(person.poll()).append(">");
        System.out.println(sb);
    }
}