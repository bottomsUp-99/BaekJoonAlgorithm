import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BaekJoon1676
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        BigInteger bigInt = new BigInteger("1");
        for(int i = 1 ; i <= N ; i++){
            bigInt = bigInt.multiply(BigInteger.valueOf(i));
        }
        String s = bigInt.toString();
        for(int i = s.length() - 1 ; i >= 0 ; i--){
            if(s.charAt(i)-'0'==0) {
                count++;
            }
            else {
                break;
            }
        }
        System.out.println(count);
    }
}