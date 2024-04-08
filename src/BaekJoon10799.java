import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Stack<Character> stick = new Stack<>();

        int ans = 0;
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == '('){
                stick.push('(');
            }
            else if(str.charAt(i) == ')'){
                if(str.charAt(i - 1) == '('){
                    stick.pop();
                    ans += stick.size();
                }
                else if(str.charAt(i - 1) != '('){
                    ans += 1;
                    stick.pop();
                }
            }
        }
        System.out.print(ans);
    }
}