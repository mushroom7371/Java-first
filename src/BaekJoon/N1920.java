package BaekJoon;

import java.io.*;
import java.util.Arrays;

//수 찾기
public class N1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int [] arrayN = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray(); //int 타입으로 변환 후 정렬까지 완료하여 배열에 저장
        int M = Integer.parseInt(br.readLine());
        int [] targetArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for(int i = 0; i < M; i++){
            int start = 0;  //시작 번지
            int end = N-1;  //마지막 번지
            int target = targetArray[i];    //판별할 숫자

            while(true){    //조건을 따로 두지 않아 break문을 만나기 전까지 반복을 실시한다.
                if(target < arrayN[start] || target > arrayN[end]){ //정렬이 되어있기에 첫,마지막 숫자의 범위를 넘어서면 없는 숫자이다.
                    bw.write(0 + "\n");
                    break;
                }

                int mid = (start + end) / 2;    //중간 데이터를 위한 연산

                if(target > arrayN[mid]){   //타겟이 중간 번지에 있는 숫자보다 크다면
                    if(target == arrayN[end]){  //타겟이 마지막 번지의 숫자와 같다면 존재하므로 1을 버퍼에 기록
                        bw.write(1 + "\n");
                        break;
                    }else if(end == mid + 1){ // start +1 == end 로 변경 가능, 중간 번지와 마지막 번지가 연달아 있다면(바로 위의 if문에서 걸러지지 않은 결과라 일치하는 숫자가 없다는 의미)
                        bw.write(0 + "\n");
                        break;
                    }
                    start = mid;    //위에서 끝나지 않았기에 이분 탐색을 다시 시작 하기 위해 범위를 조정한다.
//                    mid += (end - start)/2;
                }else{  //타겟이 중간 번지에 있는 숫자보다 작거나 같다면
                    if(target == arrayN[mid]){  //타겟이 중간 번지의 숫자와 같으면 존재함
                        bw.write(1 + "\n");
                        break;
                    }
                    end = mid;  //아니면 다시 범위 조정
//                    mid = (end - start)/2 + start;
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }

//        =============================================================================
//        int N = Integer.parseInt(br.readLine());
//        String [] inputN = br.readLine().split(" ");
//        Set<Integer> setN = new HashSet<>();    //중복을 제외하여 기준 숫자를 담을 hashSet
//
//        for(int i = 0; i < N; i++){
//            setN.add(Integer.parseInt(inputN[i]));
//        }
//
//        int M = Integer.parseInt(br.readLine());
//        int [] arrayM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//        //스트림을 통해 엘리먼트들을 순회 하면서 처리, 입력으로 들어온 값이 공백을 기준으로 나뉘어져 있는 상태며 이를 하나씩 핸들링한다.
//        //mapToInt()를 통해 Mapping 연산을 String 값을 int형으로 타입 변환을 하고, toArray()를 통하여 배열에 순차적으로 해당 데이터를 저장한다.
//
//        for(int i = 0; i < M; i++){
//            if(setN.contains(arrayM[i])){   //i번지에 있는 데이터가 hashSet에 있다면
//                bw.write(1 + "\n");
//            }else{
//                bw.write(0 + "\n");
//            }
//        }
//
//        br.close();
//        bw.flush();
//        bw.close();

}
