import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CoinPiles {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long t = Long.parseLong(st.nextToken());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());

            long left = Long.parseLong(st.nextToken());
            long right = Long.parseLong(st.nextToken());

            if ((left + right) % 3 == 0 && left <= 2 * right && right <= 2 * left) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}