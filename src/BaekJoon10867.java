import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BaekJoon10867
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<Integer> distinct = new HashSet<>();
        for (int i = 0 ; i < N ; i++) {
            distinct.add(Integer.parseInt(st.nextToken()));
        }
        ArrayList<Integer> arr = new ArrayList<>(distinct);

        Collections.sort(arr);
        for (int a : arr){
            sb.append(a).append(" ");
        }
        System.out.println(sb);
    }
}
