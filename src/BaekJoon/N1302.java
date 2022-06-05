package BaekJoon;

import java.io.*;
import java.util.*;

//베스트셀러
public class N1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        Map<String, Integer> bookList = new HashMap<>();    //중복 된 책의 숫자를 저장할 hashMap
        int max = 1;    //최대 중복 개수

        for(int i = 0; i < testCase; i++){
            String bookName = br.readLine();
            if(bookList.containsKey(bookName)){ //hashMap에 입력된 도서명이 존재한다면
                bookList.put(bookName, bookList.get(bookName) + 1); //중복 카운트를 늘려준다.
            }else{  //아니라면 책이름을 저장하고, 개수를 1로 설정
                bookList.put(bookName, 1);
            }

            if(max <= bookList.get(bookName)){  //개수가 max값보다 크다면 max값 재설정
                max = bookList.get(bookName);
            }
        }

        br.close();
        List<String> bookListForSort = new ArrayList<>();

        for(String key : bookList.keySet()){    //key값으로 value를 찾아 max값이면 저장
            if(bookList.get(key).equals(max)){
                bookListForSort.add(key);
            }
        }

        Collections.sort(bookListForSort);  //정렬 후
        bw.write(bookListForSort.get(0));   //첫번째 도서명 버퍼에 기록 후 출력
        bw.flush();
        bw.close();

    }
}
