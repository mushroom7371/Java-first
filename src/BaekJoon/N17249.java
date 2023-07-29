package BaekJoon;

import java.io.*;

//태보태보 총난타
public class N17249 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] split = br.readLine().split("\\(\\^0\\^\\)");
        String leftFist = "";
        String rightFist = "";

        if (split.length == 2) {
            leftFist = split[0];
            rightFist = split[1];
        } else if (split.length == 1) {
            leftFist = split[0];
        }

        int leftFistCount = 0;
        for (int i = 0; i < leftFist.length(); i++) {
            if (leftFist.charAt(i) == '@' && leftFist.charAt(i+1) == '=') {
                leftFistCount++;
                i += 1;
            }
        }

        int rightFistCount = 0;
        for (int i = 0; i < rightFist.length(); i++) {
            if (rightFist.charAt(i) == '=' && rightFist.charAt(i+1) == '@') {
                rightFistCount++;
                i += 1;
            }
        }

        bw.write(leftFistCount + " " + rightFistCount);

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N17249().solution();
    }
}
