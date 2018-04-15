public class Main {

    public static void main(String[] args) {
        Water water = new Water();
        water.setBrand("百岁山");
        System.out.println(water.getBrand());

        Milk milk = new Milk();
        milk.setLocality("南京");
        System.out.println(milk.getLocality());


        TreadMill treadMill = new TreadMill();
        treadMill.setBrand("金吉鸟");
        System.out.println(treadMill.getBrand());

        }
    }
