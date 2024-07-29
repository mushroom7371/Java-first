package BaekJoon;

import java.io.*;

public class N29731 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] memes = {
                "Never gonna give you up",
                "Never gonna let you down",
                "Never gonna run around and desert you",
                "Never gonna make you cry",
                "Never gonna say goodbye",
                "Never gonna tell a lie and hurt you",
                "Never gonna stop",
        };

        boolean isInclude = true;
        int numberOfTarget = Integer.parseInt(br.readLine());
        String[] targets = new String[numberOfTarget];
        for (int i = 0; i < numberOfTarget; i++) {
            targets[i] = br.readLine();
        }

        for (int i = 0; i < targets.length; i++) {
            boolean isEquals = false;

            for (int j = 0; j < memes.length; j++) {
                if (memes[j].equals(targets[i])) {
                    isEquals = true;
                }
            }

            if (!isEquals) {
                isInclude = false;
            }
        }

        if (isInclude) {
            bw.write("No");
        } else {
            bw.write("Yes");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N29731().solution();
    }
}
