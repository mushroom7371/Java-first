package BaekJoon;

import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//칠무해
public class N14729 {
    public static void main(String[] args) throws IOException {
        //초기엔 모든 입력값을 전부 배열에 담아 정렬 후 낮은 점수들을 출력했으나 메모리 초과가 나와서 실패함.
        //차선책으로 2중 for문을 돌려(시간이 오래걸린다...) max값을 찾아 기준을 잡고 이보다 낮은 점수를 객체에 추가 하도록 문제를 해결함.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        List<Double> scoreList = new LinkedList<>();    //학생들의 점수가 담기며 max값에 대한 인덱스를 제거하는데에 이득을 가지도록 LinkedList 객체 생성.

        for(int i = 0; i < 7; i++){ //초기 칠무해 점수
            scoreList.add(Double.parseDouble(br.readLine()));
        }

        for(int i = 0; i < testCase-7; i++){    //칠무해의 점수를 앞선 반복문에서 저장했기에 (testCase-칠무해 수)가 반복 횟수가 된다.
            double targetNumber = Double.parseDouble(br.readLine());    //반복마다 입력되는 점수
            double max = scoreList.get(0);  //초기 max값
            int index = 0;  //초기 max값에 대한 인덱스 값

            for(int j = 0; j < scoreList.size(); j++){  //입력마다 칠무해의 점수중에서 가장 큰 max값을 찾는다.
                if(max <= scoreList.get(j)){
                    max = scoreList.get(j);
                    index = j;
                }
            }

            if(max > targetNumber){ //위에서 찾은 max값보다 입력으로 주어진 숫자가 더 작다면 최대값을 제거하고 입력값을 LinkedList에 추가
                scoreList.remove(index);
                scoreList.add(targetNumber);
            }
        }

        Collections.sort(scoreList);    //오름차순으로 정렬

        for(int i = 0; i < 7; i++){
            bw.write(String.format("%.3f", scoreList.get(i)) + "\n");   //출력시 소수점 3자리까지 출력
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
