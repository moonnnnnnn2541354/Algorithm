package level_1;

public class Babbling {
    public int solution(String[] babbling) {
        String[] say = {"aya", "ye", "woo", "ma"};
        int cnt = 0;

        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < say.length; j++) {
                if (babbling[i].contains(say[j] + say[j])) break;
                else if (babbling[i].contains(say[j])) {
                    babbling[i] = babbling[i].replace(say[j], " ");
                }
            }
            babbling[i] = babbling[i].replace(" ","");
            if (babbling[i].isEmpty()) {
                cnt++;
            }
        }
        return cnt;
    }
}
