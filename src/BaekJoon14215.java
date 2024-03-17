import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BaekJoon14215
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        list.add(Integer.parseInt(st.nextToken()));
        list.add(Integer.parseInt(st.nextToken()));
        list.add(Integer.parseInt(st.nextToken()));
        Collections.sort(list);
        int a = Integer.parseInt(String.valueOf(list.get(0)));
        int b = Integer.parseInt(String.valueOf(list.get(1)));
        int c = Integer.parseInt(String.valueOf(list.get(2)));
        if (a == b && b == c && a == c){
            System.out.println(a*3);
        } else if (c >= (a+b)) {
            c = a+b-1;
            System.out.println(a+b+c);
        } else {
            System.out.println(a+b+c);
        }
    }
}