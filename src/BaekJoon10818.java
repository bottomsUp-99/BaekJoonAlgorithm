import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon10818
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer str = new StringTokenizer(br.readLine());

        int count = 0;
        int[] arr = new int[N];
        while(str.hasMoreTokens()){
            arr[count] = Integer.parseInt(str.nextToken());
            count++;
        }
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[N-1]);
    }
}