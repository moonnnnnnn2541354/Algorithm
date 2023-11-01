import java.util.HashMap;
import java.util.Scanner;

public class Quiz_8 {
    public static void main(String[] args) {
        // HashMap

        // 선언 : Map<Key,Value> hashmap = new HashMap<>();

        // 추가 : hashmap.put(0);

        // Value값 읽기 : hashmap.get(Key값);
        // 전체읽기는 foreach 문으로
        // for (String key : hashmap.keySet()) {
        //    hashmap.get(key);
        // }

        // 전체삭제 : hashmap.clear();
        // HashMap 이 비었는지 안비었는지 : hashmap.isEmpty();

        // 주의사항
        // 키워드는 Key
        // Key값은 중복해서 저장할수 없음 덮어씌워짐
        // hashmap.keySet() : Key값 지정
        // heahmap.getOrDefault(key값,value값) : key값이 null이 나오면 다르게 처리
        

        HashMap<Integer,Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Map을 활용해서 숫자 5개를 입력 받아 최빈값 구하기");
        System.out.println("최빈값이 2개이상 이라면 -1 을 출력");

        // 1) HashMap을 활용해서 숫자 5개를 입력 받아 최빈값 구하기
        int key = 0;
        for (int i = 0; i < 5; i++) {
            key = scanner.nextInt();
            map.put(key, // k : key
                    map.getOrDefault(key,0) // v : (key가 있으면)v or (key가 없으면)0
                    +1); // v에 +1 (v++)
        }

        // 2) 최빈값출력 ** 최빈값이 2개이상 이라면 -1을 출력
        int result = 0;
        int max = 0;
        for (int keyNum : map.keySet()) {
            // hashmap 체크
            System.out.print("k : " + keyNum + " = ");
            System.out.println("v : " + map.get(keyNum));

            if (max < map.get(keyNum)){ // 최빈값의 value 찾기
                max = map.get(keyNum);
                result = keyNum;
            } else if (max == map.get(keyNum)) { // 최빈값의 value가 여러개면 -1
                result = -1;
            }
        }
        System.out.println("최빈값 : " + result);
    }
}
