import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon10871
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(str.nextToken());
        int X = Integer.parseInt(str.nextToken());
        int count = 0;
        int[] arr = new int[N];
        StringTokenizer A = new StringTokenizer(br.readLine());
        for( int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(A.nextToken());
            if (arr[i]<X)
                bw.write(String.valueOf(arr[i])+" ");
        }
        bw.flush();
        bw.close();
    }
}