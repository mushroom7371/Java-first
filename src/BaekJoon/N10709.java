package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//기상캐스터
public class N10709 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken()); //동서 방향 W킬로 미터
        int column = Integer.parseInt(st.nextToken());  //남북 방향 H킬로 미터
        String[][] weatherArray = new String[row][column];  //최초 입력이 담길 2차원 String 배열
        int[][] cloudInfoArray = new int[row][column];  //구름의 위치 정보가 담길 2차원 int 배열

        for(int i = 0; i < row; i++){
            weatherArray[i] = br.readLine().split("");  //주어진 문자열을 한 문자씩 잘라 배열을 만들고, 1차원 배열의 참조변수가 가리키도록 함
            for(int j = 0; j < column; j++){
                if(weatherArray[i][j].equals(".")){ //2차원에 해당하는 배열에 저장된 문자가 "." 이면 -1을 구름 위치 배열에 저장
                    cloudInfoArray[i][j] = -1;
                }

                if(weatherArray[i][j].equals("c")){ //"c"라면 0으로 위치 저장
                    cloudInfoArray[i][j] = 0;
                }

            }
        }

        for(int i = 0; i < row; i++){
            for(int j = 0 ; j < column - 1; j++){   //현재 인덱스와 다음 인덱스를 비교할 것이므로 반복은 column -1 만큼이 된다.
                if(cloudInfoArray[i][j] != -1){ //현재 구름 정보가 -1이 아니면 구름이 있는것
                    if(cloudInfoArray[i][j+1] != 0){    //추가로 그 정보가 0이 아니라면(새로운 구름이 아니라면)
                        cloudInfoArray[i][j+1] = cloudInfoArray[i][j] + 1;  //다음 구름의 위치는 1킬로미터 이동한 거리가 된다.
                    }
                }

                if(j == column - 2){    //반복 조건이 column -1 이므로 마지막 인덱스의 정보를 뽑아내기 위해 조건을 걸었음
                    bw.write(cloudInfoArray[i][j] + " " + cloudInfoArray[i][j+1]);
                }else{
                    bw.write(cloudInfoArray[i][j] + " ");
                }
            }
            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException{
        new N10709().solution();
    }
}
