import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.*;

public class test1
{
    //백준 2501 문제 풀이임

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(str.nextToken());
        int K = Integer.parseInt(str.nextToken());
        HashSet<Integer>hs = new HashSet<>();
        for (int i = 1 ; i <= N ; i++){
            if (N%i == 0){
                hs.add(i);
            }
        }
        ArrayList<Integer> list = new ArrayList<>(hs);
        Collections.sort(list);
        if (list.size() < K) {
            System.out.println("0");
        } else {
            System.out.println(list.get(K-1));
        }
    }
}

