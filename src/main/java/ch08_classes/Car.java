package ch08_classes;

public class Car {
    // 필드 선언
    String color;
    int speed;
    // 메서드 정의
    public void drive() {
        System.out.println(color + "자동차가 " + "주행중입니다.");
    }
    public void brake() {
        System.out.println(color + "자동차가 " + "멈췄습니다.");
    }
    public void displayInfo() {
        System.out.println("이 차의 색상은 " + color + "색이고.");
        System.out.println("최고 속도는 " + speed + "km/h입니다");
    }
    /*
        car의 인스턴스인 myCar라는 객체를 생성하시오.
        color는 빨강, speed는 160을 대입
        yourCar에 노랑, 180을 대입
        myCar는 drive() 메서드를 호출
        yourCar는 brake() 메서드를 호출
        myCar. yourCar에 각각 displayInfo() 메서드를 호출하시오.
     */
}
