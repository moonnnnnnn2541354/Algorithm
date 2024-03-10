package level_1;

public class Password {
    public String solution(String s, String skip, int index) {
        StringBuilder sbS = new StringBuilder(s);
        StringBuilder sbSkip = new StringBuilder(skip);
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < sbS.length(); i++) {
            char c = sbS.charAt(i);
            for (int j = 0; j < index; j++) {
                c++;
                if (c > 122) {
                    c -= 26;
                }
                for (int k = 0; k < sbSkip.length(); k++) {
                    if (c == sbSkip.charAt(k)) {
                        c++;
                    }
                    if (c > 122) {
                        c -= 26;
                    }

                }
            }
            answer.append(c);
        }
        return answer.toString();
    }


        public static void main (String[]args){
            String s = "klmnopqrstuvzyx";
            String skip = "abcdefghij";
            int index = 20;
            // 정답 happy
            // a = 97


            StringBuilder sbS = new StringBuilder(s);
            StringBuilder sbSkip = new StringBuilder(skip);
            StringBuilder answer = new StringBuilder();

            for (int i = 0; i < sbS.length(); i++) {
                char c = sbS.charAt(i);
                for (int j = 0; j < index; j++) {
                    c++;
                    if (c > 122) {
                        c -= 26;
                    }
                    for (int k = 0; k < sbSkip.length(); k++) {
                        if (c == sbSkip.charAt(k)) {
                            c++;
                        }
                        if (c > 122) {
                            c -= 26;
                        }

                    }
                }
                answer.append(c);
            }

            System.out.println(answer);


        }
    }
