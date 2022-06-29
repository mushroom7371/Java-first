package BaekJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//쉽게 푸는 문제
public class N1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int [] startEnd = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();    //시작과 끝 위치
        List<Integer> numberList = new ArrayList<>();   //수열을 담을 AraryList
        int number = 1; //수열을 만들기 위한 초기 숫자

        //수열을 그때 그때 범위만큼 만드는게 아니라 처음부터 세팅했음
        while(true){    //반복을 계속 돌린다.
            for(int i = 1; i <= number; i++){   //number는 while문 밖에 위치하므로 for문 내부에서는 항상 같은 숫자가된다. 1부터 number만큼 반복
                numberList.add(number);

                if(numberList.size() == 1000){  //주어진 문제의 시작,끝의 범위가 1000을 넘지 않으므로 1000이 되는 순간 for문을 빠져나가고
                    break;
                }
            }
            number++;   //for문 이후에는 숫자가 1늘어남

            if(numberList.size() == 1000){  //for문에서 벗어난 후 다시 while문을 벗어난다.
                break;
            }
        }

        int sum = 0;

        for(int i = startEnd[0]; i <= startEnd[1]; i++){    //범위 만큼 더하기
            sum += numberList.get(i - 1);   //ArrrayList의 데이터가 0번지부터 시작하므로 1적은 인덱스로 숫자를 찾는다.
        }

        br.close();
        bw.write(sum + "");
        bw.flush();
        bw.close();

    }
}
