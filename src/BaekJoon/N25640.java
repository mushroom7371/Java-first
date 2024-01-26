package BaekJoon;

import java.io.*;

//MBTI
public class N25640 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String jingoMBTI = br.readLine();
        int numberOfFriends = Integer.parseInt(br.readLine());

        int count = 0;
        while (numberOfFriends --> 0) {
            String friendMBTI = br.readLine();
            if (jingoMBTI.equals(friendMBTI)) {
                count++;
            }
        }

        bw.write(count + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N25640().solution();
    }
}
