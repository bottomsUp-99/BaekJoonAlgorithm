import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class BaekJoon9506
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = 0;
        while (n != -1){
            ArrayList<Integer> list = new ArrayList<>();
            n = Integer.parseInt(br.readLine());
            if (n == -1){
                break;
            }
            for (int j = 1 ; j < n ; j++){
                if (n % j == 0){
                    list.add(j);
                }
            }
            Collections.sort(list);
            int sum = 0;
            for (Integer value : list) {
                sum += value;
            }
            if (sum == n){
                sb.append(n).append(" = ");
                for (Integer integer : list) {
                    sb.append(integer).append(" + ");
                }
                sb.delete(sb.length()-3, sb.length());
            } else {
                sb.append(n).append(" is NOT perfect.");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
