package BaekJoon;

import java.io.*;

//그게 무슨 코드니..
public class N31495 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        boolean isExactString = false;

        StringBuilder sb = new StringBuilder();
        if (input.charAt(0) == '"' && input.charAt(input.length() - 1) == '"') {
            if (input.length() > 2) {
                for (int i = 1; i < input.length()-1; i++) {
                    sb.append(input.charAt(i));
                }
                isExactString = true;
            }
        }

        if (isExactString) {
            bw.write(sb.toString());
        } else {
            bw.write("CE");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N31495().solution();
    }
}
