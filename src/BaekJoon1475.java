import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int[] count = new int[10];
        for(char c : N.toCharArray()) {
            int num = c - '0';
            if(num == 9) {
                num = 6;
            }
            count[num]++;
        }
        count[6] = count[6]/2 + count[6]%2;
        Arrays.sort(count);
        System.out.println(count[9]);
    }
}
