package BaekJoon;

import java.io.*;

//문서 검색
public class N1543 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String documentName = br.readLine();
        String target = br.readLine();
        int count = 0;
        int index = 0;

        loop:
        while (documentName.length() - index >= target.length()) {
            for (int i = index; i <= documentName.length() - 1; i++) {
                if (i + target.length() > documentName.length()) {
                    break loop;
                }
                String temp = documentName.substring(i, i + target.length());
                if (temp.equals(target)) {
                    count++;
                    index = i + target.length();
                    break;
                }
            }
        }

        bw.write(String.valueOf(count));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N1543().solution();
    }
}
