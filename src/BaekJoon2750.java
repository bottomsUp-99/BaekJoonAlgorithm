import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class BaekJoon2750
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i = 0 ; i< N ; i++){
            int a = Integer.parseInt(br.readLine());
            lst.add(a);
        }
        Collections.sort(lst);
        for (Object s : lst) {
            System.out.println(s);
        }
    }
}
