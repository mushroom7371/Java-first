package BaekJoon;

import java.io.*;

//성장의 비약 선택권
public class N26645 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int level = Integer.parseInt(br.readLine());
        int posionA = level;
        int posionB = level;
        int posionC = level;
        int posionD = level;

        for (int i = 0; i < 8; i++) {
            if (posionA <= 209) {
                posionA++;
            } else {
                break;
            }
        }

        for (int i = 0; i < 4; i++) {
            if (posionB <= 219) {
                posionB++;
            } else {
                break;
            }
        }

        for (int i = 0; i < 2; i++) {
            if (posionC <= 229) {
                posionC++;
            } else {
                break;
            }
        }

        posionD++;
        int maxLevel = Math.max(posionA, Math.max(posionB, Math.max(posionC, posionD)));

        if (maxLevel == posionD) {
            bw.write("4");
        } else if (maxLevel == posionC) {
            bw.write("3");
        } else if (maxLevel == posionB) {
            bw.write("2");
        } else {
            bw.write("1");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N26645().solution();
    }
}
