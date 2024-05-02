import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BaekJoon2751
{
    public static int [] tmp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int [] list = new int[N];
        tmp = new int[list.length];

        for(int i=0; i<N; i++){
            list[i] = Integer.parseInt(br.readLine());
        }

        mergeSort(list,0,list.length-1);
        for(int i : list){
            bw.write(i+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);

            int p = start;
            int q = mid + 1;
            int k = start;
            while (p <= mid && q <= end) {
                if (arr[p] <= arr[q]) {
                    tmp[k] = arr[p];
                    p++;
                } else {
                    tmp[k] = arr[q];
                    q++;
                }
                k++;
            }
            if (p > mid) {
                for (int i = q; i <= end; i++) {
                    tmp[k] = arr[i];
                    k++;
                }
            } else {
                for (int i = p; i <= mid; i++) {
                    tmp[k] = arr[i];
                    k++;
                }
            }
            for (int i = start; i <= end; i++) {
                arr[i] = tmp[i];
            }
        }
    }
}