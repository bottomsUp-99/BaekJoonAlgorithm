import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon6359
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
//        for (int i = 0 ; i < T ; i++) {
//            int roomNum = Integer.parseInt(br.readLine());
//            boolean[] prison = new boolean[roomNum + 1];
//            for (int j = 1 ; j < prison.length ; j++) {
//                prison[i] = true;
//            }
//            for (int j = 2 ; j <= roomNum ; j++) {
//                for (int k = 1 ; (j * k) <= roomNum  ; k++) {
//                    int num = j*k;
//                    prison[num] = !prison[num];
//                }
//            }
//            int count = 0;
//            for (int j = 1 ; j < roomNum ; j++) {
//                if (!prison[j]){
//                    count++;
//                }
//            }
//            System.out.println(count);
        while(T-- > 0) {
            int roomNum = Integer.parseInt(br.readLine());
            boolean[] prison = new boolean[roomNum+1];
            for (int i = 1; i <= roomNum; i++) {
                for (int j = i; j <= roomNum; j += i)
                    prison[j] = !prison[j];
            }
            int count = 0;
            for (int i = 1; i <= roomNum; i++)
                if (prison[i])
                    count++;
            System.out.println(count);
        }
    }
}
