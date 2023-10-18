package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//암호해독기
public class N17176 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfChar = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        String targetString = br.readLine();
        int[] charIndexArray = new int[53];

        for (int i = 0; i < numberOfChar; i++) {
            int index = Integer.parseInt(st.nextToken());
            charIndexArray[index]++;
        }

        int[] targetIndexArray = new int[53];
        for (int i = 0; i < targetString.length(); i++) {
            char c = targetString.charAt(i);
            if (c == ' ') {
                targetIndexArray[0]++;
            } else if (c >= 'A' && c <= 'Z') {
                targetIndexArray[c - 'A' + 1]++;
            } else if (c >= 'a' && c <= 'z') {
                targetIndexArray[c - 'a' + 27]++;
            }
        }

        boolean isPossible = true;
        for (int i = 0; i < charIndexArray.length; i++) {
            if (charIndexArray[i] < targetIndexArray[i]) {
                isPossible = false;
                break;
            }
        }

        if (isPossible) {
            bw.write("y");
        } else {
            bw.write("n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N17176().solution();
    }
}
