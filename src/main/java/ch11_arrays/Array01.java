package ch11_arrays;

public class Array01 {
    public static void main(String[] args) {
        // 배열 선언 및 초기화
        int[] arr01 = {1, 2, 3, 4, 5};

        // 이하의 코드를 실행해봤을 때, 배열 내부의 값을 확인할 수 없습니다.
        // @를 고려했을 때 주소지만 출력됩니다.
        /*
            현재 배열 내부에 다수의 데이터가 있기 때문에 콘솔창에서 전체 확인이 불가능합니다.
            즉, element를 확인하기 위해서는 배열 내부로 직접 탐색하는 과정이 필요합니다.
            이때 필요한 개념이 index(주소지라고도 할겁니다) 입니다.
         */
        System.out.println(arr01);          // 주소값만 출력
        System.out.println(arr01[0]);          // 주소값만 출력
        System.out.println(arr01[1]);          // 배열명[index]의 형태로 내부 element 확인 가능
        System.out.println(arr01[2]);
        System.out.println(arr01[3]);
        System.out.println(arr01[4]);          // 주소값만 출력

        // for문을 통해서 arr01에 있는 내부 요소를 콘솔에 출력하시오.
        // 그런데 실행 예
        // 1 2 3 4 5
        // 로 출력하세요.
        for (int i = 0; i < 5; i++) {
            System.out.print(arr01[i] + " ");
        }
        // 이상의 코드에서 한계값 부분에 주목해서 본다면, 우리가 배열의 element 개수를
        // 알고 있을 때만 작성이 가능하다는 점을 알 수 있습니다.

        int[] arr02 = {1, 2, 314, 213, 142, 5, 323, 123, 555, 23, 1246, 2134};
        // 직접 한계값을 하드코딩해서 집어 넣기가 번거러워짐
        // PC에게 직접 한계값을 구해서 알아서 출력하도록 명령을 내릴 필요가 있다.
        System.out.println();
        // 배열명.lenght;
        for (int i = 0; i < arr02.length; i++) {
            System.out.print(arr02[i] + " / ");
        }
        /*
            빈 배열 생성
            자료형1[] 배열명 = new 자료형1 [개수];
            얘가 다른 언어에 비해서 골치 아픈게, 미리 방의 개수를 지정해줘야 합니다.

            이상의 사항을 종합했을 때,
            배열 내부의 방의 개수 / 주소지의 한계값 - 1을 우리가 항상 알고 있는 것은 아니기 때문에
            element 값을 출력하기 위한 한계값을 설정할 때
            배열명.length를 생활화하는 것이 좋습니다.
         */
        System.out.println();
        int[] arr03 = new int[10];      // 10개짜리 방을 가진 비어있는 배열을 생성합니다.
        System.out.println(arr03[0]);   // int로 선언했기 때문에 초기화하지 않으면 0

        // 배열의 특정 index에 값을 대입하는 방법
        arr03[0] = 10;                  // 그러면 이 친구를 초기화? 재대입?
        // 정답 : 의미없음. / 다만 중요한 것은 처음 값을 대입하는 데도 int arr03[0] = 10; 이
        // 아니라는 점입니다.
        // 즉 배열을 선언한다는 것은 내부의 index 넘버를 포함하여 컴퓨터가 알아서 선언 작업을
        // 마친다는 점입니다.

        // 그렇다면 arr03[0]과 같은 부분은 그냥 int 변수를 선언하고 거기에 값을 대입하거라고
        // 생각할 수 있겠네요.
        System.out.println(arr03[0]);

        int[] arr04 = new int[40];
        // 이상의 빈 배열에 41부터 80까지의 값을 순서대로 대입하고,
        // 41 / 42 / 43 / ... / 79 / 80 으로 출력될 수 있도록 코드를 작성하시오.
        for (int i = 0; i < arr04.length; i++) {
            arr04[i] = i + 41;
            System.out.print(arr04[i] + " / ");
        }
        System.out.println();
        String[] arr05 = {"안", "녕", "하", "세", "요"};
        for (int i = 0; i < arr05.length; i++) {
            System.out.print(arr05[i]);
        }
    }
}