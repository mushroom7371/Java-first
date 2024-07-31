package BaekJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Who is in the middle?
public class N6840 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> weightList = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++) {
            weightList.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(weightList);
        bw.write(weightList.get(1) + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N6840().solution();
    }
}
