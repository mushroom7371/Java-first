package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//박스
public class N9455 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        //2차원 배열의 기본 골자는 1차원 배열의 인덱스(0부터 시작하는) i가 가리키는 참조변수가 가리키는 1차원 배열의 인덱스 j를 표현 하는 식이다.
        
        while(testCase --> 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int row = Integer.parseInt(st.nextToken()); //박스 Array의 행. 사실은 행렬이라고 보기엔 애매하지만 어쨋든
            int column = Integer.parseInt(st.nextToken());  //박스 Array의 열. 마찬가지
            int[][] boxArray = new int[row][column];    //int형 array 생성
            int sum = 0;    //이동 거리가 담길 변수

            for(int i = 0; i < row; i++){   //입력으로 주어진 박스 정보를 저장하기 위한 반복문
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < column; j++){
                    boxArray[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            //2차원 배열의 열에 해당하는(사실은 열이 아니다) 부분을 훑고 나서 다음 열을 보기위한 반복문
            for(int i = 0; i < column; i++){
                for(int j = 0; j < row; j++){
                    int currentBox = boxArray[j][i];    //현재 박스
                    if(currentBox == 1){    //1이라면 박스가 있는 것이므로 이 다음 데이터에서 빈 박스를 찾게 된다.
                        for(int k = j+1; k < row; k++){
                            if(boxArray[k][i] == 0){    //깉은 열의 다음 행에 해당하는 데이터가 0이라면 빈 공간이라 이동 할수 있으므로 이동거리 더함
                                sum++;
                            }
                        }
                    }
                }
            }

            bw.write(sum + "\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N9455().solution();
    }
}
