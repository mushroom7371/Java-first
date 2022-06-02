package BaekJoon;

import java.io.*;
import java.util.Arrays;

//보물
public class N1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int arraySize = Integer.parseInt(br.readLine());
        int [] arrayA = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        int [] arrayB = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        //스트림을 통해 엘리먼트들을 순회 하면서 처리, 입력으로 들어온 값이 공백을 기준으로 나뉘어져 있는 상태며 이를 하나씩 핸들링한다.
        //mapToInt()를 통해 Mapping 연산을 String 값을 int형으로 타입 변환을 하고, sorted()로 오름차순 정렬 후, toArray()를 통하여 배열에 순차적으로 해당 데이터를 저장한다.
        int sum = 0;

        for(int i = 0; i < arraySize; i++){ //arrayA의 가장 작은 값과 arrayB의 가장 큰 값을 곱한 결과를 더하여 주면 최솟값이 된다.
            sum += arrayA[i] * arrayB[arraySize - 1 - i];
        }

        br.close();
        bw.write(sum + "");
        bw.flush();
        bw.close();

    }
}
