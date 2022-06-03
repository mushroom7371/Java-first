package BaekJoon;

import java.io.*;
import java.util.Arrays;

//하키
public class N1358 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int [] coordinateInfo = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();  //N1026 설명 참고
        int width = coordinateInfo[0];  //직사각형 너비
        int height = coordinateInfo[1]; //직사각형 높이
        int x = coordinateInfo[2];  //x 좌표
        int y = coordinateInfo[3];  //y 좌표
        int numberOfPeople = coordinateInfo[4]; //선수의 수
        int radius = height/2;  //원의 반지름
        int count = 0;  //경기장 내부의 선수를 카운팅 할 변수

        for(int i = 0; i < numberOfPeople; i++){
            int [] playerInfo = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int playerX = playerInfo[0];    //선수의 x 좌표
            int playerY = playerInfo[1];    //선수의 y 좌표
            double distance1 = Math.sqrt((x-playerX)*(x-playerX) + (y + radius - playerY)*(y + radius - playerY));  //왼쪽 원의 중심과 선수와의 거리
            double distance2 = Math.sqrt((x + width - playerX)*(x + width - playerX) + (y + radius - playerY)*(y + radius - playerY));  //오른쪽 원의 중심과 선수와의 거리

            if((x <= playerX && playerX <= x + width) && (y <= playerY && playerY <= y + height)){  //직사각형 내부에 선수가 있다면
                count++;
            }else if(distance1 <= radius || distance2 <= radius){   //오른쪽 원 또는 왼쪽 원의 내부에 선수가 있다면(원의 중심과 선수 사이의 거리가 반지름보다 작거나 같으면 원 내부에 위치해 있음)
                count++;
            }
        }

        br.close();
        bw.write(count + "");
        bw.flush();
        bw.close();

    }
}
