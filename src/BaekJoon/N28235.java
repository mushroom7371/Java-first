package BaekJoon;

import java.io.*;

//코드마스터 2023
public class N28235 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();

        if (input.equals("SONGDO")){
            bw.write("HIGHSCHOOL");
        } else if (input.equals("CODE")) {
            bw.write("MASTER");
        } else if (input.equals("2023")) {
            bw.write("0611");
        } else {
            bw.write("CONTEST");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N28235().solution();
    }
}
