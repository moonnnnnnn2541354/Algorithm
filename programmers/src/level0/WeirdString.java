package level0;

import java.util.regex.Pattern;

public class WeirdString {
    public String solution(String s) {
        char[] charArr = s.toCharArray(); // char배열 생성 -> s 를 다 쪼개는거에요 a b c d
        int index = 0; // index 선언
        String answer = ""; // answer 선언
        for (int i = 0; i < charArr.length; i++) { // char배열만 실행
            if (charArr[i] == ' ') { // 공백이면
                index = 0; // 0
                answer += ' '; // answer 넣는거에요
            } else if (charArr[i] != ' ') {
                answer += (index++ % 2 == 0) ? Character.toUpperCase(charArr[i]) : Character.toLowerCase(charArr[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = " string inde xof ";
//        // 나누고
//        String[] strArr = s.split(" "); // " " 기준으로 각 단어들로 배열생성 공백 빼고 String 배열 생성
//        for (int i = 0; i < strArr.length; i++) { // 배일길이 만큼 실행
//            strArr[i] = strArr[i].toLowerCase(); // 먼저 소문자로 변환 하고
//            // 1회용 코드
//            char[] charArr = strArr[i].toCharArray(); // 그걸 char 배열로 생성
//            for (int j = 0; j < charArr.length; j += 2) { // 0,2,4,6 ... 2배수 자리만 실행
//                charArr[j] = Character.toUpperCase(charArr[j]); // 0,2,4,6 ... 2배수 자리 대문자
//            }
//            strArr[i] = String.valueOf(charArr); // char배열을 strArr[i]번째 넣어줘
//        }
//        // 합하고
//        String answer = String.join(" ", strArr); // 배열의 단어들 사이에 " " 를 붙여서 하나의 문자열로 생성
//        System.out.println(answer);

        char[] charArr = s.toCharArray();
        int index = 0;
        String answer = "";
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == ' ') {
                index = 0;
                answer += ' ';
            } else if (charArr[i] != ' ') {
                char c = (index++ % 2 == 0) ? Character.toUpperCase(charArr[i]) : Character.toLowerCase(charArr[i]);
                answer += c;
            }
        }
        System.out.println(answer);

    }

}
