package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//교수님 그림이 깨지는데요?
public class N20205 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int beforeSize = Integer.parseInt(st.nextToken());  //원본 가로/세로 길이
        int[][] beforeArray = new int[beforeSize][beforeSize];  //원본 픽셀 정보를 담을 2차원 배열
        int afterSize = Integer.parseInt(st.nextToken()) * beforeSize;  //업샘플링에 필요한 가로/세로 길이 -> 원본길이를 곱해준다.
        int[][] afterArray = new int[afterSize][afterSize]; //업샘플링 픽셀 정보를 담을 2차원 배열

        for(int i = 0; i < beforeSize; i++){    //원본 픽셀 정보를 배열에 담는다.
            st = new StringTokenizer(br.readLine());

            for(int j = 0; j < beforeSize; j++){
                beforeArray[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < afterArray.length; i++){
            for(int j = 0; j < afterArray[0].length; j++){
                afterArray[i][j] = beforeArray[i/(afterSize/beforeSize)][j/(afterSize/beforeSize)]; //나누기 연산을 통해 늘린 픽셀 만큼 원본 픽셀을 2차원배열에 넣어준다.
                //예를 들어 2배가 되었다면 0번지, 1번지에 담길 픽셀 정보는 원본픽셀 정보의 0번지에 해당 된다, 2,3번지에 담길 정보는 원본 픽셀의 1번지에 해당된다
                //3배가 되었다면 0,1,2 번지에 담길 픽셀정보는 원본 픽셀 정보의 0번지에 해당되는 로직임.
                if(j == afterArray[0].length - 1){  //버퍼 기록용
                    bw.write(afterArray[i][j] + "");
                }else{
                    bw.write(afterArray[i][j] + " ");
                }
            }
            if(i != afterArray.length - 1){
                bw.write("\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N20205().solution();
    }
}
