package BaekJoon;

import java.io.*;

//연속구간
public class N2495 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < 3; i++) {
            String num = br.readLine();
            int max = 0;
            int count = 0;
            for (int j = 0; j < num.length(); j++) {
                if (j == 0) {
                    count++;
                    max = count;
                } else {
                    if (num.charAt(j) == num.charAt(j-1)) {
                        count++;
                        if (max < count) {
                            max = count;
                        }
                    } else {
                        count = 1;
                    }
                }
            }
            bw.write(max + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2495().solution();
    }
}
