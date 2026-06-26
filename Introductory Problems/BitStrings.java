import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BitStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st.nextToken());

        if (n == 1) {
            System.out.println(2);
            return;
        }
        long total = 1;
        int mod = 1000000007;

        while (n-- > 0) {
            total = (total * 2) % mod;
        }

        System.out.println(total);

    }
}