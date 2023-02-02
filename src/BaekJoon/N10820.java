package BaekJoon;

import java.io.*;

//문자열 분석
public class N10820 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = "";

        while ((input = br.readLine()) != null && !input.isEmpty()) {
            int lowerCaseCnt = 0;
            int upperCaseCnt = 0;
            int numberCnt = 0;
            int spaceCnt = 0;

            for (int i = 0; i < input.length(); i++) {
                char temp = input.charAt(i);

                if (temp >= 48 && temp <= 57) {
                    numberCnt++;
                }
                if (temp >= 65 && temp <= 90) {
                    upperCaseCnt++;
                }
                if (temp >= 97 && temp <= 122) {
                    lowerCaseCnt++;
                }
                if (temp == 32) {
                    spaceCnt++;
                }
            }
            bw.write(lowerCaseCnt + " " + upperCaseCnt + " " + numberCnt + " " + spaceCnt + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10820().solution();
    }
}
