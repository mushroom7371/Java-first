package BaekJoon;

import java.io.*;
import java.util.*;

//중복 빼고 정렬하기
public class N10867 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        Set<Integer> numberSet = new HashSet<>();
        int [] numberArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(); //N1026 주석 참고

        for(int i = 0; i < testCase; i++){  //입력숫자들을 HashSet에 저장
            numberSet.add(numberArray[i]);
        }

        List<Integer> listForSort = new ArrayList<>(numberSet); //정렬을 위한 ArrayList
        Collections.sort(listForSort);  //정렬

        for(int i = 0; i < listForSort.size(); i++){
            bw.write(listForSort.get(i) + " ");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
