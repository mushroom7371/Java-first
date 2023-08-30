package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//진짜 공간
public class N1350 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfFile = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int clusterSize = Integer.parseInt(br.readLine());
        long usedDisk = 0;

        for (int i = 0; i < numberOfFile; i++) {
            int sizeOfFile = Integer.parseInt(st.nextToken());
            usedDisk += sizeOfFile / clusterSize;
            if (sizeOfFile % clusterSize != 0) {
                usedDisk++;
            }
        }

        bw.write(String.valueOf(usedDisk * clusterSize));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N1350().solution();
    }
}
