import java.io.*;
import java.util.EmptyStackException;
import java.util.Stack;
import java.util.StringTokenizer;

public class BaekJoon1406
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        int M = Integer.parseInt(br.readLine());

        Stack<String> front = new Stack<>();
        Stack<String> back = new Stack<>();

        String[] arr = line.split("");
        for(String s : arr) {
            front.push(s);
        }

        for(int i = 0; i < M; i++) {
            String command = br.readLine();
            char c = command.charAt(0);

            switch(c) {
                case 'L':
                    if(!front.isEmpty())
                        back.push(front.pop());

                    break;

                case 'D':
                    if(!back.isEmpty())
                        front.push(back.pop());
                    break;

                case 'B':
                    if(!front.isEmpty()) {
                        front.pop();
                    }
                    break;

                case 'P':
                    char t = command.charAt(2);
                    front.push(String.valueOf(t));
                    break;

                default:
                    break;
            }
        }
        while(!front.isEmpty())
            back.push(front.pop());
        while(!back.isEmpty())
            bw.write(back.pop());
        bw.flush();
        bw.close();
    }
}