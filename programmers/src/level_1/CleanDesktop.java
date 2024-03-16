package level_1;

public class CleanDesktop {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];

        //answer[0] 자리
        for (int i = 0; i < wallpaper.length; i++) {
            if (wallpaper[i].contains("#")) {
                answer[0] = i;
                break;
            }
        }

        //answer[1] 자리
        answer[1] = wallpaper[0].length() - 1;
        for (String s : wallpaper) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '#' && i < answer[1]) {
                    answer[1] = i;
                }
            }
        }

        //answer[2] 자리
        for (int i = wallpaper.length - 1; i >= 0; i--) {
            if (wallpaper[i].contains("#")) {
                answer[2] = i + 1;
                break;
            }
        }

        //answer[3] 자리
        answer[3] = 0;
        for (int i = wallpaper.length - 1; i >= 0; i--) {
            for (int j = wallpaper[i].length() - 1; j >= 0; j--) {
                if (wallpaper[i].charAt(j) == '#' && answer[3] < j + 1) {
                    answer[3] = j + 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] wallpaper = {
                "..", "#."
        };

        int[] answer = {0, 0, wallpaper[0].length() - 1, wallpaper[0].length() - 1};

        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[0].length(); j++) {
                if (wallpaper[0].charAt(j) == '#') {
                    answer[0] = Math.min(answer[0], i);
                    answer[1] = Math.min(answer[1], j);
                    answer[2] = Math.max(answer[2], i);
                    answer[3] = Math.max(answer[3], j);
                }
            }
        }


        System.out.println(answer[0]);
        System.out.println(answer[1]);
        System.out.println(answer[2]);
        System.out.println(answer[3]);
    }
}
