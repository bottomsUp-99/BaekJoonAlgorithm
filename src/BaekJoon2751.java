import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BaekJoon2751
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer>lst = new ArrayList<>();
        for (int i = 0 ; i < N ; i++){
            lst.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(lst);
        for (int n : lst){
            sb.append(n).append('\n');
        }
        System.out.println(sb);
    }
}
