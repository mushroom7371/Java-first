package BaekJoon;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

//아시아 정보올림피아드
public class N2535 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        String [][] studentInfo = new String[testCase][3];  //각각의 학생들의 참가국, 학생번호, 점수가 담길 2차원 String 배열
        boolean sameNation = false; //같은 국가의 수상자가 2명 이상임을 판단할 변수
        int nationInfo = 0; //같은 국가의 수상자가 2명 이상일 때의 국가 정보
        int writeCount = 1; //수상자가 3명이므로 3명까지 판단할 변수 초기설정이 1인 이유는 1등은 무조건 출력되기 때문(아래 설명 참고)

        for(int i = 0; i < testCase; i++){
            studentInfo[i] = br.readLine().split(" ");
            //입력 받은 문자열을 split()로 공백을 기준으로 나눠 배열에 저장하고, 이 배열을 다시 2차원 배열의 열에 해당하는 곳이 가리키도록 함
            //ex) studentInfo[0]이 가리키는 곳은 [1국가/1번학생/230점] 이라는 크기3의 배열을 가리킴
        }

        Arrays.sort(studentInfo, new Comparator<String[]>() {   //점수를 기준으로 내림차순 정렬
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o2[2]) - Integer.parseInt(o1[2]);
            }
        });

        bw.write(studentInfo[0][0] + " " + studentInfo[0][1] + "\n");   //금메달 수상자는 무조건 버퍼에 기록됨 writeCount를 1로 설정한 이유

        for(int i = 1; i < studentInfo.length; i++){    //금메달은 기록이 이미 되었기에 두번째 학생부터 반복
            if(writeCount != 3){    //버퍼에 기록된 학생이 3명이 아니면(즉, 금 또는 은 메달만 학생만 기록된 상태)
                if(sameNation){ //같은 국가에서 2명 수상되었다면
                    if(Integer.parseInt(studentInfo[i][0]) != nationInfo){  //반복 회차의 학생이 중복 수상 국가의 학생이 아니라면
                        bw.write(studentInfo[i][0] + " " + studentInfo[i][1] + "\n");   //버퍼에 기록
                        break;  //반복 종료 -> 이미 같은 국가에서 2명이 수상된 경우므로 여기까지 왔다면 무조건 3명이 버퍼에 기록된 상태다
                    }
                }else{  //같은 국가에서 수상된 사람이 없다면
                    bw.write(studentInfo[i][0] + " " + studentInfo[i][1] + "\n");   //일단 학생 정보를 버퍼에 기록
                    if(studentInfo[i][0].equals(studentInfo[i-1][0])){  //이전 학생과 같은 국가 출신이면(금메달을 반복전에 버퍼에 기록한 이유이기도 함. 바운드 예외 방지)
                        nationInfo = Integer.parseInt(studentInfo[i][0]);   //그 국가의 정보를 저장하고
                        sameNation = true;  //같은 국가에서 수상이 일어났기에 판단 변수를 true로 변경
                    }
                    writeCount++;
                }
            }else{  //금,은,동 3명이 버퍼에 기록되었다면 반복 종료
                break;
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
