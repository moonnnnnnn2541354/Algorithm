package kakao.level_1;

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            String s1 = findDecimalNumber(Integer.toString(arr1[i],2),n);
            String s2 = findDecimalNumber(Integer.toString(arr2[i],2),n);
            answer[i] = compare(s1,s2);
        }

        for (String s : answer) {
            System.out.println(s);
        }

        return answer;
    }

    private static String findDecimalNumber(String s, int n) {
        StringBuilder sb = new StringBuilder();
        if (s.length() < n) {
            sb.append("0".repeat(n - s.length()));
        }
        sb.append(s);
        return sb.toString();
    }

    private static String compare(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == '0' && s2.charAt(i) == '0') {
                sb.append(' ');
            }
            if (s1.charAt(i) != '0' || s2.charAt(i) != '0') {
                sb.append('#');
            }
        }
        return sb.toString();
    }
}