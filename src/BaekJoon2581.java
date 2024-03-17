import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BaekJoon2581
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> measure = new ArrayList<>();
        ArrayList<Integer> decimal = new ArrayList<>();
        int sum = 0;
        for (int i = M ; i <= N ; i++){
            for (int j = 1 ; j <= i ; j++){
                if (i % j == 0){
                    measure.add(j);
                }
            }
            if (measure.size() == 2){
                sum+=i;
                decimal.add(i);
            }
            measure.clear();
        }
        Collections.sort(decimal);
        if (decimal.isEmpty()){
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(decimal.get(0));
        }
    }
}
