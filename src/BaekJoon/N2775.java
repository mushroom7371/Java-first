package BaekJoon;

import java.io.*;

//부녀회장이 될테야
public class N2775 {

    public static int [][] apt = new int[15][15];
    //아파트의 층, 호수가 담길 2차원 배열 생성 static으로 선언하여 클래스가 메모리에 적재될 때 생성됨

    public static void main(String[] args) throws IOException {
        //buffer 관련 설명은 N15552.java, N10951.java 파일 참고
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        initApt();  //하단에 선언한 메서드 호출로 각 호의 입주민 인원수를 세팅
        int testCase = Integer.parseInt(br.readLine()); //테스트 케이스 갯수

        for(int i = 0; i < testCase; i++){
            int floor = Integer.parseInt(br.readLine());    //층
            int ho = Integer.parseInt(br.readLine());   //호
            bw.write(apt[floor][ho] + "" + "\n");   //배열에 담긴 층,호에 해당하는 인원수를 버퍼에 기록
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void initApt(){   //인원수 세팅 메서드
        for(int i = 0; i < 15; i ++){   //0층부터 14층 까지
            apt[i][1] = 1;  //각 층의 1호는 1명
            apt[0][i] = i;  //0층은 i호에 i명
        }

        //  1   6   21  56  126 ...
        //  1   5   15  35  70  ...
        //  1   4   10  20  35  ...
        //  1   3   6   10  15  ...
        //  1   2   3   4   5   ...
        for(int i = 1; i < 15; i++){    //0층을 제외한 1층부터 14층 까지
            for(int j = 2; j < 15; j++){    //1호를 제외한 2호부터 시작
                apt[i][j] = apt[i][j-1] + apt[i-1][j];
                //i층 j호의 인원수는 같은 층 이전 호수의 사람과 한층 밑 j호의 인원의 합과 같다
            }
        }
    }

}
