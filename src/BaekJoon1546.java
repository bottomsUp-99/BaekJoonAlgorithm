import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon1546
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double arr[] = new double[Integer.parseInt(br.readLine())];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = Double.parseDouble(st.nextToken());
        }
        Arrays.sort(arr);
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = arr[i] / arr[arr.length-1] * 100;
        }
        double sum = 0;
        for (int i =0 ; i < arr.length ; i++){
            sum += arr[i];
        }
        System.out.println(sum/arr.length);
    }
}
