package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//CTP공국으로 이민 가자
public class N12778 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int numberOfCharacters = Integer.parseInt(st.nextToken());
            char type = st.nextToken().charAt(0);

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < numberOfCharacters; i++) {
                if (type == 'C') {
                    bw.write((int) st.nextToken().charAt(0) - 64 + " ");
                } else {
                    bw.write((char) (Integer.parseInt(st.nextToken()) + 64) + " ");
                }
            }
            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N12778().solution();
    }
}
