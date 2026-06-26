import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TwoSets {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st.nextToken());

        long totalSum = n * (n + 1) / 2;

        if (totalSum % 2 != 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            long target = totalSum / 2;

            StringBuilder ans1 = new StringBuilder();
            long sum1 = 0;
            StringBuilder ans2 = new StringBuilder();
            int count1 = 0;
            long index = n;
            while (index > 0) {
                if (sum1 + index <= target) {
                    sum1 += index;
                    ans1.append(index).append(" ");
                    count1++;
                } else {
                    ans2.append(index).append(" ");
                }

                index--;
            }

            System.out.println(count1);
            System.out.println(ans1);
            System.out.println(n - count1);
            System.out.println(ans2);
        }
    }
}