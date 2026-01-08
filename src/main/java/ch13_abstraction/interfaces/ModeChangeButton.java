package ch13_abstraction.interfaces;

public class ModeChangeButton extends Button {
    private boolean change;

    @Override
    public void OnPressed() {
        if (change) {
            change = false;
            System.out.println("냉방으로 바뀝니다.");
        } else {
            change = !change;
            System.out.println("난방으로 바뀝니다.");
        }
    }
}
