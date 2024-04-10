package BaekJoon;

import java.io.*;

//관공... 어찌하여 목만 오셨소...
public class N30501 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfPeople = Integer.parseInt(br.readLine());

        String target = "";

        for (int i = 0; i < numberOfPeople; i++) {
            String name = br.readLine();

            if (name.contains("S")) {
                target = name;
                break;
            }
        }

        bw.write(target);

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N30501().solution();
    }
}
