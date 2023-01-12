package BaekJoon;

import java.io.*;

//지영 공주님의 마법 거울
public class N11586 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int arrayLength = Integer.parseInt(br.readLine());
        String [] princessAppearance = new String[arrayLength];

        for (int i = 0; i < princessAppearance.length; i++) {
            princessAppearance[i] = br.readLine();
        }

        String mindType = br.readLine();

        if (mindType.equals("2")) {
            for (int i = 0; i < arrayLength; i++) {
                bw.write(changeLeftAndRight(princessAppearance[i]) + "\n");
            }
        } else if (mindType.equals("3")) {
            for (int i = arrayLength - 1; i >= 0; i--) {
                bw.write(princessAppearance[i] + "\n");
            }
        } else {
            for (int i = 0; i < arrayLength; i++) {
                bw.write(princessAppearance[i] + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    String changeLeftAndRight(String input) {
        StringBuilder afterChange = new StringBuilder();

        for(int i = input.length()-1; i >= 0; i--) {
            afterChange.append(input.charAt(i));
        }

        return String.valueOf(afterChange);
    }

    public static void main(String[] args) throws IOException {
        new N11586().solution();
    }
}
