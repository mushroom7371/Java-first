package BaekJoon;

import java.io.*;

//1, 2, 3 더하기
public class N9095 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int [] dpArray = new int[11];   //주어진 수가 11보다 적은 양수이므로 크기 11로 선언

    void solution() throws IOException {
        int testCase = Integer.parseInt(br.readLine());
        int targetNumber = 0;

        dpArray[0] = 0; //배열은 0번지부터 시작하므로 편의상 0을 두었다 사실 배열 선언시 0으로 초기화 되어서 따로 작성 안해도 될 코드
        dpArray[1] = 1;
        dpArray[2] = 2;
        dpArray[3] = 4;

        for(int i = 0; i < testCase; i++){
            targetNumber = Integer.parseInt(br.readLine());

            for(int j = 4; j <= targetNumber; j++){ //타겟 숫자가 4이상 일때 도는 반복문
                dpArray[j] = dpArray[j-1] + dpArray[j-2] + dpArray[j-3];
                //1,2,3 의 경우의 수로 표현하기에 이미 배열에 저장된 정보를 가지고 구한다.
                //4의 경우 1+3, 2+2, 3+1 => 3의 1,2,3 더하기 경우의수 (4) + 2의 경우의수 (2) + 1의 경우의수 (1) = 7
                //5의 경우 1+4, 2+3, 3+2 => 4의 경우의수 (7) + 3의 경우의수 (4) + 2의 경우의수 (2) = 13
                //6의 경우 1+5, 2+4, 3+3 => 5의 경우의수 (13) + 4의 경우의수 (7) + 3의 경우의수 (4) = 24
                //여기서 구한 값을 배열에 담는 방식을 메모라이즈 라고 한다.
            }

            bw.write(dpArray[targetNumber] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N9095().solution();
    }
}
