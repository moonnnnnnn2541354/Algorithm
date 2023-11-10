import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quiz_9 {
    public static void main(String[] args) {
        // 문자열 나누기 (공백기준)

        // 이렇게 뽑을꺼임
        String s = "Java Study Test";
        String[] strArr = new String[3];
        strArr[0] = "Java";
        strArr[1] = "Study";
        strArr[2] = "Test";
        System.out.println(s.substring(5,12));
        for (int i = 0; i < strArr.length; i++) {
            System.out.print(strArr[i] + " , ");
        }
        System.out.println();




        // 1. 보편적인 방법
        // String s = "Java Study Test";
        String[] answer = s.split(" "); // 배열 선언&생성
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " , ");
        }
        System.out.println();

        // 2. 패턴 Pattern
        Pattern pattern = Pattern.compile(" "); // 패턴 선언
        String[] parts = pattern.split(s); // 배열 선언&생성
        for (int i = 0; i < parts.length; i++) {
            System.out.print(parts[i] + " , ");
        }
        System.out.println();

        // 3. 패턴 응용버전 정규식
        Pattern p = Pattern.compile("([a-zA-Z])+");
        Matcher m = p.matcher(s); // 더 보겠습니다 설명이 안되요 // 선언&생성
        while (m.find()) { // 찾아죠
            System.out.print(m.group() + " , "); // 뽑아죠
        }

        // 4.
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()){
            System.out.print(st.nextToken() + " , ");
        }
        System.out.println();


    }
}
