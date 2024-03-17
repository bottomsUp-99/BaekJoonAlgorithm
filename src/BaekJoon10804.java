import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon10804
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] cardList = new int[21];
        for (int i = 0; i < cardList.length; i++) {
            cardList[i] = i;
        }
        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int temp = 0;
            for (int j = 0; j < (b - a + 1) / 2; j++) {
                temp = cardList[a + j];
                cardList[a + j] = cardList[b - j];
                cardList[b - j] = temp;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < cardList.length; i++) {
            sb.append(cardList[i] + " ");
        }
        System.out.println(sb);
    }
}