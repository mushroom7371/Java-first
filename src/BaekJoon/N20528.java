package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//끝말잇기
public class N20528 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());
        String firstWord = st.nextToken();

        while (testCase --> 1) {
            String word = st.nextToken();
            if (firstWord.charAt(firstWord.length() - 1) != word.charAt(0)) {
                bw.write("0");
                br.close();
                bw.flush();
                bw.close();
                return;
            }
        }

        bw.write("1");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N20528().solution();
    }
}
