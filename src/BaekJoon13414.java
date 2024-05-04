import java.io.*;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class BaekJoon13414
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        LinkedHashSet<String> list = new LinkedHashSet<>();
        for(int i = 0 ; i < L ; i++) {
            String num = br.readLine();
            if(list.contains(num)){
                list.remove(num);
            }
            list.add(num);
        }
        for(String num : list) {
            if(K <= 0) {
                break;
            }
            sb.append(num).append("\n");
            K--;
        }
        System.out.println(sb);
    }
}