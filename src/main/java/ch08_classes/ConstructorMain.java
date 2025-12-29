package ch08_classes;

public class ConstructorMain {
    public static void main(String[] args) {
        Constructor constructor1 = new Constructor();
        Constructor constructor2 = new Constructor(2);
        System.out.println(constructor2.num);
        // 아까 전에는 myCar 객체를 생성하고 그 다음에 빨강이라는 값을 color에 대입
        // 근데 잘 생각해보면 아니 만들면서 곧장 color는 빨강이라고 지정할 수 없는건가에 해당
        // Car myCar = new Car("빨강")
    }
}
