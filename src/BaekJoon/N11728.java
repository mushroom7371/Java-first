package BaekJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//배열 합치기
public class N11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int [] arrayLengthInfo = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int [] array1 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int [] array2 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<Integer> resultArray = new ArrayList<>();

        for(int i = 0; i < arrayLengthInfo[0]; i++){
            resultArray.add(array1[i]);
        }

        for(int i = 0; i < arrayLengthInfo[1]; i++){
            resultArray.add(array2[i]);
        }

        Collections.sort(resultArray);

        for(int i = 0; i < resultArray.size(); i++){
            bw.write(resultArray.get(i) + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
