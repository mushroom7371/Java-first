package BaekJoon;

import java.io.*;

//민균이의 비밀번호
public class N9933 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        String [][] secretArray = new String[testCase][2];

        for (int i = 0; i < testCase; i++) {
            String input = br.readLine();
            StringBuilder reverseInput = new StringBuilder();

            for (int j = input.length()-1; j >= 0; j--) {
                reverseInput.append(input.charAt(j));
            }

            secretArray[i][0] = input;
            secretArray[i][1] = String.valueOf(reverseInput);
        }

        loop:
        for (int i = 0; i < secretArray.length; i++) {
            String compareA = secretArray[i][0];

            for (int j = i; j < secretArray.length; j++) {
                String compareB = secretArray[j][1];

                if (compareA.equals(compareB)) {
                    bw.write(compareA.length() + " " + compareA.charAt(compareA.length()/2));
                    break loop;
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N9933().solution();
    }
}
