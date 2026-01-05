package ch11_arrays;
/*
    이하의 score 배열의 값을 탐색하여
    90 이상은 A
    80 이상은 B
    70 이상은 C
    60 이상은 D
    59 이하는 F,

    실행 예)
    A 등급 몇 명
    B 등급 몇 명
    C 등급 몇 명
    ...
    F 등급 몇 명
 */
public class Array07 {
    public static void main(String[] args) {
//        int[] scores = {100, 97, 83, 85, 77, 76, 64, 64, 58, 59, 92, 100};
//        String s;
//        for (int i = 0; i < scores.length; i++) {
//            if (scores[i] > 89) {
//                s = "A";
//            } else if (scores[i] > 79){
//                s = "B";
//            } else if (scores[i] > 69) {
//                s = "C";
//            } else if (scores[i] > 59) {
//                s = "D";
//            } else {
//                s = "F";
//            }
//            if (s == "A") {
//                System.out.println("A등급");
//            } else if (s == "B") {
//                System.out.println("B등급");
//            } else if (s == "C") {
//                System.out.println("C등급");
//            } else if (s == "D") {
//                System.out.println("D등급");
//            } else {
//                System.out.println("F등급");
//            }
//        }
        int[] scores = {100, 97, 83, 85, 77, 76, 64, 64, 58, 59, 92, 100};
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int f = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 0 || scores [i] > 100) break;
            else {
                if (scores[i] > 89) a++;
                else if (scores[i] > 79) b++;
                else if (scores[i] > 69) c++;
                else if (scores[i] > 59) d++;
                else f++;
            }
        }
        System.out.println("A 등급 : " + a + "명");
        System.out.println("B 등급 : " + b + "명");
        System.out.println("C 등급 : " + c + "명");
        System.out.println("D 등급 : " + d + "명");
        System.out.println("F 등급 : " + f + "명");


        // 풀이법 # 2
        int[] grades = {0, 0, 0, 0, 0};
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 0 || scores [i] > 100) break;
            else {
                if (scores[i] > 89) grades[0]++;
                else if (scores[i] > 79) grades[1]++;
                else if (scores[i] > 69) grades[2]++;
                else if (scores[i] > 59) grades[3]++;
                else grades[4]++;           // [i]가 아니라 [0]으로 하드코딩해야 합니다.
            }
        }
        System.out.println();
        System.out.println("A 등급 : " + grades[0] + "명");
        System.out.println("B 등급 : " + grades[1] + "명");
        System.out.println("C 등급 : " + grades[2] + "명");
        System.out.println("D 등급 : " + grades[3] + "명");
        System.out.println("F 등급 : " + grades[4] + "명");
    }
}

