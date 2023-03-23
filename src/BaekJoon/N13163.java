package BaekJoon;

import java.io.*;

//닉네임에 갓 붙이기
public class N13163 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        String god = "god";

        while (testCase --> 0) {
            StringBuilder sb = new StringBuilder();
            String [] nickNameArray = br.readLine().split(" ");

            sb.append(god);
            for (int i = 1; i < nickNameArray.length; i++) {
                sb.append(nickNameArray[i]);
            }

            bw.write(String.valueOf(sb) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N13163().solution();
    }
}
