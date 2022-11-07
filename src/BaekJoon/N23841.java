package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//데칼코마니
public class N23841 {
    //2차원 배열에 대한 설명은 N9455 참고. 기본 골자는 참조의 참조
    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken()); //행의 길이
        int column = Integer.parseInt(st.nextToken());  //열의 길이

        for(int i = 0; i < row; i++){
            String[] inputArray = br.readLine().split("");  //주어진 입력을 한 글자씩 나눠 배열에 담는다.
            String[] reverseInputArray = new String[column];    //입력 문자를 반대로 돌려 저장할 배열
            String[] resultArray = new String[column];  //최종 결과가 담길 배열

            for(int j = 0; j < column; j++){    //문자의 길이만큼 반복
                reverseInputArray[j] = inputArray[column - 1 -j];   //반대로 돌림
                resultArray[j] = ".";   //결과 배열은 "."으로 초기화
            }

            for(int j = 0; j < column; j++){
                if(inputArray[j].equals(".") || reverseInputArray[j].equals(".")){  //정배열, 역배열 중 하나라도 "."이 아니라면
                    if(!inputArray[j].equals(".")){ //정배열의 j인덱스의 데이터가 "."이 아니면
                        resultArray[j] = inputArray[j]; //해당 문자를 결과 배열에 저장
                    }else{
                        resultArray[j] = reverseInputArray[j];
                    }
                }

                bw.write(resultArray[j]);
            }

            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException{
        new N23841().solution();
    }
}
