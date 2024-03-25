import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BaekJoon3986
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0 ;
//        for (int i = 0 ; i < N ; i++) {
//            String goodWord = br.readLine();;
//            String condition1 = "AA";
//            String condition2 = "BB";
//            while(true) {
//                if(!goodWord.contains(condition1)&& !goodWord.contains(condition2)) break;
//                if(goodWord.contains(condition1)) {
//                    goodWord = goodWord.replaceAll(condition1, "");
//                }
//                if(goodWord.contains(condition2)) {
//                    goodWord = goodWord.replaceAll(condition2, "");
//                }
//            }
//            if(goodWord.isEmpty()) {
//                count++;
//            }
//        } 요건 시간초과
        for(int i = 0 ; i < N ; i++) {
            String line = br.readLine();
            Stack<Character> goodWord = new Stack<>();
            for(int j = 0 ; j < line.length() ; j++) {
                if(!goodWord.isEmpty() && goodWord.peek() == line.charAt(j)) {
                    goodWord.pop();
                }else {
                    goodWord.push(line.charAt(j));
                }
            }
            if(goodWord.isEmpty()) count++;
        }
        System.out.println(count);
        //시간제한 1초인데 우케 이중 for 문이 맞았다는교..?
    }
}
