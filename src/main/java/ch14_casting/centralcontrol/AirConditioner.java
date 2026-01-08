package ch14_casting.centralcontrol;

public class AirConditioner implements Power {
    @Override
    public void on() {
        System.out.println("AirConditioner를 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("AirConditioner를 끕니다.");
    }

    // 고유 메서드 정의
    public void changeMode() {
        System.out.println("에어컨의 모드를 바꿉니다.");
    }
}
