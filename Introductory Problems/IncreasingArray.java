import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class IncreasingArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        long nums[] = new long[n];
        long minMoves = 0;
        int i = 0;
        st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            nums[i++] = Long.parseLong(st.nextToken());
        }

        for (i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                minMoves += (nums[i - 1] - nums[i]);
                nums[i] = nums[i - 1];
            }
        }

        System.out.println(minMoves);
    }
}