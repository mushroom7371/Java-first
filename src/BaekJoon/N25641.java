package BaekJoon;

import java.io.*;

//균형 잡힌 소떡소떡
public class N25641 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder(br.readLine());

        boolean isBalanced;
        while (n --> 0) {
            isBalanced = isBalanced(sb.toString());

            if (isBalanced) {
                break;
            }
            sb.deleteCharAt(0);
        }

        bw.write(sb.toString());

        br.close();
        bw.flush();
        bw.close();
    }

    boolean isBalanced(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 's') {
                count++;
            } else {
                count--;
            }
        }
        return count == 0;
    }

    public static void main(String[] args) throws IOException {
        new N25641().solution();
    }
}
