import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BaekJoon17298
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] list = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
//        for (int i = 0 ; i < N ; i ++){
//            list[i] = Integer.parseInt(st.nextToken());
//        }
//        for (int i = 0 ; i < N - 1 ; i++){
//            Stack<Integer> rightBigNum = new Stack<>();
//            int iNum = list[i];
//            int count = 0;
//            int ans = 0;
//            for (int j = i + 1 ; j < N ; j++){
//                rightBigNum.push(list[j]);
//            }
//            while(!rightBigNum.isEmpty()){
//                int comNum = rightBigNum.pop();
//                if (comNum > iNum){
//                    ans = comNum;
//                    count++;
//                }
//            }
//            if (count == 0){
//                sb.append(-1).append(" ");
//            } else {
//                sb.append(ans).append(" ");
//            }
//        }
//        sb.append(-1);
//        System.out.println(sb);
        Stack<Integer> store = new Stack<>();
        store.push(Integer.parseInt(st.nextToken()));
        for (int i = 1 ; i < N - 1 ; i++){
            int nextNum = Integer.parseInt(st.nextToken());
            while(!store.isEmpty()){

            }
            if (store.peek() < nextNum){
                store.pop();
                store.push(nextNum);
                sb.append(nextNum).append(" ");
            }
        }
        sb.append(-1);
        System.out.println(sb);
    }
}