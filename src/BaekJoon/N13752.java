package BaekJoon;

import java.io.*;

//히스토그램
public class N13752 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while(testCase --> 0){
            int sizeOfHistogram = Integer.parseInt(br.readLine());
            StringBuilder histogram = new StringBuilder();

            for(int i = 0; i < sizeOfHistogram; i++){
                histogram.append("=");
            }

            bw.write(String.valueOf(histogram) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N13752().solution();
    }
}
