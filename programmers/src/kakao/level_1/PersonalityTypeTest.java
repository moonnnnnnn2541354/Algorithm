package kakao.level_1;

import java.util.HashMap;
import java.util.Map;

public class PersonalityTypeTest {
    // 1번 지표	라이언형(R), 튜브형(T)
    // 2번 지표	콘형(C), 프로도형(F)
    // 3번 지표	제이지형(J), 무지형(M)
    // 4번 지표	어피치형(A), 네오형(N)

    // MBTI 처럼 총 16가지 성격유형이 나와야함
    // n가지의 질문
    // 선택지 7가지 , 각 점수 (예시)
    // 매우 비동의 : A형 +3
    //     비동의 : A형 +2
    // 약간 비동의 : A형 +1
    //    모르겠음 : +0
    //   약간 동의 : B형 +1
    //       동의 : B형 +2
    //   매우 동의 : B형 +3

    // 지표는 사전순으로 진행
    // 점수가 A형B형 둘다 동점이라면 사전순의 지표인 A형이 선택됨
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> typePoint = new HashMap<>();
        typePoint.put('R', 0);
        typePoint.put('T', 0);
        typePoint.put('C', 0);
        typePoint.put('F', 0);
        typePoint.put('J', 0);
        typePoint.put('M', 0);
        typePoint.put('A', 0);
        typePoint.put('N', 0);

        for (int i = 0; i < survey.length; i++) {
            switch (choices[i]) {
                case 1:
                    typePoint.put(survey[i].charAt(0), typePoint.get(survey[i].charAt(0)) + 3);
                    break;
                case 2:
                    typePoint.put(survey[i].charAt(0), typePoint.get(survey[i].charAt(0)) + 2);
                    break;
                case 3:
                    typePoint.put(survey[i].charAt(0), typePoint.get(survey[i].charAt(0)) + 1);
                    break;
                case 5:
                    typePoint.put(survey[i].charAt(1), typePoint.get(survey[i].charAt(1)) + 1);
                    break;
                case 6:
                    typePoint.put(survey[i].charAt(1), typePoint.get(survey[i].charAt(1)) + 2);
                    break;
                case 7:
                    typePoint.put(survey[i].charAt(1), typePoint.get(survey[i].charAt(1)) + 3);
                    break;
            }
        }

        StringBuilder answer = new StringBuilder();

        answer.append(compareChar('R', 'T', typePoint));
        answer.append(compareChar('C', 'F', typePoint));
        answer.append(compareChar('J', 'M', typePoint));
        answer.append(compareChar('A', 'N', typePoint));

        return answer.toString();
    }

    private static char compareChar(char c1, char c2, Map<Character, Integer> map) {
        return (map.get(c1) >= map.get(c2)) ? c1 : c2;
    }

    public static void main(String[] args) {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};
        // 결과값 TCMA

        Map<Character, Integer> typePoint = new HashMap<>();
        typePoint.put('R', 0);
        typePoint.put('T', 0);
        typePoint.put('C', 0);
        typePoint.put('F', 0);
        typePoint.put('J', 0);
        typePoint.put('M', 0);
        typePoint.put('A', 0);
        typePoint.put('N', 0);

        for (int i = 0; i < survey.length; i++) {
            switch (choices[i]) {
                case 1:
                    typePoint.put(survey[i].charAt(0), typePoint.get(survey[i].charAt(0)) + 3);
                    break;
                case 2:
                    typePoint.put(survey[i].charAt(0), typePoint.get(survey[i].charAt(0)) + 2);
                    break;
                case 3:
                    typePoint.put(survey[i].charAt(0), typePoint.get(survey[i].charAt(0)) + 1);
                    break;
                case 5:
                    typePoint.put(survey[i].charAt(1), typePoint.get(survey[i].charAt(1)) + 1);
                    break;
                case 6:
                    typePoint.put(survey[i].charAt(1), typePoint.get(survey[i].charAt(1)) + 2);
                    break;
                case 7:
                    typePoint.put(survey[i].charAt(1), typePoint.get(survey[i].charAt(1)) + 3);
                    break;
            }
        }

        StringBuilder answer = new StringBuilder();

        char ch;
        if (typePoint.containsKey('R') || typePoint.containsKey('T')) {
            ch = (typePoint.get('R') >= typePoint.get('T')) ? 'R' : 'T';
            typePoint.remove('R');
            typePoint.remove('T');
            answer.append(ch);
        }
        if (typePoint.containsKey('C') || typePoint.containsKey('F')) {
            ch = (typePoint.get('C') >= typePoint.get('F')) ? 'C' : 'F';
            typePoint.remove('C');
            typePoint.remove('F');
            answer.append(ch);
        }
        if (typePoint.containsKey('J') || typePoint.containsKey('M')) {
            ch = (typePoint.get('J') >= typePoint.get('M')) ? 'J' : 'M';
            typePoint.remove('J');
            typePoint.remove('M');
            answer.append(ch);
        }
        if (typePoint.containsKey('A') || typePoint.containsKey('N')) {
            ch = (typePoint.get('A') >= typePoint.get('N')) ? 'A' : 'N';
            typePoint.remove('A');
            typePoint.remove('N');
            answer.append(ch);
        }
        System.out.println(answer);

    }
}
