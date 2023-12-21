package level_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinNumberRemover {

    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            intList.add(arr[i]);
        }
        Collections.sort(intList);
        int min = intList.get(0);

        int[] answer = new int[arr.length - 1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num > min) {
                answer[index++] = num;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {4,1,2,3};
        int[] answer = new int[arr.length-1];
        int minIndex = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[minIndex] > arr[i]){
                minIndex = i;
            }
        }
        for(int i = minIndex+1; i < arr.length; i++){
            arr[i-1] = arr[i];
        }
        for(int i = 0; i < answer.length; i++){
            answer[i] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();

        for (int i = 0; i <answer.length; i++) {
            System.out.println(answer[i]);
        }
    }

}
