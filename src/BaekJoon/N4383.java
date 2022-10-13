package BaekJoon;

import java.io.*;
import java.util.*;

//점프는 즐거워
public class N4383 {
    //채점 방식이 마음에 안들었던 문제. 입력이 연속된 공백이거나, 숫자 사이의 공백이 2개 이상인 경우가 있어서 계속 런타임에러가 발생했다
    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String input = "";

        while((input = br.readLine()) != null && !input.isEmpty()){ //EOF를 위한 조건
            if(input.charAt(0) != ' '){ //입력이 제대로 들어오다가 다음줄에 연속된 공백으로 주어지고, 그 다음에 다시 입력이 들어오면 오류가 생김.. 이 때문에 조건을 뒀다
                Boolean isJollyJumper = true;   //jolly jumper가 맞는지 체크할 변수
                List<Integer> listForSorting = new ArrayList<>();   //연속된 두 수의 차의 절대값이 담길 ArrayList, 정렬을 할 예정
                st = new StringTokenizer(input);    //숫자 사이에 연속된 공백이 생길 경우 오류가 나기에 StringTokenizer를 사용함
                int[] tempArray = new int[Integer.parseInt(st.nextToken())];    //첫번째 토큰이 배열의 길이가 됨

                for(int i = 0; i < tempArray.length; i++){  //나머지 토큰들을 배열에 저장
                    tempArray[i] = Integer.parseInt(st.nextToken());
                }

                if(tempArray.length == 1){  //정수가 1개라면
                    bw.write("Jolly\n");
                }else{  //정수가 2개 이상이면
                    for(int i = 1; i < tempArray.length; i++){  //연속된 두 정수 차이의 절대값을 ArrayList에 저장
                        listForSorting.add(Math.abs(tempArray[i] - tempArray[i - 1]));
                    }

                    Collections.sort(listForSorting);   //오름차순으로 정렬

                    for(int i = 0; i < listForSorting.size(); i++){
                        if(listForSorting.get(i) != i + 1){ //차이가 1 ~ n-1 까지 존재하지 않으면 논리변수를 false로 바꾸고 반복 종료
                            isJollyJumper = false;
                            break;
                        }
                    }

                    if(isJollyJumper){  //출력
                        bw.write("Jolly\n");
                    }else{
                        bw.write("Not jolly\n");
                    }
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N4383().solution();
    }
}
