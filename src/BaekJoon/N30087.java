package BaekJoon;

import java.io.*;

public class N30087 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            String input = br.readLine();

            if (input.equals("Algorithm")){
                bw.write("204\n");
            } else if (input.equals("DataAnalysis")){
                bw.write("207\n");
            } else if (input.equals("ArtificialIntelligence")){
                bw.write("302\n");
            } else if (input.equals("CyberSecurity")){
                bw.write("B101\n");
            } else if (input.equals("Network")){
                bw.write("303\n");
            } else if (input.equals("Startup")){
                bw.write("501\n");
            } else {
                bw.write("105\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N30087().solution();
    }
}
