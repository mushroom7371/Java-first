package BaekJoon;

import java.io.*;

//J박스
public class N5354 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            int size = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();


            if (size == 1) {
                sb.append("#\n");
            } else {
                for (int i = 0; i < size; i++) {
                    sb.append("#");

                    for (int j = 1; j < size-1; j++) {
                        if (i == 0 || i == size-1) {
                            sb.append("#");
                        } else {
                            sb.append("J");
                        }
                    }

                    sb.append("#\n");
                }
            }

            bw.write(sb + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N5354().solution();
    }
}
