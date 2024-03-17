import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BaekJoon1427
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] lst = br.readLine().toCharArray();
        Arrays.sort(lst);
        for (int i = lst.length - 1; i >= 0; i--) {
            System.out.print(lst[i]);
        }
    }
}
