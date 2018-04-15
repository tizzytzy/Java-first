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
        milk1.setKind("脱脂牛奶");
        milk1.setMall(true);
        calendar.set(2017,5,1);
        milk1.setPublishTime(calendar.getTime());

        calendar.clear();

         TreadMill treadMill1 = new TreadMill("金吉鸟");
         treadMill1.setType("档位跑步机");
         treadMill1.setMall(true);
         calendar.set(2018,5,1);
         treadMill1.setPublishTime(calendar.getTime());

         calendar.clear();

         System.out.println(water1.getBrand()+":" +water1.getPublishTime());
         System.out.println(milk1.getBrand()+":" +milk1.getPublishTime());
         System.out.println(treadMill1.getBrand()+":" +treadMill1.getPublishTime());
        }
    }
