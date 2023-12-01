package level_1;


public class String_Basic {

    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }
        return s.replaceAll("([0-9])", "").isEmpty();
    }
}
