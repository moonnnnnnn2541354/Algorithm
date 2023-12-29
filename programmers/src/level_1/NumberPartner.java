package level_1;

import java.util.HashMap;
import java.util.Map;

public class NumberPartner {

    public String solution(String X, String Y) {
        Map<Integer, Integer> xMap = new HashMap<>();
        Map<Integer, Integer> yMap = new HashMap<>();
        for (String data : X.split("")) {
            int i = Integer.parseInt(data);
            xMap.put(i, xMap.getOrDefault(i, 0) + 1);
        }
        for (String data : Y.split("")) {
            int i = Integer.parseInt(data);
            yMap.put(i, yMap.getOrDefault(i, 0) + 1);
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            if (xMap.containsKey(i) && yMap.containsKey(i)){
                int cnt = Math.min(xMap.get(i),yMap.get(i));
                for (int j = 0; j < cnt; j++) {
                    answer.append(i);
                }
            }
        }

        if (answer.toString().startsWith("0")){
            return "0";
        }
        if (answer.toString().length()==0){
            return "-1";
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        String X = "100";
        String Y = "203045";

        Map<Integer, Integer> xMap = new HashMap<>();
        Map<Integer, Integer> yMap = new HashMap<>();
        for (String data : X.split("")) {
            int i = Integer.parseInt(data);
            xMap.put(i, xMap.getOrDefault(i, 0) + 1);
        }
        for (String data : Y.split("")) {
            int i = Integer.parseInt(data);
            yMap.put(i, yMap.getOrDefault(i, 0) + 1);
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            if (xMap.containsKey(i) && yMap.containsKey(i)){
                int cnt = Math.min(xMap.get(i),yMap.get(i));
                for (int j = 0; j < cnt; j++) {
                    answer.append(i);
                }
            }
        }

        if (answer.toString().startsWith("0")){
            System.out.println("0");
        }
        if (answer.toString().length()==0){
            System.out.println("-1");
        }
        System.out.println(answer.toString());


    }

}
