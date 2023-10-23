package BaekJoon;

import java.io.*;

//Perfect Shuffle
public class N9492 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input = br.readLine();
            if (input.equals("0")) {
                break;
            }
            int numberOfCard = Integer.parseInt(input);
            boolean isOdd = numberOfCard % 2 == 1;
            String[] firstCardArray = new String[numberOfCard / 2];
            String[] secondCardArray = new String[numberOfCard / 2];
            if (isOdd) {
                firstCardArray = new String[numberOfCard / 2 + 1];
            }

            for (int i = 0; i < firstCardArray.length; i++) {
                firstCardArray[i] = br.readLine();
            }
            for (int i = 0; i < secondCardArray.length; i++) {
                secondCardArray[i] = br.readLine();
            }

            for (int i = 0; i < secondCardArray.length; i++) {
                bw.write(firstCardArray[i] + "\n");
                bw.write(secondCardArray[i] + "\n");
            }

            if (isOdd) {
                bw.write(firstCardArray[firstCardArray.length - 1] + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N9492().solution();
    }
}
