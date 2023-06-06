package BaekJoon;

import java.io.*;

//신기한 수
public class N17618 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String target = br.readLine();
        int targetNumber = Integer.parseInt(target);
        int result = 0;

        for (int i = 1; i <= targetNumber; i++) {
            int sum = 0;
            String number = String.valueOf(i);

            for (int j = 0; j < number.length(); j++) {
                sum += number.charAt(j) - '0';
            }

            if (i % sum == 0) {
                result++;
            }
        }

        bw.write(result + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N17618().solution();
    }
}
