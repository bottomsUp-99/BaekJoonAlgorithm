import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;

public class BaekJoon6198
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
//        HashMap<Integer, Integer> building = new HashMap<>();
//        for (int i = 1 ; i <= N ; i++){
//            int insertHeight = Integer.parseInt(br.readLine());
//            building.put(i, insertHeight);
//        }
//        int count = 0;
//        for (int i = 1 ; i <= building.size() - 1 ; i++){
//            for (int j = i + 1 ; j <= building.size() ; j++){
//                int leftBuilding = building.get(i);
//                int rightBuilding = building.get(j);
//                if (leftBuilding > rightBuilding){
//                    count++;
//                } else break;
//            }
//        }
//        System.out.println(count);
//        ---------------------------------------------------------------------------
        int[] arr = new int[N];
        for(int i = 0 ; i < N ; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        long count = 0;
        Stack<Integer> building = new Stack<>();
        for(int i = 0 ; i < N ; i++) {
            while(!building.isEmpty() && building.peek() <= arr[i]) {
                building.pop();
            }
            building.push(arr[i]);
            count += building.size()-1;
            System.out.println(count);
        }
        System.out.println(count);
    }
}
