package BaekJoon;

import java.io.*;
import java.util.Arrays;

//나무 조각
public class N2947 {
    public static void main(String[] args) throws IOException {
        //bubble
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int [] arrayForBubbleSort = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();  //N2693 참고
        int temp = 0;   //두 수를 바꾸기 위해 사용할 임시 변수

        for(int i = 0; i < arrayForBubbleSort.length; i++){ //원소의 개수 만큼 반복
            for(int j = 0; j < arrayForBubbleSort.length - 1; j++){ //해당 숫자와 다음 숫자를 비교할 것으로 반복 범위는 배열의 크기 -1이 된다.
                if(arrayForBubbleSort[j] > arrayForBubbleSort[j + 1]){  //j번지 숫자가 j+1번지 숫자 보다 크다면
                    temp = arrayForBubbleSort[j];   //j번지 숫자를 임시 변수에 저장하고
                    arrayForBubbleSort[j] = arrayForBubbleSort[j + 1];  //j번지의 공간에 데이터를 j+1번지 숫자를 저장하고
                    arrayForBubbleSort[j + 1] = temp;   //j+1번지에는 기존의 j번지에 있던 수(temp)를 저장한다.

                    for(int k = 0; k < arrayForBubbleSort.length; k++){ //여기서 부터는 출력을 위한 반복
                        if(k < arrayForBubbleSort.length -1){   //마지막 번지의 데이터가 아니면 줄 바꿈을 하지 않는다.
                            bw.write(arrayForBubbleSort[k] + " ");
                        }else{
                            bw.write(arrayForBubbleSort[k] + "\n");
                        }
                    }
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
