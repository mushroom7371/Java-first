package BaekJoon;

import java.io.*;

//인생은 한 방
public class N25183 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfLotto = Integer.parseInt(br.readLine());
        char[] lottoCharArray = br.readLine().toCharArray();
        boolean isLotto = false;

        if (numberOfLotto == 5) {
            int count = 0;
            for (int i = 0; i < numberOfLotto-1; i++) {
                if (lottoCharArray[i] - lottoCharArray[i+1] == 1 || lottoCharArray[i] - lottoCharArray[i+1] == -1) {
                    count++;
                }
            }

            if (count == 4) {
                isLotto = true;
            }
        } else {
            for (int i = 0; i < numberOfLotto-5; i++) {
                char temp = lottoCharArray[i];
                int count = 0;

                for (int j = i+1; j < i+5; j++) {
                    if (temp - lottoCharArray[j] == 1 || temp -lottoCharArray[j] == -1) {
                        count++;
                    }
                    temp = lottoCharArray[j];
                }

                if (count == 4) {
                    isLotto = true;
                    break;
                }
            }
        }

        if (isLotto) {
            bw.write("YES");
        } else {
            bw.write("NO");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N25183().solution();
    }
}
