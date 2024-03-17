import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class BaekJoon10845
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> q = new ArrayDeque<>();
        StringTokenizer st;
        int lastNum = 0;
        for (int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            switch (s){
                case "push":
                    lastNum = Integer.parseInt(st.nextToken());
                    q.offer(lastNum);
                    break;
                case "pop":
                    if (!q.isEmpty()){
                        System.out.println(q.poll());
                    } else {
                        System.out.println(-1);
                    }
                    break;
                case "size":
                    System.out.println(q.size());
                    break;
                case "empty":
                    if (q.isEmpty()){
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case "front":
                    if (!q.isEmpty()){
                        System.out.println(q.peek());
                    } else {
                        System.out.println(-1);
                    }
                    break;
                case "back":
                    if (!q.isEmpty()){
                        System.out.println(lastNum);
                    } else {
                        System.out.println(-1);
                    }
                    break;
            }
        }
    }
}