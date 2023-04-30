package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//맞았는데 왜 틀리죠?
public class N15820 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sampleCase = Integer.parseInt(st.nextToken());
        int systemCase = Integer.parseInt(st.nextToken());
        boolean sampleWrong = false;
        boolean systemWrong = false;

        for (int i = 0; i < sampleCase; i++) {
            st = new StringTokenizer(br.readLine());
            int sampleAnswer = Integer.parseInt(st.nextToken());
            int manYungAnswer = Integer.parseInt(st.nextToken());

            if (sampleAnswer != manYungAnswer) {
                sampleWrong = true;
                break;
            }
        }

        if (!sampleWrong) {
            for (int i = 0; i < systemCase; i++) {
                st = new StringTokenizer(br.readLine());
                int systemAnswer = Integer.parseInt(st.nextToken());
                int manYungAnswer = Integer.parseInt(st.nextToken());

                if (systemAnswer != manYungAnswer) {
                    systemWrong = true;
                    break;
                }
            }

            if (systemWrong) {
                bw.write("Why Wrong!!!");
            } else {
                bw.write("Accepted");
            }
        } else {
            bw.write("Wrong Answer");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N15820().solution();
    }
}
