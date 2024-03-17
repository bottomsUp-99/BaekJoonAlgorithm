import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon5073
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] line = new int[3];
        int max;
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            line[0] = Integer.parseInt(st.nextToken());
            line[1] = Integer.parseInt(st.nextToken());
            line[2] = Integer.parseInt(st.nextToken());

            if (line[0] == 0 && line[1] == 0 && line[2] == 0){
                break;
            }
            max = -1;
            for (int i :line){
                if (max < i){
                    max = i;
                }
            }
            if (line[0] == line[1] && line[0] == line[2]){
                System.out.println("Equilateral");
            } else if (max >= line[0] + line[1] || max >= line[1] + line[2] || max >= line[0] + line[2]) {
                System.out.println("Invalid");
            } else if (line[0] == line[1] || line[1] == line[2] || line[0] == line[2]) {
                System.out.println("Isosceles");
            } else if (max < line[0] + line[1] && max < line[1] + line[2] && max < line[0] + line[2]) {
                System.out.println("Scalene");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
