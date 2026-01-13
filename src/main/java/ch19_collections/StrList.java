package ch19_collections;

import java.util.*;

public class StrList {
    public static void main(String[] args) {
        // 1. Array와의 차이점 # 1
        // 선언 방식
        String[] strArray = new String[5];           // 배열 선언 및 초기화
        List<String> strList = new ArrayList<>();    // List 선언 방식 및 초기화

        // Array와의 차이점 # 2 - 값을 대입하는 방법
        // 배열
        strArray[0] = "김영";
        strArray[4] = "김사";

        // List -> method 경유
        strList.add("자바");
        strList.add("파이썬");
        strList.add("자바스크립트");
        strList.add("C#");
        strList.add("C++");
        // 순서가 보장되어 있기 때문에 집어넣는 순서대로 값이 들어감.
        // 그리고 최초에 List의 방의 개수를 정하지 않음. 알아서 방이 늘어남.

        // Array와의 차이점 # 3 - 출력방식
        // strArray를 출력만 하시오.
        System.out.println(Arrays.toString(strArray));
        // List 출력
        System.out.println(strList);

        // Array와의 차이점 # 4 - 삭제방식
        strArray[0] = null;
        // 그런데 list는 생각해보면 인덱스 넘버가 고정이지도 않음
        String removeElem1 = "자바스크립트";
        boolean isRemoved = strList.remove(removeElem1);
        System.out.println(removeElem1 + " 삭제 여부 : " + isRemoved);
        System.out.println(strList);
        // 이상의 경우 차이점이 뭐냐면 Array의 경우 null 값 대입이기 때문에
        // 0번지가 null이고 여전히 5개짜리 방을 가지고 있을거임.
        // 근데 list의 경우 삭제하니까 아예 방이 4개짜리로 줄어들었음을 확인 가능

        // 정렬 방법
        // 배열은 Array.sort
        Collections.sort(strList);
        System.out.println(strList);
        // 내림차순
        Collections.sort(strList, Comparator.reverseOrder());
        System.out.println(strList);
        /*
            특정 element의 검색 (list 내의) -> .contains() 메서드 사용
            리스트명.contains(목적어)
         */
        String searchElem1 = "파이썬";
        boolean contains = strList.contains(searchElem1);
        System.out.println(searchElem1 + " 포함 여부 : " + contains);

        String searchElem2 = "파";
        boolean contains2 = strList.contains(searchElem2);
        System.out.println(searchElem2 + " 포함 여부 : " + contains2);
        /*
            이상의 이유는 list는 element가 명확하게 일치하는 지를 확인함.
            그래서 '파'는 '파이썬'이라는 String 데이터의 일부이기는 하지만
            element 전체를 의미하는 것은 아니기에 false 결과값 나옴.

            strArray에 김0 김1 김2 김3 김4로 넣으세요.
            strArray를 일반 for문으로 출력하고 그 결과가 김0님 / 김1님....김4님 /
            으로 출력
            strArray를 향상된 for문으로 작성하고 김0 학생 - 김1학생 .... 김4 학생
            으로 출력
         */

        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = "김" + i;
            System.out.print(strArray[i] + "님 / ");
        }
        System.out.println();
        for (String elem : strArray) {
            System.out.print(elem + "학생 - ");
        }
        System.out.println();

        // list는 index를 추출할 때 리스트명.size()를 씁니다. .length 아니고, method인 점 주의

        // 그러면 일반 for문으로 strList를 자바언어 / 파이썬 언어 ... 등으로 출력
        // 향상된 for문으로 자바공부 / 파이썬 공부 / ... 등으로 출력
        for (int i = 0; i < strList.size(); i++) {
            System.out.print(strList.get(i) + " 언어 / ");
        }
        System.out.println();
        for (String elem : strList) {
            System.out.print(elem + " 공부 / ");
        }
        System.out.println();
        /*
            이상의 경우 배열일 때는 구경도 못하는 향상된 for문의 장점이 있는데,
            내부의 index 지정을 .length를 쓰는지 .size()를 쓰는지 고려하지 않아도
            된다는 점과 출력할 때 []인덱스 넘버를 사용해야하는지 .get()을 사용해야하는지
            여부 등을 따지지 않아도 됨.
         */
    }
}
