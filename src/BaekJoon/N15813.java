package BaekJoon;

import java.io.*;

//너의 이름은 몇 점이니?
public class N15813 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int lengthOfName = Integer.parseInt(br.readLine());
        String name = br.readLine();
        int nameScore = 0;

        for (int i = 0; i < lengthOfName; i++) {
            nameScore += name.charAt(i) - 'A' + 1;
        }

        bw.write(String.valueOf(nameScore));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N15813().solution();
    }
}
