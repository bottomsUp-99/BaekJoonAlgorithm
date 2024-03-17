import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BaekJoon1911 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int N = Integer.parseInt(st.nextToken());
//        int L = Integer.parseInt(st.nextToken());
//        int[] puddle = new int[10000];
//        int[] locationFrom = new int[N];
//        HashMap<Integer, Integer> locationTo = new HashMap<>();
//        for (int i = 0 ; i < N ; i++){
//            st = new StringTokenizer(br.readLine());
//            locationFrom[i] = Integer.parseInt(st.nextToken());
//            locationTo.put(locationFrom[i], Integer.parseInt(st.nextToken()));
//            for (int j = locationFrom[i] ; j < locationTo.get(locationFrom[i]) ; j++){
//                puddle[j] = 1;
//            }
//        }
//        Arrays.sort(locationFrom);
//        int count = 0;
//        for (int i = 0 ; i < locationFrom.length ; i++){
//            int start = locationFrom[i];
//            int last = locationTo.get(start);
//            int tmpStart = start;
//            for (int j = start ; j < last ; j++){
//                if (puddle[tmpStart] == 2){
//                    tmpStart++;
//                } else {
//                    break;
//                }
//            }
//            int length = last - tmpStart;
//            if (length < L){
//                    count++;
//                    for (int j = tmpStart ; j < tmpStart + L ; j++) {
//                        puddle[tmpStart] = 2;
//                    }
//            } else {
//                if (length % L == 0){
//                    count+=length/L;
//                    for (int j = tmpStart ; j < tmpStart + length ; j++){
//                        puddle[tmpStart] = 2;
//                    }
//                } else {
//                    count += length/L + 1;
//                    for (int j = tmpStart ; j < tmpStart + (length/L+1)*L ; j++){
//                        puddle[tmpStart] = 2;
//                    }
//                }
//            }
//        }
//        System.out.println(count);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int[][] puddle = new int[N][2];
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            puddle[i][0] = Integer.parseInt(st.nextToken());
            puddle[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(puddle, new Comparator<int []>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0])
                    return Integer.compare(o1[1], o2[1]);
                return Integer.compare(o1[0], o2[0]);
            }
        });
        int count = 0;
        int length = 0;
        for(int i=0; i<N; i++) {
            if(puddle[i][0] > length)
                length = puddle[i][0];
            if(puddle[i][1] >= length) {
                while(puddle[i][1] > length) {
                    length += L;
                    count ++;
                }
            }
        }
        System.out.println(count);
    }
}