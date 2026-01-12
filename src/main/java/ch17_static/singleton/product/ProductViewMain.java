package ch17_static.singleton.product;

public class ProductViewMain {
    public static void main(String[] args) {
        // 정적 메서드인 getInstance()를 호출
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();

        // 생성자가 private이기 때문에 이하의 코드는 불가능
        // ProductView productView1 = new ProductView();
        System.out.println(ProductView.count);
        System.out.println(ProductView.getInstance().toString());

        /*
            이상의 코드에서 다양하게 검증했을 때 알 수 있는 점은 다음과 같음
            getInstance() 메서드는 생성자를 호출하는 method이기 때문에 기본적으로는 호출 횟수만큼 객체가 생성되어야 함.
            하지만 내부에 조건문을 통해 하나의 객체라도 생성되었다면 해당 객체를 return하게끔 작성되어있기 때문에
            결과적으로 생성자가 호출되는 횟수는 1로 고정.
         */
    }
}
