package BaekJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//일곱 난쟁이
public class N2309 {
    //9명의 난쟁이중 2명을 제외하는 것이므로 2중 반복으로 풀었다
    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> peopleList = new ArrayList<>();
        int sum = 0;    //난쟁이 키의 합
        int notTargetIdx1 = 0;  //난쟁이가 아닌 사람의 인덱스1
        int notTargetIdx2 = 0;  //난쟁이가 아닌 사람의 인덱스2

        for(int i = 0; i < 9; i++){ //입력을 받아 ArrayList에 저장
            peopleList.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(peopleList);   //정렬

        for(int i = 0; i < peopleList.size(); i++){ //모든 난쟁이의 키의 합을 구하고
            sum += peopleList.get(i);
        }

        for(int i = 0; i < peopleList.size(); i++){ //이중 배열을 통해 브루트포스 실시
            for(int j = 0; j < peopleList.size(); j++){
                int tempSum = sum;  //반복마다 난쟁이들의 총 키의 합을 임시변수에 설정
                tempSum -= peopleList.get(i);   //i번째 난쟁이의 키를 뺌

                if(peopleList.get(i) != peopleList.get(j)){ //난쟁이의 키는 중복이 없으니 i번째 난쟁이와 j번째 난쟁이가 같지 않으면
                    tempSum -= peopleList.get(j);   //j번째 난재이의 키를 뺌
                }

                if(tempSum == 100){ //두명의 난쟁이의 키를 뺀 결과가 100이라면 해당 난쟁이의 인덱스 정보를 기록 후 반복 종료
                    notTargetIdx1 = i;
                    notTargetIdx2 = j;
                    break;
                }
            }

            if(notTargetIdx1 != 0 && notTargetIdx2 != 0){   //난쟁이 인덱스가 둘다 0이 아니면 답이 도출된 것이므로 반복 종료
                break;
            }
        }

        for(int i = 0; i < peopleList.size(); i++){ //두명의 난쟁이를 제외한 나머지 난쟁이의 키를 버퍼에 기록
            if(i != notTargetIdx1 && i != notTargetIdx2){
                bw.write(peopleList.get(i) + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException {
        new N2309().solution();
    }
}
