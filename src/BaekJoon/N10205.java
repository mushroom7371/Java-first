package BaekJoon;

import java.io.*;

//헤라클레스와 히드라
public class N10205 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 1; i <= testCase; i++) {
            int hydraHead = Integer.parseInt(br.readLine());
            String attackInfo = br.readLine();

            for (int j = 0; j < attackInfo.length(); j++) {
                char attack = attackInfo.charAt(j);
                if (attack == 'c') {
                    hydraHead++;
                } else if (attack == 'b') {
                    hydraHead--;
                }

                if (hydraHead == 0) {
                    break;
                }
            }

            bw.write("Data Set " + i + ":\n" + hydraHead + "\n\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10205().solution();
    }
}
