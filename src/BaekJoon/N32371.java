package BaekJoon;

import java.io.*;

//샷건
public class N32371 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[][] keyboard = new String[4][];
        for (int i = 0; i < 4; i++) {
            keyboard[i] = br.readLine().split("");
        }

        String[] brokenKeys = br.readLine().split("");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < keyboard.length; i++) {
            for (int j = 0; j < keyboard[i].length; j++) {
                char key = keyboard[i][j].charAt(0);
                for (int k = 0; k < brokenKeys.length; k++) {
                    if (key == brokenKeys[k].charAt(0)) {
                        sb.append(key);
                    }
                }
            }
        }

        bw.write(sb.toString().charAt(4));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N32371().solution();
    }
}
