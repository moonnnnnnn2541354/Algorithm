package level_1;

public class PhoneNumberMasker {
    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder(phone_number);
        for (int i = 0; i < answer.length()-4; i++) {
            answer.setCharAt(i,'*');
        }
        return answer.toString();
    }
}
