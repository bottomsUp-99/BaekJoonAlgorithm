import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 1);
        map.put("포도", 2);
        map.put("딸기", 3);
        for (String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }
//        포도 : 2
//        사과 : 1  ---> 결과값
//        딸기 : 3
    }
}