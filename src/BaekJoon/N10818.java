package BaekJoon;

import java.io.*;

//최대, 최소
public class N10818 {
    public static void main(String[] args) throws IOException {
        //버퍼 관련 내용은 이전 커밋내용 참고
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int total = Integer.parseInt(br.readLine());
        String [] numbers = br.readLine().split(" ");
        int min = Integer.parseInt(numbers[0]); //최대값, 최소값을 구하기 위한 기준을 설정
        int max = Integer.parseInt(numbers[0]);

        //처음엔 주어진 값을 int 배열로 담고, Arrays.sort() 메서드를 통하여 정렬하고 배열의 첫번째, 마지막 번째 데이터를 출력했었다.
        //정답 도출엔 문제가 없었으나 시간이 1456ms 로 오래 걸리는 것을 확인하여 이를 줄이고자 생각한 결과
        //아래와 같이 if문을 통하여 최대, 최소값을 구하는 방식으로 변경하였고 524ms 로 시간이 약 1/3가량 단축된 것을 확인하였다.
        //Arrays.sort() 메서드에 대하여 찾아보니 원시타입(primitive type), 참조 타입의 경우 분기가 나눠지며 원시타입의 경우(int 등)
        //DualPivotQuickSort()를 통하여 정렬한다고 한다. 내부적으로 깊게 확인 하기는 아직 어려워서 뇌피셜로 생각해 보니
        //배열에 담긴 값을 정렬할 때는 그 배열의 해당 번지의 데이터만 움직여 구할 수는 없고, new를 통하여 반복마다 새로운 배열을 생성하여 시간이
        //오래 걸리는 것 같았다. 이번 문제의 경우 배열을 정렬하는 것이 포인트가 아니라 최대, 최소값을 구하는 것이 핵심이므로 요구에 맞게 문제를 수정했다.
        for(int i = 0; i < total; i++){
            int num = Integer.parseInt(numbers[i]);
            if(min > num){
                min = num;
            }
            if(max < num){
                max = num;
            }
        }

        bw.write(min + " " + max);

        br.close();
        bw.flush();
        bw.close();

    }
}
