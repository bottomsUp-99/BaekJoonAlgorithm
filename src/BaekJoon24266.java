import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon24266
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long a = Long.parseLong(br.readLine());
        System.out.println(a*a*a);
        System.out.println(3);
    }
}
