import java.util.Calendar;

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


        Calendar calendar = Calendar.getInstance();

        Water water1 = new Water("怡宝");
        water1.setPacking("bottle");
        water1.setMall(true);
        calendar.set(2017,5,1);
        water1.setPublishTime(calendar.getTime());

        calendar.clear();

        Milk milk1 = new Milk("金典");
        milk.setKind("脱脂牛奶");
        milk.setMall(true);
        calendar.set(2018,5,1);
        milk.setPublishTime(calendar.getTime());

        calendar.clear();

         TreadMill treadMill1 = new TreadMill("金吉鸟");
         treadMill.setType("档位跑步机");
         treadMill.setMall(true);
         calendar.set(2016,5,1);
         treadMill.setPublishTime(calendar.getTime());

         calendar.clear();

         System.out.println(water1.getBrand()+":" +water1.getPublishTime());
         System.out.println(milk.getBrand()+":" +milk.getPublishTime());
         System.out.println(treadMill.getBrand()+":" +treadMill.getPublishTime());
        }
    }
