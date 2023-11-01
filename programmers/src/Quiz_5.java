import java.util.ArrayList;
import java.util.Scanner;

public class Quiz_5 {
    public static void main(String[] args) {
        // List
        // 선언 : ArrayList<래퍼클래스> list = new ArrayList<>();
        // 추가 : list.add(0);
        // 불러오기 : list.get(0);
        // 삭제 : list.remove(0);
        // 전체삭제 : list.clear();
        // 길이 : list.size();
        // List 가 비었는지 안비었는지 : list.isEmpty();
        // 포함여부 : list.contains(0);
        //

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            System.out.print("팀원 : ");
            nameList.add(scanner.nextLine());
        }
        for (int i = 0; i < nameList.size(); i++) {
            System.out.println("팀원 : " + nameList.get(i));
        }
        System.out.println("리스트의 길이 : " + nameList.size());
    }
}
