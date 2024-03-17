import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BaekJoon1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        LinkedList<Integer> elementList = new LinkedList<>();
        for (int i = 0 ; i < N ; i++){
            elementList.offer(i+1);
        }
        int[] wantList = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int j = 0 ; j < M ; j++){
            wantList[j] = Integer.parseInt(st.nextToken());
        }
        int count = 0 ;
        for (int k = 0 ; k < M ; k++){
            int location = elementList.indexOf(wantList[k]);
            int middle;
            if (elementList.size() % 2 == 0){
                middle = elementList.size()/2 -1;
            } else {
                middle = elementList.size()/2;
            }
            if (location <= middle){
                for (int l = 0 ; l < location ; l++){
                    elementList.offer(elementList.remove());
                    count++;
                }
            } else {
                for (int l = 0 ; l < elementList.size() - location ; l++){
                    elementList.offerFirst(elementList.removeLast());
                    count++;
                }
            }
            elementList.poll();
        }
        System.out.println(count);
    }
}
