package a11_클래스2;

public class ProductTest {
    public static void test2(Product pp){
        pp.showProduct();
    }
    public static Product test() {
        Product product = new Product();
        product.showProduct();
        product.setProductCode(20220307);
        product.setProductName("모니터1");
        return product;
    }

    public static void main(String[] args) {
        Product p = test();
        System.out.println("------");
        test2(p);
        System.out.println("------");

        Tumbler tumbler = new Tumbler(2000, "스타벅스 텀블러", "오픈식");
        MugCup cup = new MugCup(3000,"스타벅스 머그컵",true);

        tumbler.showProduct();
        cup.showProduct();

        Product[] products = new Product[2];
        products[0] = tumbler;
        products[1] = cup;

        for(int i = 0; i < products.length; i++) {
            products[i].showProduct();
            if(products[i] instanceof Tumbler) {
                Tumbler tumbler2 = (Tumbler) products[i];   //다운캐스팅은 업캐스팅이 된 상황에서 된다.
                tumbler2.TumblerTest();
            } else {
                MugCup cup2 = (MugCup) products[i];
                cup2.mugcupTest();
            }
        }
    }
}
