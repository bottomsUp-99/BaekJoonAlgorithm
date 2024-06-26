import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon2309
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dwarf = new int[9];
        int sum = 0;
        for (int i = 0 ; i < 9 ; i++){
            dwarf[i] = Integer.parseInt(br.readLine());
            sum += dwarf[i];
        }
        for (int i = 0 ; i < 8 ; i++){
            for (int j = i + 1 ; j < 9 ; j++){
                if (sum - dwarf[i] - dwarf[j] == 100){
                    dwarf[i] = 0;
                    dwarf[j] = 0;
                    Arrays.sort(dwarf);
                    for (int k = 2; k < 9; k++) {
                        System.out.println(dwarf[k]);
                    }
                    return;
                }
            }
        }
    }
}
