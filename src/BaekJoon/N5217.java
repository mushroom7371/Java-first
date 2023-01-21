package BaekJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//쌍의 합
public class N5217 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        int [] numberArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        String resultStr = "Pairs for ";

        for (int i = 1; i <= testCase; i++) {
            int targetNumber = Integer.parseInt(br.readLine());
            List<String> resultList = new ArrayList<>();

            for (int j = 0; j < numberArray.length-2; j++) {
                for (int k = j+1; k < numberArray.length; k++) {
                    if (numberArray[j]+numberArray[k] == targetNumber) {
                        resultList.add(numberArray[j] + " " + numberArray[k]);
                        break;
                    }
                }
            }

            bw.write(resultStr + targetNumber + ": ");

            for (int j = 0; j < resultList.size(); j++) {
                if (j == resultList.size()-1) {
                    bw.write(resultList.get(j));
                    break;
                }
                bw.write(resultList.get(j) + ", ");
            }

            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N5217().solution();
    }

//    private static ArrayList<Integer> solveSumPairs(int target) {
//
//        ArrayList<Integer> answer = new ArrayList<Integer>();
//
//        /* ------------------- INSERT CODE HERE ---------------------*/
//
//        // answer.add(x);		// adds x to ArrayList<Integer> answer
//        int [] numberArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
//
//        for (int i = 0; i < numberArray.length-2; i++) {
//            for (int j = i+1; j < numberArray.length; j++) {
//                if (numberArray[i]+numberArray[j] == target) {
//                    answer.add(numberArray[i]);
//                    answer.add(numberArray[j]);
//                    break;
//                }
//            }
//        }
//
//        /* -------------------- END OF INSERTION --------------------*/
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int numCases = sc.nextInt();
//
//        for(int n = 0; n < numCases; n++)
//        {
//            int target = sc.nextInt();
//
//            ArrayList<Integer> answer = solveSumPairs(target);
//
//            System.out.print("Pairs for "+target+": ");
//
//            for (int i = 0; i<answer.size(); i+=2 ) {
//                if (i>0)
//                    System.out.print(", ");
//                System.out.print(answer.get(i) + " " + answer.get(i+1));
//            }
//            System.out.println();
//        }
//    }
}
