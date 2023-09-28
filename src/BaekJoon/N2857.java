package BaekJoon;

import java.io.*;

//FBI
public class N2857 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfFBI = 5;

        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= numberOfFBI; i++) {
            String[] name = br.readLine().split("");

            for (int j = 0; j < name.length-2; j++) {
                if (name[j].equals("F") && name[j+1].equals("B") && name[j+2].equals("I")) {
                    result.append(i + "\n");
                    break;
                }
            }
        }

        if (result.length() == 0) {
            bw.write("HE GOT AWAY!");
        } else {
            bw.write(result.toString());
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2857().solution();
    }
}
