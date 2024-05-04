import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class BaekJoon17218
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String first = br.readLine();
        String second = br.readLine();
        HashSet<String> password = new HashSet<>(Arrays.asList(second.split("")));
        for (String s : first.split("")){
            if (password.contains(s)){
                sb.append(s);
            }
        }
        System.out.println(sb);
        //시발 모르겠노!!
    }
}