package BaekJoon;

import java.io.*;

//비밀편지
public class N2596 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfChar = Integer.parseInt(br.readLine());
        String secretMessage = br.readLine();

        String[] secretMessageArray = new String[numberOfChar];
        for (int i = 0; i < numberOfChar; i++) {
            secretMessageArray[i] = secretMessage.substring(i * 6, (i + 1) * 6);
        }

        String[] message = {"000000", "001111", "010011", "011100", "100110", "101001", "110101", "111010"};

        boolean isAble = true;
        StringBuilder result = new StringBuilder();

        loop:
        for (int i = 0; i < secretMessageArray.length; i++) {
            for (int j = 0; j < message.length; j++) {
                int count = 0;
                for (int k = 0; k < 6; k++) {
                    if (secretMessageArray[i].charAt(k) != message[j].charAt(k)) {
                        count++;
                    }
                }
                if (count <= 1) {
                    result.append((char) (j + 65));
                    continue loop;
                }
                if (j == message.length - 1) {
                    isAble = false;
                    int index = i + 1;
                    bw.write(index + "");
                    break loop;
                }
            }
        }

        if (isAble) {
            bw.write(result.toString());
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2596().solution();
    }
}
