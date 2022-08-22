package BaekJoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//백준 대회 문제, 장신구 명장 임스
public class SinchonSummerAlgorithmCampContest_C {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int fatigueLevel = Integer.parseInt(st.nextToken());    //초기 피로도
        int accessories = Integer.parseInt(st.nextToken()); //장신구 개수
        int [] fatigueLevelArray = new int[accessories];    //장신구 제작시 필요한 피로도
        int count = 0;  //장신구를 만들 수 있는 최대 횟수

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < accessories; i++){   //일단 장신구 제작에 필요한 피로도를 배열에 저장
            fatigueLevelArray[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(fatigueLevelArray); //피로도가 낮은 순서대로 구할 것이므로 정렬

        for(int i = 0; i < accessories; i++){
            if(fatigueLevel >= 200){    //피로도가 200이상이면 반복 종료
                break;
            }

            fatigueLevel += fatigueLevelArray[i];   //장신구 제작에 드는 피로도를 더함
            count++;    //장신구 개수 증가

        }

        br.close();
        bw.write(count + "");
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException {
        new SinchonSummerAlgorithmCampContest_C().solution();
    }
}
