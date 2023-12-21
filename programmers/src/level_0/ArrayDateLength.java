package level_0;

public class ArrayDateLength {
    // 배열원소의길이
    public int[] solution(String[] strlist) {
        char[] chArr = new char[strlist.length];
        int[] answer = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++) {
            chArr = strlist[i].toCharArray();
            answer[i] = chArr.length;
        }
        return answer;
    }
}
