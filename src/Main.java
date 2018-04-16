import jdk.nashorn.internal.runtime.regexp.joni.exception.SyntaxException;

import java.util.ArrayList;
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


        Milk[] milks = new Milk[2];

        Milk milk1 = new Milk("金典");
        milk1.setKind("脱脂牛奶");
        milk1.setMall(true);
        calendar.set(2017,5,1);
        milk1.setPublishTime(calendar.getTime());

        milks[0] = milk1;

        calendar.clear();

        Milk milk2 = new Milk("特仑苏");
        milk2.setKind("脱脂牛奶");
        milk2.setMall(true);
        calendar.set(2017,5,1);
        milk2.setPublishTime(calendar.getTime());

        milks[1] = milk2;

        calendar.clear();


        System.out.println("我拥有" +milks.length +"袋牛奶，它们分别是");


        for(Milk milk3 : milks){

            System.out.println(milk3.getBrand() +":" + milk3.getPublishTime());


        }


        ArrayList<TreadMill> List = new ArrayList();

         TreadMill treadMill1 = new TreadMill("金吉鸟");
         treadMill1.setType("档位跑步机");
         treadMill1.setMall(true);
         calendar.set(2018,5,1);
         treadMill1.setPublishTime(calendar.getTime());

         calendar.clear();


        TreadMill treadMill2 = new TreadMill("力");
        treadMill2.setType("档位跑步机");
        treadMill2.setMall(true);
        calendar.set(2018,3,1);
        treadMill2.setPublishTime(calendar.getTime());

        calendar.clear();

        List.add(treadMill1);
        List.add(treadMill2);


        System.out.println("我拥有" + List.size() + "部跑步机，它们分别是");
        for (TreadMill treadMill3 : List){

            System.out.println(treadMill3.getBrand()+":" +treadMill3.getPublishTime());

        }



         Apple apple = new Apple("红富士");
         apple.setColor("红");
         apple.setLocality("湖南");
         apple.setSize("六两");
         calendar.set(2018,5,2);
         apple.setMall(true);
         apple.setPublishTime(calendar.getTime());

         calendar.clear();


         System.out.println(water1.getBrand()+":" +water1.getPublishTime());
         System.out.println(milk1.getBrand()+":" +milk1.getPublishTime());
         System.out.println(treadMill1.getBrand()+":" +treadMill1.getPublishTime());
         System.out.println(apple.getBrand()+":" +apple.getPublishTime());
        }
    }
