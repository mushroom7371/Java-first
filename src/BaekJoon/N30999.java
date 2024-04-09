package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//민주주의
public class N30999 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int numberOfQuestion = Integer.parseInt(st.nextToken());
        int numberOfPeople = Integer.parseInt(st.nextToken());

        int result = 0;
        for (int i = 0; i < numberOfQuestion; i++) {
            String opinion = br.readLine();
            String agreement = opinion.replaceAll("X", "");

            if (agreement.length() > opinion.length() - agreement.length()) {
                result++;
            }
        }

        bw.write(result + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N30999().solution();
    }
}
