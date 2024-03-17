import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BaekJoon1181
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String[] lst = new String[N];
        for (int i = 0 ; i < N ; i++){
            lst[i] = br.readLine();
        }
        Arrays.sort(lst,  new Comparator<String>(){
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                else {
                    return s1.length() - s2.length();
                }
            }
        });
        sb.append(lst[0]).append('\n');
        for (int i = 1; i < N; i++) {
            if (!lst[i].equals(lst[i - 1])) {
                sb.append(lst[i]).append('\n');
            }
        }
        System.out.println(sb);
    }
}
