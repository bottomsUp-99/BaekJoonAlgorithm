import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BaekJoon3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numList = new int[n];
        HashSet<Integer> compareList = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0 ; i < numList.length ; i++){
            numList[i] = Integer.parseInt(st.nextToken());
            compareList.add(numList[i]);
        }
        int x = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0 ; i < numList.length ; i++){
            if (compareList.contains(x - numList[i])){
                count++;
            }
        }
        System.out.println(count/2);
    }
}
