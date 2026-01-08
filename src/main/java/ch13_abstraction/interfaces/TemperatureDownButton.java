package ch13_abstraction.interfaces;

public class TemperatureDownButton extends Button {
    @Override
    public void OnPressed() {
        System.out.println("온도를 한 칸 내립니다.");
    }

    @Override
    public void onDown() {
        System.out.println("온도를 계속 내립니다.");
    }
}
