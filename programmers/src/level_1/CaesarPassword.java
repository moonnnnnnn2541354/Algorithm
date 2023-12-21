package level_1;

public class CaesarPassword {

    public String solution(String s, int n) {
        char[] charArr = s.toCharArray();
        int[] intArr = new int[charArr.length];
        for (int i = 0; i < intArr.length; i++) {
            if (charArr[i] == ' ') {
                continue;
            }
            intArr[i] = charArr[i];
            if (intArr[i] >= 65 && intArr[i] <= 90) {
                intArr[i] += n;
                if (intArr[i] > 90) {
                    intArr[i] -= 26;
                }
            }
            if (intArr[i] >= 97 && intArr[i] <= 122) {
                intArr[i] += n;
                if (intArr[i] > 122) {
                    intArr[i] -= 26;
                }
            }
            charArr[i] = (char) intArr[i];
        }
        String answer = String.valueOf(charArr);
        return answer;
    }
}
