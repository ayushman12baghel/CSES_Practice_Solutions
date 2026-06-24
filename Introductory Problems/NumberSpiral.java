import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class NumberSpiral {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            long y = Long.parseLong(st.nextToken());
            long x = Long.parseLong(st.nextToken());

            long z = Math.max(x, y);

            long z2 = z * z;
            long zMinus1Sq = (z - 1) * (z - 1);
            long ans = 0;

            if (z % 2 == 0) {
                if (y == z) {
                    ans = z2 - x + 1;
                } else {
                    ans = zMinus1Sq + y;
                }
            } else {
                if (x == z) {
                    ans = z2 - y + 1;
                } else {
                    ans = zMinus1Sq + x;
                }
            }

            sb.append(ans).append("\n");
        }

        System.out.println(sb);
    }
}