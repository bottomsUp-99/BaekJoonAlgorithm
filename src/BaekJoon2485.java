import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class BaekJoon2485
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] tree = new int[N];
        for (int i = 0 ; i < N ; i++){
            tree[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(tree);
        int[] new_tree = new int[N-1];
        for (int i = 0 ; i < N-1 ; i++){
            new_tree[i] = tree[i + 1] - tree[i];
        }
        int GCD = 0;
        for (int i = 0 ; i < new_tree.length -1 ; i++){
            if (i == 0){
                GCD = gcd(new_tree[i], new_tree[i + 1]);
            }
            else {
                GCD = gcd(new_tree[i + 1], GCD);
            }
        }
        int final_tree = (tree[N-1] - tree[0])/GCD +1;
        System.out.println(final_tree - N);
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}