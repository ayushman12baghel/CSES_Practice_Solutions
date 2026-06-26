import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TrailingZeros {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st.nextToken());

        long total5 = n / 5;

        long next = 25;
        // int mod = 1000000007;

        while (next < n) {
            total5 += (n / next);
            next = (next * 5);
        }

        System.out.println(total5);

    }
}