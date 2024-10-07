package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//Every Second Counts
public class N15080 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " : ");
        int startHour = Integer.parseInt(st.nextToken()) * 3600;
        int startMinute = Integer.parseInt(st.nextToken()) * 60;
        int startSecond = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " : ");
        int endHour = Integer.parseInt(st.nextToken()) * 3600;
        int endMinute = Integer.parseInt(st.nextToken()) * 60;
        int endSecond = Integer.parseInt(st.nextToken());

        int start = startHour + startMinute + startSecond;
        int end = endHour + endMinute + endSecond;

        if (start > end) {
            end += 86400;
        }

        bw.write(String.valueOf(end - start));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N15080().solution();
    }
}
