package BaekJoon;

import java.io.*;

//末尾の文字 (Last Letter)
public class N27541 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int length = Integer.parseInt(br.readLine());
        String str = br.readLine();

        boolean isLastCharG = str.charAt(length - 1) == 'G';
        if (isLastCharG) {
            str = str.substring(0, length - 1);
        } else {
            str = str + "G";
        }

        bw.write(str);

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N27541().solution();
    }
}
