package BaekJoon;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//수 찾기
public class N1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String [] inputN = br.readLine().split(" ");
        Set<Integer> setN = new HashSet<>();    //중복을 제외하여 기준 숫자를 담을 hashSet

        for(int i = 0; i < N; i++){
            setN.add(Integer.parseInt(inputN[i]));
        }

        int M = Integer.parseInt(br.readLine());
        int [] arrayM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        //스트림을 통해 엘리먼트들을 순회 하면서 처리, 입력으로 들어온 값이 공백을 기준으로 나뉘어져 있는 상태며 이를 하나씩 핸들링한다.
        //mapToInt()를 통해 Mapping 연산을 String 값을 int형으로 타입 변환을 하고, toArray()를 통하여 배열에 순차적으로 해당 데이터를 저장한다.

        for(int i = 0; i < M; i++){
            if(setN.contains(arrayM[i])){   //i번지에 있는 데이터가 hashSet에 있다면
                bw.write(1 + "\n");
            }else{
                bw.write(0 + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
