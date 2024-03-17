import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BaekJoon2587
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer>lst = new ArrayList<>();
        int sum = 0;
        for (int i = 0 ; i < 5 ; i++){
            int a = Integer.parseInt(br.readLine());
            lst.add(a);
        }
        Collections.sort(lst);
        for (Integer integer : lst) {
            sum += integer;
        }
        int mid = lst.get(2);
        System.out.println(sum/5);
        System.out.println(mid);
    }
}
