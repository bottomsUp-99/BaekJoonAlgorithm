import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon25206
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str =  new String[20];
        double totalSum = 0;
        double pointSum = 0;
        String[] gradelist = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
        String[] pointList = {"4.5", "4.0", "3.5", "3.0", "2.5", "2.0", "1.5", "1.0", "0.0", "0.0"};
        for (int i = 0 ; i < 20 ; i++){
            str[i] = br.readLine();
            StringTokenizer st = new StringTokenizer(str[i], " ");
            String name = st.nextToken();
            double point = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            for (int j = 0 ; j < 10 ; j++){
                if (grade.equals(gradelist[j])){
                    totalSum += point * Double.parseDouble(pointList[j]);
                    if(j != 9){
                        pointSum+=point;
                    }
                }
            }
        }
        double avg = totalSum / pointSum;
        System.out.printf("%.6f\n", avg);
    }
}
