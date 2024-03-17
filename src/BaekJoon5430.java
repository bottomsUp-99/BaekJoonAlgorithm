import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class BaekJoon5430
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < T ; i++){
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String arr = br.readLine();
            Deque<Integer> qq = new ArrayDeque<>();
            for (String s : arr.substring(1, arr.length() - 1).split(",")) {
                if (!s.equals("")) {
                    qq.offer(Integer.valueOf(s));
                }
            }
            AC(qq, p);
        }
    }
    public static void AC(Deque<Integer> deque, String p){
        boolean isRight = true;
        for (int i = 0 ; i < p.length() ; i++){
            if (p.charAt(i) == 'R'){
                isRight = !isRight;
            } else {
                if (deque.isEmpty()){
                    System.out.println("error");
                    return;
                } else if (isRight) {
                    deque.removeFirst();
                } else {
                    deque.removeLast();
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        if(!deque.isEmpty()) {
            if(isRight) {
                sb.append(deque.pollFirst());
                while(!deque.isEmpty()) {
                    sb.append(',').append(deque.pollFirst());
                }
            }
            else {
                sb.append(deque.pollLast());
                while(!deque.isEmpty()) {
                    sb.append(',').append(deque.pollLast());
                }
            }
        }
        sb.append(']');
        System.out.println(sb);
    }
}