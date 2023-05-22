package BaekJoon;

import java.io.*;

//방학 숙제
public class N5532 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int day = Integer.parseInt(br.readLine());
        int korean = Integer.parseInt(br.readLine());
        int mathematics = Integer.parseInt(br.readLine());
        int koreanPerDay = Integer.parseInt(br.readLine());
        int mathematicsPerDay = Integer.parseInt(br.readLine());

        int koreanDay = korean / koreanPerDay;
        if (korean % koreanPerDay != 0) {
            koreanDay += 1;
        }

        int mathematicsDay = mathematics / mathematicsPerDay;
        if (mathematics % mathematicsPerDay != 0) {
            mathematicsDay += 1;
        }

        int result = day - Math.max(koreanDay, mathematicsDay);

        bw.write(result + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N5532().solution();
    }
}
