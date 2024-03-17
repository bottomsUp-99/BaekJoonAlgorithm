import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BaekJoon1269
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        Set<Integer> alst = new HashSet<>();
        Set<Integer> blst = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < a; i++) {
            alst.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < b; i++) {
            blst.add(Integer.parseInt(st.nextToken()));
        }
        int count = 0;
        for(int num : alst) {
            if(!blst.contains(num)) {
                count += 1;
            }
        }
        for(int num : blst) {
            if(!alst.contains(num)) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}