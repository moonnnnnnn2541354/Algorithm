package level_1;

import java.util.HashMap;
import java.util.Map;

public class Keyboard {
    public int[] solution(String[] keymap, String[] targets) {
        // keymap을 활용해서 targets를 입력할때 최소 입력횟수를 적으시요
        // keymap = {"ABACD", "BCEFD"} 일 경우
        // targets = {"ABCD","AABB"} 일 경우
        // 최소 입력횟수 targets1("ABCD")=9, targets2("AABB")=4
        // 단 targets문장을 완성시키지 못할경우에는 -1

        Map<String, Integer> key = new HashMap<>();

        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                String str = String.valueOf(keymap[i].charAt(j));
                if (!key.containsKey(str)) {
                    key.put(str, j + 1);
                }
                if (key.get(str) > j) {
                    key.put(str, j + 1);

                }
            }
        }

        int[] index = new int[targets.length];

        for (int i = 0; i < targets.length; i++) {
            for (int j = 0; j < targets[i].length(); j++) {
                String str = String.valueOf(targets[i].charAt(j));
                if (!key.containsKey(str)) {
                    index[i] = -1;
                    break;
                }
                index[i] += key.get(str);
            }
        }
        return index;
    }
}
