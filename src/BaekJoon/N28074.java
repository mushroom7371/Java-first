package BaekJoon;

import java.io.*;

//모비스
public class N28074 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int [] mobisArray = new int[5];

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'M') {
                mobisArray[0]++;
            } else if (input.charAt(i) == 'O') {
                mobisArray[1]++;
            } else if (input.charAt(i) == 'B') {
                mobisArray[2]++;
            } else if (input.charAt(i) == 'I') {
                mobisArray[3]++;
            } else if (input.charAt(i) == 'S') {
                mobisArray[4]++;
            }
        }

        boolean isMobis = true;
        for (int i = 0; i < mobisArray.length; i++) {
            if (mobisArray[i] == 0) {
                isMobis = false;
                break;
            }
        }

        if (isMobis) {
            bw.write("YES");
        } else {
            bw.write("NO");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N28074().solution();
    }
}
