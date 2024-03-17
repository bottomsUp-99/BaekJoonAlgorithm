import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BaekJoon25305
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        ArrayList<Integer>lst = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0 ; i < N ; i++){
            lst.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(lst);
        Collections.reverse(lst);
        int cut = Integer.parseInt(String.valueOf(lst.get(k-1)));
        System.out.println(cut);
    }
}
