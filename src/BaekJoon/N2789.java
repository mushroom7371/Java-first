package BaekJoon;

import java.io.*;

//유학 금지
public class N2789 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            result.append(afterCensorship(input.charAt(i)));
        }

        bw.write(String.valueOf(result));

        br.close();
        bw.flush();
        bw.close();
    }

    String afterCensorship(char alphabet) {
        String after = String.valueOf(alphabet);

        switch (alphabet) {
            case 'C' :
                after = "";
                break;
            case 'A' :
                after = "";
                break;
            case 'M' :
                after = "";
                break;
            case 'B' :
                after = "";
                break;
            case 'R' :
                after = "";
                break;
            case 'I' :
                after = "";
                break;
            case 'D' :
                after = "";
                break;
            case 'G' :
                after = "";
                break;
            case 'E' :
                after = "";
                break;
        }

        return after;
    }

    public static void main(String[] args) throws IOException {
        new N2789().solution();
    }
}
