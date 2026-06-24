import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MissingNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Integer.parseInt(st.nextToken());

        long sum = 0;
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            sum += Integer.parseInt(st.nextToken());
        }

        long totalSum = (n * (n + 1)) / 2;

        System.out.println(totalSum - sum);
    }
}