package BaekJoon;

import java.io.*;

//두라무리 휴지
public class N25178 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int lengthOfString = Integer.parseInt(br.readLine());
        String firstString = br.readLine();
        String secondString = br.readLine();
        boolean isPossible = true;

        int[] alpha = new int[26];
        for (int i = 0; i < lengthOfString; i++) {
            alpha[firstString.charAt(i) - 'a']++;
            alpha[secondString.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (alpha[i] != 0) {
                isPossible = false;
                break;
            }
        }

        if (isPossible) {
            if (firstString.charAt(0) != secondString.charAt(0)) {
                isPossible = false;
            }
            if (firstString.charAt(lengthOfString - 1) != secondString.charAt(lengthOfString - 1)) {
                isPossible = false;
            }
        }

        if (isPossible) {
            String deletedFirstString = firstString.replaceAll("[aeiou]", "");
            String deletedSecondString = secondString.replaceAll("[aeiou]", "");

            if (!deletedFirstString.equals(deletedSecondString)) {
                isPossible = false;
            }
        }

        if (isPossible) {
            bw.write("YES");
        } else {
            bw.write("NO");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N25178().solution();
    }
}
