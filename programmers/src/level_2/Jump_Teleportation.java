package level_2;

public class Jump_Teleportation {
    public int solution(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                n /= 2;
            }
            if (n % 2 != 0) {
                n--;
                count++;
            }
        }
        return count;
    }
}
