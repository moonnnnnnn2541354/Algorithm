package level_1;

public class CleanDesktop {
    public int[] solution(String[] wallpaper) {
        int[] answer = {
                Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE
        };

        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    answer[0] = Math.min(answer[0], i);
                    answer[1] = Math.min(answer[1], j);
                    answer[2] = Math.max(answer[2], i + 1);
                    answer[3] = Math.max(answer[3], j + 1);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] wallpaper = {
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................#",
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................",
                "..................................................",
                ".................................................."


        };

        int[] answer = {wallpaper[0].length() - 1, wallpaper[0].length() - 1, 0, 0};

        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (i < 50 && j < 50 && wallpaper[i].charAt(j) == '#') {
                    answer[0] = Math.min(answer[0], i);
                    answer[1] = Math.min(answer[1], j);
                    answer[2] = Math.max(answer[2], i + 1);
                    answer[3] = Math.max(answer[3], j + 1);
                }
            }
        }

        System.out.println(answer[0] + "," + answer[1] + " " + answer[2] + "," + answer[3]);


        int minRow, minCol;
        int maxRow, maxCol;

        minRow = minCol = Integer.MAX_VALUE;
        maxRow = maxCol = Integer.MIN_VALUE;

        int row = wallpaper.length;
        int col = wallpaper[0].length();

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if (wallpaper[r].charAt(c) == '#') {
                    minRow = Math.min(minRow, r);
                    minCol = Math.min(minCol, c);
                    maxRow = Math.max(maxRow, r);
                    maxCol = Math.max(maxCol, c);
                }
            }
        }

        int[] answer2 = new int[]{minRow, minCol, maxRow + 1, maxCol + 1};


        System.out.println(answer2[0] + "," + answer2[1] + " " + answer2[2] + "," + answer2[3]);
    }
}
