package BaekJoon;

import java.io.*;

//그릇
public class N7567 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String [] bowl = br.readLine().split("");
        int bowlHeight = 10;

        for (int i = 0; i < bowl.length-1; i++) {
            if (bowl[i].equals(bowl[i+1])) {
                bowlHeight += 5;
            } else {
                bowlHeight += 10;
            }
        }

        bw.write(bowlHeight + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N7567().solution();
    }
}
