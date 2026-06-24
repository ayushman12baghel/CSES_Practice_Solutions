import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Repetitions {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int maxLength = 1;
        int i = 0;
        int j = 1;
        int n = s.length();
        char prev = s.charAt(0);

        while (j < n) {
            if (s.charAt(j) != prev) {
                prev = s.charAt(j);
                i = j;
            }

            maxLength = Math.max(maxLength, j - i + 1);

            j++;
        }

        System.out.println(maxLength);
    }
}