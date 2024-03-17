import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon2525
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());
        int i = Integer.parseInt(br.readLine());

        int h_a = i/60;
        int m_a = i%60;

        int h_f = h + h_a;
        int m_f = m + m_a;

        if (h_f >=24){
            if (m_f >= 60) {
                int m_y = m_f%60;
                System.out.println((h_f - 23) + " " + m_y);
            }
            else System.out.println((h_f - 24) + " " + m_f);
        }
        else {
            if (m_f >= 60) {
                int m_z = m_f%60;
                if(h_f +1 == 24) {
                    System.out.println((h_f + 1 - 24) + " " + m_z);
                }
                else System.out.println((h_f + 1) + " " + m_z);
            }
            else System.out.println(h_f + " " + m_f);
        }
    }
}