import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class BaekJoon12789
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> currentLine = new ArrayDeque<>();
        Stack<Integer> anotherLine = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int j = 0; j < N; j++) {
            currentLine.offer(Integer.parseInt(st.nextToken()));
        }
        giveSnack(currentLine, anotherLine);
    }
    public static void giveSnack(Queue<Integer> q, Stack<Integer> s){
        int snackNum = 1;
        while(!q.isEmpty()) {
            if(q.peek() == snackNum) {
                q.poll();
                snackNum++;
            }else if(!s.isEmpty() && s.peek() == snackNum) {
//            }else if(s.peek() == snackNum) {
                s.pop();
                snackNum++;
            }else {
                s.push(q.poll());
            }
        }
        while(!s.isEmpty()) {
            if(s.peek() == snackNum) {
                s.pop();
                snackNum++;
            }else {
                System.out.println("Sad");
                return;
            }
        }
        System.out.println("Nice");
    }
}
