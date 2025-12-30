package ch08_classes.products;

public class ProductMain {
    public static void main(String[] args) {
        Product product1 = new Product();
        //필드에 값 대입하는 거죠.
        product1.productNum = 123456;
        product1.productName = "LG엘패드";

        Product product2 = new Product(987654);
        product2.productName = "다이소충전기";

        product1.showInfo();
        product2.showInfo();

        Product product3 = new Product("USB-C 케이블");
        product3.productNum = 159357;

        Product product4 = new Product(951753, "GFlip6");
        product3.showInfo();
        product4.showInfo();
    }
}