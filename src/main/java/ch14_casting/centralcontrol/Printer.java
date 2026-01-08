package ch14_casting.centralcontrol;

public class Printer implements Power{
    @Override
    public void on() {
        System.out.println("Printer를 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("Printer를 끕니다.");
    }
    public void printing() {
        System.out.println("프린터가 인쇄를 합니다.");
    }
}
