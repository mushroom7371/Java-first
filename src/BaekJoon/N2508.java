package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//사탕 박사 고창영
public class N2508 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while(testCase --> 0){
            String empty = br.readLine();   //의미 없는 줄이다.
            StringTokenizer st = new StringTokenizer(br.readLine());
            int row = Integer.parseInt(st.nextToken()); //행에 해당하는 길이
            int column = Integer.parseInt(st.nextToken());  //열에 해당하는 길이
            char[][] inputArray =  new char[row][column];   //2차원 char 배열로 문자를 담을 예정
            int numberOfCandy = 0;  //사탕의 수

            for(int i = 0; i < row; i++){   //2중 for문을 사용하여 배열에 문자를 담음
                String inputString = br.readLine();
                for(int j = 0; j < column; j++){
                    inputArray[i][j] = inputString.charAt(j);
                }
            }

            for(int i = 0; i < row; i++){
                for(int j = 0; j < column-2; j++){  //'<'를 기준으로 판단할 예정으로 열에 해당하는 길이 -2로 해준다.
                    if(inputArray[i][j] == '>'){    //조건이 3개이므로 일단 첫번째 if문에서 한번 거름
                        if(inputArray[i][j+1] == 'o' && inputArray[i][j+2] == '<'){ //두번째 반복문에서 판별 완료함
                            numberOfCandy++;
                        }
                    }
                }
            }

            for(int i = 0; i < column; i++){    //위와 같은 로직임 단지 열에 해당하는 문자를 판단하기에 순서가 바뀌었다
                for(int j = 0; j < row-2; j++){
                    if(inputArray[j][i] == 'v'){
                        if(inputArray[j+1][i] == 'o' && inputArray[j+2][i] == '^'){
                            numberOfCandy++;
                        }
                    }
                }
            }

            bw.write(numberOfCandy + "\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N2508().solution();
    }
}
