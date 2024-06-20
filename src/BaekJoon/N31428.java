package BaekJoon;

import java.io.*;

//엘리스 트랙 매칭
public class N31428 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfFriends = Integer.parseInt(br.readLine());
        String[] friendsClass = br.readLine().split(" ");
        String helloBitClass = br.readLine();

        int count = 0;
        for (int i = 0; i < numberOfFriends; i++) {
            if (friendsClass[i].equals(helloBitClass)) {
                count++;
            }
        }

        bw.write(count + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N31428().solution();
    }
}
