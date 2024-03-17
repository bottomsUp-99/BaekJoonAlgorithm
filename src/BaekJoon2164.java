import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class BaekJoon2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        LinkedList<Integer> cardList = new LinkedList<>();
        for (int i = 1 ; i <= N ; i++){
            cardList.offer(i);
        }
        while(cardList.size() != 1){
            cardList.remove();
            cardList.offer(cardList.remove());
        }
        System.out.println(cardList.get(0));
    }
}
