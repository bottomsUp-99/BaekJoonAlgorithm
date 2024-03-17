import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BaekJoon11478
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> list = new HashSet<>();
        String str = br.readLine();
        for (int i = 0 ; i < str.length() ; i++){
            for (int j = i + 1 ; j <= str.length() ; j++){
                list.add(str.substring(i, j));
            }
        }
        System.out.println(list.size());
    }
}
