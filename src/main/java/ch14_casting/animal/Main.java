package ch14_casting.animal;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.makeSound();           // 개가 짖습니다.
        dog1.fetch();               // 강아지가 공을 물어옵니다.

        // 업캐스팅 #1
        Animal animal1 = dog1;
        animal1.makeSound();        // 개가 짖습니다. 즉, 재정의된 method가 호출됐습니다.
        // animal1.fetch();         // 이게 불가능

        // 업캐스팅 #2
        Animal animal2 = new Dog(); // 이게 어제 말한 A a = new B(); 형태입니다. 시험에 자주 나옴.
        animal2.makeSound();
        // animal2.fetch();         // 불가능
        /*
            클래스A 객체명 = new 클래스B();를 통해 객체를 생성했을 경우
            1. Override가 적용된 메서드, 즉 자식 클래스의 메서드가 호출됨 (클래스B의 메서드라는 의미)
            2. 클래스B(자식 클래스)의 고유 메서드는 호출 불가능

            그럼 재정의된 method 버전으로 호출이 될거라면 애초에
            클래스B 객체명 = new 클래스B();로 생성해버리면 재정의된 method도 호출되고 고유 method도 호출할 수 있으니까
            골치 안아픈거 아니냐는 결론이 나올 수 있습니다.
         */
        Animal animal0 = new Cat();
        animal0.makeSound();
        animal1.makeSound();

        // 연산자 instanceof 사용 사례
        boolean result1 = animal1 instanceof Animal;
        System.out.println(result1);                // true
        boolean result2 = animal1 instanceof Dog;
        System.out.println(result2);                // true

        // : 업캐스팅이 이루어지지 않고 그냥 Dog dog1 = new Dog();로 B b = new B(); 단 B는 A의 자식 클래스인 경우
        boolean result3 = dog1 instanceof Animal;
        System.out.println(result3);                // true
        boolean result4 = animal2 instanceof Dog;
        System.out.println(result4);                // true

        Animal animal3 = new Animal();
        boolean result5 = animal3 instanceof Animal;
        System.out.println(result5);                // true
        boolean result6 = animal3 instanceof Dog;
        System.out.println(result6);                // false

        System.out.println("이상의 코드 업캐스팅 파트 : 객체명.메서드명(); 을 했을때 자기 버전이 나오는지 재정의 버전이 나오는지 주목");
        System.out.println("이하의 코드 다운캐스팅 파트");
        /*
            다운캐스팅은 명시적으로 이루어져야 합니다.
            방법
            (클래스명) 객체명; -> (int)1.23; 과 같은 방식입니다.
            conversion의 객체 버전이라고 생각할 수 있습니다.
            그래서 기본 자료형의 형변환에서 벗어나서 참조 자료형까지 고려하셔야 합니다.
         */

        // 다운 캐스팅 방법
        Dog dog2 = (Dog) animal2;
        // 저 위에 보시면 Animal animal = new Dog();로 생성했기 때문에 animal2의 Dog 버전 객체명이 아예 없습니다.
        // 근데 이번에 다운캐스팅하면서 dog2라고 하는 객체명을 지어줬다고 할 수 있겠습니다.
        animal2.makeSound();
        dog2.makeSound();
        dog2.fetch();
        /*
            dog2로 새로운 객체명을 선언하고 거기에 명시적 참조자료형 캐스팅을 적용하여 Animal 클래스의
            인스턴스인 animal2를 Dog 자료형으로 downcasting 했습니다.
            근데 여기서 중요한 점은 다운캐스팅을 했다고 해서 animal2가 사라지는 것은 아닙니다.
            dog2와 animal2가 별개로 움직인다고 봐야합니다.
            dog2로 메서드를 호출할 경우 당연히 재정의된 makeSound()가 출력되며,
            고유 메서드인 fetch() 역시 호출이 가능합니다.

            그러면 Dog dog0 = new Dog();로 만들면 애초에 재정의된 메서드 및 고유 메서드를 사용할 수 있다는 점이 문제가 됩니다.
         */
        // 아까 animal animal3 = new Animal();로 생성했었습니다.
        // Dog dog3 = (Dog) animal3;        // 이부분 오류
        // dog3.makeSound();
        /*
            이상의 경우를 확인했을 때 dog3.makeSound();로 가기 전에 이미 downcasting 부분에서 (77번 라인) 오류가 발생했음을
            확인할 수 있음
            즉 애초에 animal3를 생성할 때 Animal 클래스의 생성자를 호출해서 만들었기 때문에
            (A a = new A(); 이기 때문에)
            하위 클래스의 인스턴스로 다운캐스팅하는 것이 불가능
         */
        Animal animal4 = new Dog();
        // 와 같은 방식으로 선언된 클래스와 호출되는 생성자가 서로 달아야 함 (그리고 둘은 상속관계여야 함)

        // 근데 문제는 77번 라인에서 빨간 줄 미리 띄워서 오류가 발생할 예정이라고 우리에게 알려주지 않음
        // 그래서 이를 해결하기 위한 것이 instanceof 연산자임

        System.out.println("animal4 검증");

        if(animal4 instanceof Dog) {    // 이 조건식이 true라면 animal4의 생성 시 호출된 생성자는 Dog();라는 의미
            animal4.makeSound();        // 그러므로 animal4.makeSound()를 호출했을 때의 결과값은 개가 짖습니다.
            // 근데 fetch도 호출하고 싶다면
            Dog dog4 = (Dog) animal4;   // 그래서 다운캐스팅
            dog4.fetch();
        } else if (animal4 instanceof Cat) {
            Cat cat0 = (Cat) animal4;
            cat0.makeSound();
            cat0.udadada();
        }
    }
}
