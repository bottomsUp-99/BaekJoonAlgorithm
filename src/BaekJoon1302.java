import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class BaekJoon1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> bookSold = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String book = br.readLine();
            if (bookSold.containsKey(book)){
                int a = bookSold.get(book);
                bookSold.put(book, ++a);
            } else {
                bookSold.put(book, 1);
            }
        }
        int max = 0;
        for (int num : bookSold.values()){
            if(num > max){
                max = num;
            }
        }
        ArrayList<String> list = new ArrayList<>();
        for (String name : bookSold.keySet()){
            if (bookSold.get(name) == max){
                list.add(name);
            }
        }
        Collections.sort(list);
        System.out.println(list.get(0));
    }
}