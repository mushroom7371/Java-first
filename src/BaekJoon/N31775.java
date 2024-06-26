package BaekJoon;

import java.io.*;

//글로벌 포닉스
public class N31775 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1 = br.readLine();
        String str2 = br.readLine();
        String str3 = br.readLine();
        boolean isGlobal = true;

        StringBuilder sb = new StringBuilder();
        sb.append(str1.charAt(0));
        sb.append(str2.charAt(0));
        sb.append(str3.charAt(0));

        if (!sb.toString().contains("k")) {
            isGlobal = false;
        }
        if (!sb.toString().contains("l")) {
            isGlobal = false;
        }
        if (!sb.toString().contains("p")) {
            isGlobal = false;
        }

        if (isGlobal) {
            bw.write("GLOBAL");
        } else {
            bw.write("PONIX");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N31775().solution();
    }
}
