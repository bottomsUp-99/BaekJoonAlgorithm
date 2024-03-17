import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeakJoon25314
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int a = N/4;
        for (int i = 1 ; i <= a ; i++){
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
