import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon10813
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for (int i = 0 ; i < arr.length ; i++)
            arr[i] = i+1;

        int tmp = 0;
        for (int j = 0 ; j < M ; j++){
            st = new StringTokenizer(br.readLine());
            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());
            tmp = arr[I-1];
            arr[I-1] = arr[J-1];
            arr[J-1] = tmp;
        }
        for (int k = 0 ; k < arr.length ; k++){
            bw.write(arr[k] + " ");
        }
        bw.flush();
        bw.close();
    }
}
