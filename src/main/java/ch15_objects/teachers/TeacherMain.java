package ch15_objects.teachers;

import ch15_objects.Teacher;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TeacherMain {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("안근수", "코리아아이티");
        Teacher teacher2 = new Teacher("안근수", "코리아아이티");
        System.out.println(teacher1);
        System.out.println(teacher2);

        boolean result1 = teacher1.equals(teacher2);
        System.out.println(result1);        // false 현재는.
        // 재정의하고 난 후 true

        /*
            이상의 코드에서 중요한 점은 재정의 전과 후가 결과값이 다르다는 겁니다.
            Teacher에서 .equals()를 재정의하기 전에는 false가 나왔음
            그때는 teacher1과 teacher2의 주소지까지 확인하여 같은지 아닌지의 여부를 확인했다면
            재정의 이후에는 field에 입력한 데이터가 동일한지만을 체크
         */
        Class tClass = teacher1.getClass();
        System.out.println(tClass);     // class ch15_objects.teachers.Teacher
        System.out.println(tClass.getSimpleName());     // Teacher
        System.out.println(tClass.getClass().getSimpleName());      // Class
        // 여러분들은 어느 수준까지는 그냥 작성할지, 아니면 너무 기니까 어느 부분은 잘라서
        // 변수에 대입할지 자체 성향 / 조직 성향에 따라 결정

        Field[] fields = tClass.getDeclaredFields();
        // 배열, 이러면
        System.out.println(fields);     // 주소값만
        // 두 가지 방법으로 field를 확인
        // 1. 반복문 사용 / 2. Arrays를 사용하는 방법
        for (int i = 0; i < fields.length; i++) {
            System.out.println("필드명 : " + fields[i].getName());
            System.out.println("패키지 : " + fields[i].getType());
            System.out.println("클래스 : " + fields[i].getType().getSimpleName());
        }
        System.out.println(Arrays.toString(fields));

        Method[] methods = tClass.getDeclaredMethods();
        System.out.println(Arrays.toString(methods));
        for (Method method : methods) {
            System.out.println("메서드 : " + method.getName());
            System.out.println("리턴 타입 : " + method.getReturnType());
        }
        // 새로운 객체 만들겠습니다.
        ch15_objects.Teacher teacher3 = new ch15_objects.Teacher("안근수", "코리아아이티");

        boolean result2 = teacher1.equals(teacher3);
        System.out.println(result2);    // 결과값 : false

        /*
            teacher3의 자료형은 ch15_objects.Teacher이지
            ch15_obejcts.teachers.Teacher가 아니기 때문에 내부에 동일한 값이 들어가 있다고 하더라도
            false라는 결과값을 가지게 됩니다.


            ch16_bean 패키지 생성 -> UserEntity / UserEntityMain
         */
    }
}
