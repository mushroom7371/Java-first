package BaekJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//택시 거리
public class N17247 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken()); //문자열의 높이
        int column = Integer.parseInt(st.nextToken());  //문자열의 가로
        String[][] distanceArray = new String[row][column]; //문자열이 담길 2차원 배열
        List<Integer> listX = new ArrayList<>();    //x의 좌표가 담길 ArrayList
        List<Integer> listY = new ArrayList<>();    //y의 좌표가 담길 Arraylist

        for(int i = 0; i < row; i++){
            distanceArray[i] = br.readLine().split(" ");    //공백을 기준으로 갈라 배열을 생성하고 이를 1차원 배열이 가리키도록 함
            for(int j = 0; j < column; j++){
                if(distanceArray[i][j].equals("1")){    //해당 인덱스가 1이라면
                    listX.add(i + 1);   //x의 좌표에 인덱스 +1을 추가
                    listY.add(j + 1);   //y의 좌표에 인덱스 +1을 추가
                }
            }
        }

        int distance = Math.abs(listX.get(0) - listX.get(1)) + Math.abs(listY.get(0) - listY.get(1));   //거리 공식
        bw.write(distance + "");

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N17247().solution();
    }
}
