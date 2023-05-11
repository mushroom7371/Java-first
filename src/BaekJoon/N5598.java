package BaekJoon;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

//카이사르 암호
public class N5598 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String beforeChangeString = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";
        String afterChangeString = "D E F G H I J K L M N O P Q R S T U V W X Y Z A B C";
        String[] beforeChangeArray = beforeChangeString.split(" ");
        String[] afterChangeArray = afterChangeString.split(" ");
        Map<String, String> matchMap = new HashMap<>();

        for (int i = 0; i < beforeChangeArray.length; i++) {
            matchMap.put(afterChangeArray[i], beforeChangeArray[i]);
        }

        String input = br.readLine();

        for (int i = 0; i < input.length(); i++) {
            bw.write(matchMap.get(String.valueOf(input.charAt(i))));
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N5598().solution();
    }
}
