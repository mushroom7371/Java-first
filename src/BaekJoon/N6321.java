package BaekJoon;

import java.io.*;

//IBM 빼기 1
public class N6321 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 1; i <= testCase; i++) {
            char[] input = br.readLine().toCharArray();

            for (int j = 0; j < input.length; j++) {
                if (input[j] == 'Z') {
                    input[j] = 'A';
                } else {
                    input[j] = (char) (input[j] + 1);
                }
            }

            bw.write("String #" + i + "\n" + String.valueOf(input));
            if (i != testCase) {
                bw.write("\n\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N6321().solution();
    }
}
