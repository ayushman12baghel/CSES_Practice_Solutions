import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PalindromeReorder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int freq[] = new int[26];
        for (char c : str.toCharArray()) {
            freq[c - 'A']++;
        }

        boolean odd = false;
        int oddIndex = -1;
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0 && odd) {
                System.out.println("NO SOLUTION");
                return;
            }

            if (freq[i] % 2 != 0) {
                oddIndex = i;
                odd = true;
            }
        }

        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0 && i != oddIndex) {
                for (int j = 0; j < freq[i] / 2; j++) {
                    sb.append((char) (i + 'A'));
                    sb2.append((char) (i + 'A'));
                }
            }
        }

        if (oddIndex != -1) {
            for (int i = 0; i < freq[oddIndex]; i++) {
                sb.append((char) (oddIndex + 'A'));
            }
        }

        sb2.reverse();
        sb.append(sb2);

        System.out.println(sb);
    }
}