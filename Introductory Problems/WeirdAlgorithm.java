import java.io.*;
import java.util.*;

public class WeirdAlgorithm {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        while (n != 1) {
            sb.append(n).append(" ");
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = (n * 3) + 1;
            }
        }
        sb.append(1);

        System.out.println(sb);
    }
}
