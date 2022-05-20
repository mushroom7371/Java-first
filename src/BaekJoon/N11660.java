package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//구간 합 구하기5
public class N11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sizeOfTwoDimensionsArray = Integer.parseInt(st.nextToken());    //2차원 배열의 크기
        int numberOfTimesForSum = Integer.parseInt(st.nextToken()); //합을 구해야 되는 횟수
        int [][] numberTable = new int[sizeOfTwoDimensionsArray +1][sizeOfTwoDimensionsArray +1];   //구간합을 위해 생성한 배열, 편의상 1번지부터 시작할 예정이라 크기를 1늘렸다.
        int cumulativeSum = 0;  //구간 합들을 저장할 변수
        int x1 = 0, x2 = 0, y1 = 0, y2 = 0; //주어진 좌표를 저장할 변수

        for(int i = 1; i <= numberTable.length -1; i++){    //입력으로 주어진 숫자로 표를 채울 반복
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= numberTable[0].length -1; j++){
                numberTable[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 1; i < numberTable.length; i++){    //위의 표를 활용하여 각 누적 합을 2차원 배열에 덮어 씌운다.
            cumulativeSum = numberTable[i][1];
            for(int j = 1; j < numberTable[1].length; j++){
                if(j == 1){ //1차원 배열의 i번지가 가리키는 j번지가 첫 번째 번지라면 누적합이 아니라 자기 자신이 들어간다.
                    numberTable[i][j] = cumulativeSum;
                }else{  //첫번째 번지가 아니면 이전의 데이터와 합쳐 누적합을 구해 저장
                    numberTable[i][j] += numberTable[i][j-1];
                }
            }
        }

        for(int i = 0; i < numberOfTimesForSum; i++){   //주어진 좌표들 사이의 숫자의 합을 구하기 위한 반복
            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());

            if(x1 == x2 && y1 == y2){   //좌표가 같은 경우
                bw.write((numberTable[x1][y1] - numberTable[x1][y1-1]) + "\n"); //그 좌표까지의 구간합을 구한다. 좌표의 숫자 - 이전 좌표의 숫자
            }else{  //좌표가 다른경우
                cumulativeSum = 0;  //변수 재활용, 좌표 사이의 숫자를 더해 저장할 예정
                int x = x1; //x값은 주어지는 좌표에 따라 가변으로 변하므로 기준을 x1으로 설정

                for(int j = 0; j <= x2 - x1; j++){  //x좌표의 차이 만큼 반복
                    cumulativeSum += numberTable[x][y2] - numberTable[x][y1-1]; //해당 행의 조건에 맞는 구간합, 같은 행이기에 x좌표는 동일하지만 y좌표는 y2에서 y1-1(구간 합의 핵심)값과 같다 
                    x++;
                }

                bw.write(cumulativeSum + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
