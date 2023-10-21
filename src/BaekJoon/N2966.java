package BaekJoon;

import java.io.*;

//찍기
public class N2966 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfQuestion = Integer.parseInt(br.readLine());
        String answer = br.readLine();
        String[] adrianAnswer = {"A", "B", "C"};
        String[] brunoAnswer = {"B", "A", "B", "C"};
        String[] goranAnswer = {"C", "C", "A", "A", "B", "B"};

        int adrianCount = 0;
        for (int i = 0; i < answer.length(); i++) {
            if (answer.charAt(i) == adrianAnswer[i % 3].charAt(0)) {
                adrianCount++;
            }
        }
        int brunoCount = 0;
        for (int i = 0; i < answer.length(); i++) {
            if (answer.charAt(i) == brunoAnswer[i % 4].charAt(0)) {
                brunoCount++;
            }
        }
        int goranCount = 0;
        for (int i = 0; i < answer.length(); i++) {
            if (answer.charAt(i) == goranAnswer[i % 6].charAt(0)) {
                goranCount++;
            }
        }

        if (adrianCount > brunoCount && adrianCount > goranCount) {
            bw.write(adrianCount + "\n" + "Adrian");
        } else if (brunoCount > adrianCount && brunoCount > goranCount) {
            bw.write(brunoCount + "\n" + "Bruno");
        } else if (goranCount > adrianCount && goranCount > brunoCount) {
            bw.write(goranCount + "\n" + "Goran");
        } else if (adrianCount == brunoCount && adrianCount > goranCount) {
            bw.write(adrianCount + "\n" + "Adrian\n" + "Bruno");
        } else if (adrianCount == goranCount && adrianCount > brunoCount) {
            bw.write(adrianCount + "\n" + "Adrian\n" + "Goran");
        } else if (brunoCount == goranCount && brunoCount > adrianCount) {
            bw.write(brunoCount + "\n" + "Bruno\n" + "Goran");
        } else {
            bw.write(adrianCount + "\n" + "Adrian\n" + "Bruno\n" + "Goran");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2966().solution();
    }
}
