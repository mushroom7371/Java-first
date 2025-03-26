package BaekJoon;

import java.io.*;

//비밀번호 발음하기
public class N4659 {
    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String password = br.readLine();
            if (password.equals("end")) {
                break;
            }

            boolean containVowel = false;
            char[] passwordArray = password.toCharArray();

            for (int i = 0; i < passwordArray.length; i++) {
                char current = passwordArray[i];
                if (current == 'a' || current == 'e' || current == 'i' || current == 'o' || current == 'u') {
                    containVowel = true;
                    break;
                }
            }

            if (!containVowel) {
                bw.write("<" + password + "> is not acceptable.\n");
                continue;
            }

            boolean isThreeVowel = false;
            boolean isThreeConsonant = false;
            for (int i = 0; i < passwordArray.length - 2; i++) {
                int vowelCount = 0;
                int consonantCount = 0;
                for (int j = i; j < i + 3; j++) {
                    char current = passwordArray[j];
                    if (current == 'a' || current == 'e' || current == 'i' || current == 'o' || current == 'u') {
                        vowelCount++;
                    } else {
                        consonantCount++;
                    }
                }
                if (vowelCount == 3) {
                    isThreeVowel = true;
                    break;
                }
                if (consonantCount == 3) {
                    isThreeConsonant = true;
                    break;
                }
            }

            if (isThreeVowel || isThreeConsonant) {
                bw.write("<" + password + "> is not acceptable.\n");
                continue;
            }

            boolean isSameChar = false;
            for (int i = 0; i < passwordArray.length - 1; i++) {
                if (passwordArray[i] == passwordArray[i + 1]) {
                    if (passwordArray[i] != 'e' && passwordArray[i] != 'o') {
                        isSameChar = true;
                        break;
                    }
                }
            }

            if (isSameChar) {
                bw.write("<" + password + "> is not acceptable.\n");
                continue;
            }

            bw.write("<" + password + "> is acceptable.\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N4659().solution();
    }
}
