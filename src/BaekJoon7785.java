import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BaekJoon7785
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<String> log = new HashSet<>();
        StringTokenizer st;
        for (int i = 0 ; i < n ; i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String state = st.nextToken();
            if (state.equals("enter")){
                log.add(name);
            } else {
                log.remove(name);
            }
        }
        ArrayList<String> list = new ArrayList<String>(log);
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for (int j = list.size()-1 ; j >=0 ; j--){
            sb.append(list.get(j)).append('\n');
        }
        System.out.println(sb);
    }
}