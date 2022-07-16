package a11_클래스2;

public class MugCup extends Product {
    public boolean handle;

    public MugCup(int productCode, String productName, boolean handle) {
        super(productCode, productName);
        this.handle = handle;
    }

    public void mugcupTest(){
        System.out.println("머그컵만 가지고 있는 메소드");
    }

    @Override
    public void showProduct() {
        super.showProduct();
        System.out.println("손잡이(유/무) : " + (handle ? "있음" : "없음"));
        System.out.println();
    }
}

