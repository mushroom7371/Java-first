package BaekJoon;

import java.io.*;
import java.util.Arrays;

//애너그램
public class N6996 {
    public static void main(String[] args) throws IOException {
        //다른 방식으로 접근한 코드 BY MYC... 속도, 메모리 면에서 본인의 코드보다 낫다
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        while(testCase-->0) {   //MYC의 향기...
            String[] inputArray = br.readLine().split(" ");

            int[] abcCountArray = new int[26];  //단어가 소문자로만 주어지고 알파벳은 26개이므로 문자의 개수를 카운트 할 배열 선언
            for(char c : inputArray[0].toCharArray()) { //첫번째 단어를 문자배열로 변환하고 향상된 for문으로 한개씩 핸들링한다.
                abcCountArray[c - 'a']++;   //해당 문자를 배열의 각 인덱스에 매칭 되도록 'a' 를 뺀다. 그리고 그 인덱스의 카운트를 증가 시킴
            }

            for(char c : inputArray[1].toCharArray()) { //두번째 단어의 문자를 핸들링, 해당 문자가 있다면 일치하는 인덱스의 값을 한개씩 빼준다.
                abcCountArray[c - 'a']--;
            }

            boolean isAnagram = true;
            for(int cnt : abcCountArray) {  //해당 단어에 포함된 문자가 동일하다면 애너그램이다. 하나라도 카운트가 0이 아닐시 애너그램이 아님
                if(cnt != 0) {
                    isAnagram = false;
                    break;
                }
            }

            System.out.printf("%s & %s are %s\n", inputArray[0], inputArray[1], isAnagram ? "anagrams." : "NOT anagrams.");
        }
    }

//    내 코드
//    public static void main(String[] args) throws IOException {
//        //아래 문제풀이는 로직을 따로 메소드로 빼지 않았기에 백준 답지와 다름. 백준 답지는 하단에 주석으로 달아놓음
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int testCase = Integer.parseInt(br.readLine());
//
//        for(int i = 0; i < testCase; i++){
//            String [] inputArray = br.readLine().split(" ");
//
//            char [] stringToChar = inputArray[0].toCharArray(); //첫번재 단어를 toCharArray()를 통하여 문자 배열로 전환하고
//            Arrays.sort(stringToChar);  //문자 배열을 정렬
//            String input1 = new String(stringToChar);   //정렬된 문자 배열을 통하여 새로운 String 객체를 생성
//
//            stringToChar = inputArray[1].toCharArray(); //두번째 단어 또한 마찬가지로 위와 같은 방식으로 정렬된 String 객체 생성
//            Arrays.sort(stringToChar);
//            String input2 = new String(stringToChar);
//
//            if(input1.equals(input2)){  //정렬된 단어가 같다면 애너그램, 아니라면 애너그램이 아님
//                bw.write(inputArray[0] + " & " + inputArray[1] + " are anagrams.\n");
//            }else{
//                bw.write(inputArray[0] + " & " + inputArray[1] + " are NOT anagrams.\n");
//            }
//        }
//
//        br.close();
//        bw.flush();
//        bw.close();
//
//    }
}

//백준 제출 형식으로 짠 소스
//public class Main {
//
//    private static boolean solveAnagrams(String first, String second ) {
//        char [] stringToChar = first.toCharArray();
//        Arrays.sort(stringToChar);
//        String input1 = new String(stringToChar);
//
//        stringToChar = second.toCharArray();
//        Arrays.sort(stringToChar);
//        String input2 = new String(stringToChar);
//
//        if(input1.equals(input2)){
//            return true;
//        }else{
//            return false;
//        }
//
//
//
//        /* -------------------- END OF INSERTION --------------------*/
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int numTests = sc.nextInt();
//
//        for (int i = 0; i < numTests; i++) {
//            String first = sc.next().toLowerCase();
//            String second = sc.next().toLowerCase();
//
//            System.out.println(first + " & " + second + " are " + (solveAnagrams(first, second) ? "anagrams." : "NOT anagrams."));
//        }
//    }
//}

