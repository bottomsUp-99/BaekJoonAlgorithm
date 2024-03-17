import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon10811
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr= new int[N];
        for (int l = 0 ; l < N ; l++){
            arr[l] = l+1;
        }
        for (int m = 0 ; m < M ; m++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken())-1;
            int j = Integer.parseInt(st.nextToken())-1;
            while (i < j) {
                int tmp = arr[i];
                arr[i++] = arr[j];
                arr[j--] = tmp;
            }
        }
        for (int k = 0 ; k < arr.length ; k++){
            bw.write(arr[k] + " ");
        }
        bw.flush();
        bw.close();
    }
}
