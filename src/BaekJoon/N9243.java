package BaekJoon;

import java.io.*;

//파일 완전 삭제
public class N9243 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine()) % 2;
        String beforeFile = br.readLine();
        String afterFile = br.readLine();

        if (n == 1) {
            boolean isSuccessful = true;

            for (int i = 0; i < beforeFile.length(); i++) {
                char beforeChar = beforeFile.charAt(i);
                char afterChar = afterFile.charAt(i);

                if (beforeChar == afterChar)
                    isSuccessful = false;
            }

            if (isSuccessful)
                bw.write("Deletion succeeded");
            else
                bw.write("Deletion failed");
        } else {
            if (beforeFile.equals(afterFile)) {
                bw.write("Deletion succeeded");
            } else {
                bw.write("Deletion failed");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N9243().solution();
    }
}
