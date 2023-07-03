package BaekJoon;

import java.io.*;

//좋은 자동차 번호판
public class N1871 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            String[] numberPlate = br.readLine().split("-");
            String alphabet = numberPlate[0];
            int number = Integer.parseInt(numberPlate[1]);
            double alphabetNumber = 0;

            for (int i = 0; i < alphabet.length(); i++) {
                int temp = alphabet.charAt(i) - 65;
                alphabetNumber += temp * Math.pow(26, 2 - i);
            }

            if (Math.abs(alphabetNumber - number) <= 100) {
                bw.write("nice\n");
            } else {
                bw.write("not nice\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N1871().solution();
    }
}
