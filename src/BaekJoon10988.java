import java.io.*;

public class BaekJoon10988
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder(br.readLine());

        bw.write(((sb.toString().contentEquals(sb.reverse())) ? 1 : 0) + "\n");
        bw.flush();
        bw.close();
    }
}
