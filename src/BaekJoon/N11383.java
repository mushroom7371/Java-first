package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//뚊
public class N11383 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int testCaseN = Integer.parseInt(st.nextToken());   //주어진 이미지의 수
        int testCaseM = Integer.parseInt(st.nextToken());   //주어진 이미지의 길이

        String[] stringArrayN = new String[testCaseN];  //원본 이미지를 담을 배열

        for(int i = 0 ;i < testCaseN; i++){ //원본 이미지를 배열에 저장 할 반복문
            String input = br.readLine();
            StringBuilder temp = new StringBuilder();   //원본 이미지를 처음부터 2배 하여 저장할 예정으로 StringBuilder를 선언함

            for(int j = 0; j < testCaseM*2; j++){   //이미지 길이*2만큼 반복
                temp.append(input.charAt(j/2)); //입력 이미지의 j/2 인덱스를 적용하면 2배가 된다. ex)0,1 -> 0/ 2,3 -> 1/ 4,5->2...
            }

            stringArrayN[i] = String.valueOf(temp); //2배로 늘린 결과를 배열에 담음
        }

        boolean isEyfa = true;  //돌돔이 맞는지 판별할 논리 변수

        for(int i = 0; i < testCaseN; i++){
            String input = br.readLine();

            if(!stringArrayN[i].equals(input)){ //2배로 늘린 이미지 데이터와 다르다면 플래그값 변경
                isEyfa = false;
                break;
            }
        }

        if(isEyfa){ //플래그값에 따른 출력
            bw.write("Eyfa");
        }else{
            bw.write("Not Eyfa");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException{
        new N11383().solution();
    }
}
