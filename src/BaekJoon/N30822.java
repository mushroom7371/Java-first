package BaekJoon;

import java.io.*;

//UOSPC 세기
public class N30822 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int strLength = Integer.parseInt(br.readLine());
        String string = br.readLine();
        int[] charCount = new int[5];

        for (int i = 0; i < strLength; i++) {
            char c = string.charAt(i);

            switch (c) {
                case 'u':
                    charCount[0]++;
                    break;
                case 'o':
                    charCount[1]++;
                    break;
                case 's':
                    charCount[2]++;
                    break;
                case 'p':
                    charCount[3]++;
                    break;
                case 'c':
                    charCount[4]++;
                    break;
                default:
                    break;
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] < min) {
                min = charCount[i];
            }
        }

        bw.write(min + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N30822().solution();
    }
}
