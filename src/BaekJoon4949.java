import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon4949
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true){
            String s = br.readLine();
            if (s.charAt(0) == '.'){
                break;
            }
            sb.append(psStack(s)).append('\n');
        }
        System.out.println(sb);
    }
    public static String psStack(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '[') {
                stack.push(c);
            }
            else if(c == ')') {
                if(stack.empty() || stack.peek() != '(') {
                    return "no";
                }
                else {
                    stack.pop();
                }
            }
            else if(c == ']') {
                if(stack.empty() || stack.peek() != '[') {
                    return "no";
                }
                else {
                    stack.pop();
                }
            }
        }
        if(stack.empty()) {
            return "yes";
        }
        else {
            return "no";
        }
    }
}