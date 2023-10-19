package BaekJoon;

import java.io.*;
import java.util.*;

//알록달록 앵무새
public class N28445 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<String> colorList = new ArrayList<>();
        StringTokenizer fatherColor = new StringTokenizer(br.readLine());
        StringTokenizer motherColor = new StringTokenizer(br.readLine());

        while (fatherColor.hasMoreTokens()) {
            colorList.add(fatherColor.nextToken());
        }
        while (motherColor.hasMoreTokens()) {
            colorList.add(motherColor.nextToken());
        }

        Set<String> childColor = new HashSet<>();
        for (int i = 0; i < colorList.size(); i++) {
            for (int j = 0; j < colorList.size(); j++) {
                childColor.add(colorList.get(i) + " " + colorList.get(j));
            }
        }
        List<String> result = new ArrayList<>(childColor);
        Collections.sort(result);

        for (String color : result) {
            bw.write(color + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N28445().solution();
    }
}
