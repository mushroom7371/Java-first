package BaekJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//수 정렬하기 4
public class N11931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        List<Integer> numberList = new ArrayList<>();

        for(int i = 0; i < testCase; i++){
            numberList.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(numberList, Collections.reverseOrder());

        for(int i = 0; i < testCase; i++){
            bw.write(numberList.get(i) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
