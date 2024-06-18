import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BaekJoon11652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*int N = Integer.parseInt(br.readLine());
        HashMap<BigInteger, Integer> getCard = new HashMap<>();
        for (int i = 0 ; i < N ; i++) {
            BigInteger card = BigInteger.valueOf(Integer.parseInt(br.readLine()));
            if (getCard.containsKey(card)){
                int v = getCard.get(card);
                getCard.put(card, ++v);
            } else {
                getCard.put(card, 1);
            }
        }
        int max = 0;
        for (int i : getCard.values()){
            if (i >= max){
                max = i;
            }
        }
        AbstractList<BigInteger> list = new ArrayList<>();
        for (BigInteger card : getCard.keySet()){
            if (getCard.get(card) == max){
                list.add(card);
            }
        }
        Collections.sort(list);
        System.out.println(list.get(0));*/

        int N = Integer.parseInt(br.readLine());
        Map<Long, Integer> getCard = new HashMap<>();
        for (int i = 0; i < N; i++) {
            long card = Long.parseLong(br.readLine());
            getCard.put(card, getCard.getOrDefault(card, 0) + 1);
        }
        int max = -1;
        long num = 0;
        for (long carNum : getCard.keySet()) {
            if (getCard.get(carNum) > max) {
                max = getCard.get(carNum);
                num = carNum;
            } else if (getCard.get(carNum) == max) {
                num = Math.min(carNum, num);
            }
        }
        System.out.println(num);
    }
}