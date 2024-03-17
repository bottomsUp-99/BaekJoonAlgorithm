import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon9086
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] arr = new String[T];
        for(int i = 0 ; i < T ; i++){
            String str = new String(br.readLine());
            arr[i] = str.substring(0,1) + str.substring(str.length()-1, str.length());
        }
        for (int i = 0 ; i < T ; i++){
            System.out.println(arr[i]);
        }
    }
}