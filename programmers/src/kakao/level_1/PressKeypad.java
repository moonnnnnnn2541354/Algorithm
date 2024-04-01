package kakao.level_1;

public class PressKeypad {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int left = 10;
        int right = 12;

        for (int num : numbers) {
            if (num == 0) num = 11;

            if (num % 3 == 1) {
                answer.append('L');
                left = num;
            } else if (num % 3 == 0) {
                answer.append('R');
                right = num;
            } else {
                int left_Distance = Math.abs(((left - num) / 3) + ((left - num) % 3));

                int right_Distance = Math.abs(((right - num) / 3) + ((right - num) % 3));

                if (left_Distance < right_Distance
                        || (left_Distance == right_Distance && hand.equals("left"))) {
                    answer.append('L');
                    left = num;
                } else if (left_Distance > right_Distance
                        || (left_Distance == right_Distance && hand.equals("right"))) {
                    answer.append('R');
                    right = num;
                }
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        //      1 2 3
        // 왼손  4 5 6  오른손
        //      7 8 9
        //      * 0 #

        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand = "left";
        // LRLLLRLLRRL
        int left = 10;
        int right = 12;

        StringBuilder answer = new StringBuilder();

        for (int num : numbers) {
            if (num == 0) num = 11;
            if (num % 3 == 1) {
                answer.append('L');
                left = num;
            } else if (num % 3 == 0) {
                answer.append('R');
                right = num;

            } else {
                // (left - num) / 3) 상하
                // (left - num) % 3) 좌우
                int left_Distance = Math.abs(((left - num) / 3) + ((left - num) % 3));
//                left_Distance = (left_Distance<0)?left_Distance*-1:left_Distance;

                int right_Distance = Math.abs(((right - num) / 3) + ((right - num) % 3));
//                right_Distance = (right_Distance<0)?right_Distance*-1:right_Distance;

                if (left_Distance < right_Distance
                        || (left_Distance == right_Distance && hand.equals("left"))) {
                    answer.append('L');
                    left = num;
                } else if (left_Distance > right_Distance
                        || (left_Distance == right_Distance && hand.equals("right"))) {
                    answer.append('R');
                    right = num;
                }
            }
        }
        System.out.println("정답 : LRLLRRLLLRR");
        System.out.println("계산 : " + answer);
    }


}

