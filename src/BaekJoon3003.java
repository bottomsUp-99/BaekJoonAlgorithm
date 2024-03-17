import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon3003
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[6];
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0 ; i < arr.length ; i++){
            if (i == 0) {
                if (arr[i] == 1){
                    arr[i] = arr[i] - 1;
                } else{
                    arr[i] = 1 - arr[i];
                }
            } else if (i == 1) {
                if (arr[i] == 1){
                    arr[i] = arr[i] - 1;
                } else{
                    arr[i] = 1 - arr[i];
                }
            } else if (i == 2) {
                if (arr[i] == 2){
                    arr[i] = arr[i] - 2;
                } else{
                    arr[i] = 2 - arr[i];
                }
            } else if ( i == 3 ) {
                if (arr[i] == 2){
                    arr[i] = arr[i] - 2;
                } else{
                    arr[i] = 2 - arr[i];
                }
            } else if ( i == 4 ) {
                if (arr[i] == 2){
                    arr[i] = arr[i] - 2;
                } else{
                    arr[i] = 2 - arr[i];
                }
            } else if ( i == 5 ) {
                if (arr[i] == 8){
                    arr[i] = arr[i] - 8;
                } else{
                    arr[i] = 8 - arr[i];
                }
            }
        }
        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
