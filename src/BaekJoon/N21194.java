package BaekJoon;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

//Meditation
public class N21194 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());   //명상 루틴 총 개수
        int k = Integer.parseInt(st.nextToken());   //최대 점수를 구할 명상 루틴의 수
        Integer[] nArray = new Integer[n];
        int sum = 0;

        for(int i = 0; i < nArray.length; i++){ //루틴 별 점수를 배열에 저장
            nArray[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(nArray, Collections.reverseOrder());    //최고 점수를 구하기위해 내림차순으로 정렬

        for(int i = 0; i < k; i++){
            sum += nArray[i];
        }

        bw.write(sum + "");
        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException {
        new N21194().solution();
    }
}
