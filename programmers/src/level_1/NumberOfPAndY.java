package level_1;

public class NumberOfPAndY {
    boolean solution(String s) {
        char[] chars =  s.toCharArray();

        int cnt = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'P' || chars[i] == 'p'){
                cnt++;
            }
            if (chars[i] == 'Y' || chars[i] == 'y'){
                cnt--;
            }
        }

        if (cnt == 0) {
            return true;
        }
        return false;
    }
}
