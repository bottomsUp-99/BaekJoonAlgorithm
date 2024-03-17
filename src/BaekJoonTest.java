import java.util.HashMap;
import java.util.HashSet;

public class BaekJoonTest
{
    public static void main(String[] args) {
//        String[] arr = {"a", "b", "c"};
//        int len = arr.length;
//        String str1 = "aaaaa";
//        String str2 = "bbbbb";
//        int str1Len = str1.length();
//        int str2Len = str2.length();
//        String answer = "";
//        for(int i = 0 ; i < str1Len ; i++){
//            //answer += String.valueOf(str1.charAt(i) + str2.charAt(i) + "");
//            answer += str1.charAt(i) + "" + str2.charAt(i);
//
//            //answer += str1.substring(i, i +1) + str2.substring(i, i + 1);
//        }
//        System.out.println(answer);

        int a = 2;
        int b = 3;
        String as = String.valueOf(a);
        String bs = String.valueOf(b);
        String f = as + bs;
        String s = bs + as;
        int fi = Integer.parseInt(f);
        int si = Integer.parseInt(s);
        int sssss = 0;
        if (fi >= si){
            sssss = fi;
        } else {
            sssss = si;
        }
        System.out.println(sssss);
    }
}