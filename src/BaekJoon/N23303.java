package BaekJoon;

import java.io.*;

//이 문제는 D2 입니다.
public class N23303 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] targetStringArray = br.readLine().split("");
        boolean isD2 = false;

        for (int i = 0; i < targetStringArray.length-1; i++) {
            String tempString = targetStringArray[i] + targetStringArray[i+1];
            if (tempString.equals("D2") || tempString.equals("d2")) {
                isD2 = true;
                break;
            }
        }

        if (isD2) {
            bw.write("D2");
        } else {
            bw.write("unrated");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N23303().solution();
    }
}
