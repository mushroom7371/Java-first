package BaekJoon;

import java.io.*;
import java.util.Arrays;

//좌표 정렬하기 2
public class N11651 {
    public static void main(String[] args) throws IOException {
        //N11650 좌표 정렬하기와 유사한 문제
        //y좌표가 증가하는 순서로 정렬 하되, y좌표가 같다면 x좌표가 증가하는 순서로 정렬
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        int [][] coordinates = new int[testCase][2];
        String [] coordinatesStringArray;

        for(int i = 0; i < testCase; i++){  //N11650 문제에서 x좌표, y좌표를 반대로 담아 두고
            coordinatesStringArray = br.readLine().split(" ");
            coordinates[i][0] = Integer.parseInt(coordinatesStringArray[1]);
            coordinates[i][1] = Integer.parseInt(coordinatesStringArray[0]);
        }

        br.close();

        Arrays.sort(coordinates, (o1, o2) -> {  //같은 방식으로 정렬 하되
            if(o1[0] == o2[0]){
                return o1[1] - o2[1];
            }else{
                return o1[0] - o2[0];
            }
        });

        for(int i = 0; i < testCase; i++){  //배열에 담을때 x,y좌표를 반대로 담았기에 출력도 반대로 하면 원하는 정렬이 완성된다.
            bw.write(coordinates[i][1] + " " + coordinates[i][0] + "\n");
        }

        bw.flush();
        bw.close();

    }
}
