import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon1008
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(reader.readLine());
        double A = Double.parseDouble(str.nextToken());
        double B = Double.parseDouble(str.nextToken());
        System.out.println(A/B);
    }
}
