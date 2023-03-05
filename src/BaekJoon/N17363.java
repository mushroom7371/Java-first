package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//우유가 넘어지면?
public class N17363 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int column = Integer.parseInt(st.nextToken());
        String [][] result = new String[column][row];

        for (int i = 0; i < row; i++) {
            String input = br.readLine();

            for (int j = 0; j < column; j++) {
                result[j][i] = changeString(String.valueOf(input.charAt(input.length()-1 - j)));
            }

        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                bw.write(result[i][j]);
            }
            bw.write("\n");
        }


        br.close();
        bw.flush();
        bw.close();
    }

    String changeString(String target) {

        switch (target) {
            case "-" :
                target = "|";
                break;
            case "|" :
                target = "-";
                break;
            case "/" :
                target = "\\";
                break;
            case "\\" :
                target = "/";
                break;            case "^" :
                target = "<";
                break;
            case "<" :
                target = "v";
                break;
            case "v" :
                target = ">";
                break;
            case ">" :
                target = "^";
                break;
        }

        return target;
    }

    public static void main(String[] args) throws IOException {
        new N17363().solution();
    }
}
