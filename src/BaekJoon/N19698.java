package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//헛간 청약
public class N19698 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberOfCow = Integer.parseInt(st.nextToken());
        int widthOfBarn = Integer.parseInt(st.nextToken());
        int heightOfBarn = Integer.parseInt(st.nextToken());
        int lengthOfBarn = Integer.parseInt(st.nextToken());

        int result = (widthOfBarn / lengthOfBarn) * (heightOfBarn / lengthOfBarn);
        if (result > numberOfCow) {
            result = numberOfCow;
        }

        bw.write(String.valueOf(result));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N19698().solution();
    }
}
