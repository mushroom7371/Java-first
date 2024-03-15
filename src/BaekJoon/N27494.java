package BaekJoon;

import java.io.*;

//2023년은 검은 토끼의 해
public class N27494 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int ticket = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 2023; i <= ticket; i++) {
            boolean isFirst = false;
            boolean isSecond = false;
            boolean isThird = false;
            boolean isFourth = false;

            String target = String.valueOf(i);
            for (int j = 0; j < target.length(); j++) {
                char number = target.charAt(j);
                if (number == '2') {
                    isFirst = true;
                }

                if (isFirst && number == '0') {
                    isSecond = true;
                }

                if (isSecond && number == '2') {
                    isThird = true;
                }

                if (isThird && number == '3') {
                    isFourth = true;
                }

                if (isFourth) {
                    count++;
                    break;
                }
            }
        }

        bw.write(count + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N27494().solution();
    }
}
