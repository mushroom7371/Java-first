package BaekJoon;

import java.io.*;
import java.util.*;

//프린터 큐
public class N1966 {
    public static void main(String[] args) throws IOException {
        //이번 문제는 생각을 굉장히 많이 함. 어려웠다
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int testCase = Integer.parseInt(br.readLine());

        for(int i = 0; i < testCase; i++){
            int index = 0;  //출력 순서
            int maxCount = 0;   //타켓 문서의 중요도 보다 중요한 문서의 숫자를 셀 변수
            st = new StringTokenizer(br.readLine());
            int numberOfDoc = Integer.parseInt(st.nextToken()); //문서의 수
            int targetDocIndex = Integer.parseInt(st.nextToken());  //출력할 문서의 인덱스
            String targetDoc = "";  //타켓 문서의 숫자를 저장할 String 변수
            //String a = "1", String b = "1" 이라고 했을때 "1" 이라는 내용은 같지만 참조변수 a와 b는 서로 다른 객체를 바라보기 때문에 이를 적용할 것임

            Queue<String> priorityQueue = new LinkedList<>();   //큐를 통해 문서를 뒤로 옮길 것임
            List<Integer> listForMax = new ArrayList<>();   //가장 우선순위인 문서를 구분하기 위한 ArrayList

            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < numberOfDoc; j++){   //문서의 수만큼 반복
                String doc = st.nextToken();

                if(j == targetDocIndex){    //j번째 문서가 주어진 문제의 인덱스와 같으면 출력 순서를 찾을 문서다
                    targetDoc = doc;
                }
                priorityQueue.offer(doc);   //큐에는 문자열로 저장하고,
                listForMax.add(Integer.parseInt(doc));  //ArrayList에 숫자로 저장
            }

            for(int k = 0; k < numberOfDoc; k++){   //타켓 문서보다 중요도가 높은 문서가 있으면 카운팅
                if(listForMax.get(k) > Integer.parseInt(targetDoc)){
                    maxCount++;
                }
            }

            Collections.sort(listForMax, Collections.reverseOrder());   //타켓문서보다 우선순위의 문서를 참고하기 위해 내림차순으로 정렬

            while(maxCount > 0){    //타켓 문서보다 중요한 문서가 없을때 까지 반복한다.
                int temp = Integer.parseInt(priorityQueue.peek());  //큐의 제일 앞단에 있는 문자열을 수로 저장
                int max = listForMax.get(0);    //정렬을 했기에 가장 높은 중요도를 가리킨다

                if(Integer.parseInt(targetDoc) >= temp){    //타켓 문서의 중요도가 큐의 가장 앞단에 있는 문서보다 높다면
                    priorityQueue.offer(priorityQueue.peek());  //큐에 추가 앞단의 문서를 추가하고
                    priorityQueue.poll();   //앞단의 문서를 제거. 즉, 문서를 뒤로 옮긴셈
                }else{  //타겟 문서보다 큐의 앞단에 있는 문서의 중요도가 높으면
                    if(max > temp){ //앞단의 문서의 중요도가 남아있는 문서의 가장 높은 중요도보다 작다면(즉, 큐 앞단의 중요도 보다 높은 중요도의 문서가 남아있다면)
                        priorityQueue.offer(priorityQueue.peek());  //마찬가지로 자리바꿈
                        priorityQueue.poll();
                    }else{  //큐의 가장 앞단의 문서가 제일 중요도가 높으면
                        priorityQueue.poll();   //문서 제거
                        listForMax.remove(0);   //해당 중요도 제거
                        maxCount--; //중요도 감소
                        index++;    //출력문서의 숫자 증가
                    }
                }
            }

            while(true){    //찾을 문서를 발견하면 반복을 중지할 예정으로 계속 반복하게 함
                if(Integer.parseInt(targetDoc) == Integer.parseInt(priorityQueue.peek())){  //타켓 문서의 중요도와 같은 중요도를 가진 문서라면
                    if(targetDoc == priorityQueue.peek()){  //String 변수의 특징을 이용하여 찾는 문서인지 확인, 맞다면
                        index++;    //출력 순서 증가
                        bw.write(index + "\n"); //출력 순서를 버퍼에 기록
                        break;  //반복 종료
                    }else{  //타겟 문서는 아니지만 같은 중요도를 가진 문서가 더 앞에 있으므로
                        index++;    //출력 순서 증가
                        priorityQueue.poll();   //해당 문서 제거
                    }
                }else{  //큐의 앞단의 문서가 타켓 중요도보다 작다면
                    if(targetDoc == priorityQueue.peek()){  //오잉 짜놓고 기억이 안남 왜 있지? 여기에 걸릴일이 없지 않나??
                        index++;
                        bw.write(index + "\n");
                        break;
                    }else{  //얘만 있어도 될거 같은데... 큐의 앞단의 문서와 타켓 문서의 중요도가 다르면(여기까지 왔으면 이미 타켓문서의 중요도 보다 작다는 것임)
                        priorityQueue.offer(priorityQueue.peek());  //뒤로 이동
                        priorityQueue.poll();
                    }
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
