import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BaekJoon16165
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, List<String>> girlGroupInfo = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String group = br.readLine();
            int numberOfGroup = Integer.parseInt(br.readLine());
            List<String> memberName = new ArrayList<>();
            for (int j = 0; j < numberOfGroup; j++) {
                memberName.add(br.readLine());
            }
            girlGroupInfo.put(group, memberName);
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            int condition = Integer.parseInt(br.readLine());
            if (condition == 0) {
                List<String> list = girlGroupInfo.get(name);
                Collections.sort(list);
                for (String memberName : list) {
                    sb.append(memberName).append("\n");
                }
            } else {
                for (String group : girlGroupInfo.keySet()) {
                    if (girlGroupInfo.get(group).contains(name)) {
                        sb.append(group).append("\n");
                        break;
                    }
                }
            }
        }
        System.out.println(sb);
    }
}