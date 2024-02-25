package BaekJoon;

import java.io.*;
import java.util.*;

//노래 악보
public class N1392 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        List<Integer> musicInfoList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int music = Integer.parseInt(br.readLine());
            for (int j = 0; j < music; j++) {
                musicInfoList.add(i);
            }
        }

        for (int i = 0; i < q; i++) {
            int time = Integer.parseInt(br.readLine());
            bw.write(musicInfoList.get(time) + 1 + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N1392().solution();
    }
}
