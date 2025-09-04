package BaekJoon;

import java.io.*;
import java.util.*;

public class N2628 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int width = Integer.parseInt(st.nextToken());
        int length = Integer.parseInt(st.nextToken());

        List<Integer> widthCutList = new ArrayList<>(List.of(0, length));
        List<Integer> lengthCutList = new ArrayList<>(List.of(0, width));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            if (type == 0) {
                widthCutList.add(num);
            } else {
                lengthCutList.add(num);
            }
        }

        Collections.sort(widthCutList);
        Collections.sort(lengthCutList);

        int widthMaxValue = 0;
        for (int i = 0; i < widthCutList.size() -1; i++) {
            int diff = widthCutList.get(i+1) - widthCutList.get(i);
            if (diff > widthMaxValue) {
                widthMaxValue = diff;
            }
        }

        int lengthMaxValue = 0;
        for (int i = 0; i < lengthCutList.size() -1; i++) {
            int diff = lengthCutList.get(i+1) - lengthCutList.get(i);
            if (diff > lengthMaxValue) {
                lengthMaxValue = diff;
            }
        }

        int result = widthMaxValue * lengthMaxValue;
        bw.write(result + "");

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException {
        new N2628().solution();
    }
}
