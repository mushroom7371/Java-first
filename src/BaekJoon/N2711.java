package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//오타맨 고창영
public class N2711 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int index = Integer.parseInt(st.nextToken()) - 1;
            String errorString = st.nextToken();

            bw.write(  deleteTypingError(index, errorString) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    String deleteTypingError(int index, String errorString) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < errorString.length(); i++) {
            if (i != index) {
                result.append(errorString.charAt(i));
            }
        }

        return String.valueOf(result);
    }

    public static void main(String[] args) throws IOException {
        new N2711().solution();
    }
}
