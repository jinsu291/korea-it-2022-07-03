package a11_클래스_정보은닉;

public class CarTest {
    public static void main(String[] args) {
        Car c = new Car();
        c.setModel("k5");

        String companyAndModel = "KIA자동차" + c.getModel() + "차량";

        System.out.println(companyAndModel);
    }
}