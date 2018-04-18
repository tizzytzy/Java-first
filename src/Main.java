import jdk.nashorn.internal.runtime.regexp.joni.exception.SyntaxException;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

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


        ArrayList<TreadMill> list = new ArrayList();

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

        list.add(treadMill1);
        list.add(treadMill2);


        System.out.println("我拥有" + list.size() + "部跑步机，它们分别是");
        for (TreadMill treadMill3 : list){

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


         Main main = new Main();
         ArrayList<Milk> list1 = new ArrayList();
         Milk milk3 = main.initMilk("金典","脱脂牛奶",true,2018,4,1);
         Milk milk4 = main.initMilk("特仑苏","全脂牛奶",false,2018,4,6);

         list1.add(milk3);
         list1.add(milk4);

         System.out.println("我拥有" + list1.size() +"包牛奶，它们是");
         System.out.println("品牌|种类|上市时间|商城是否同款");

         main.filterMilks(list1);



         Main main1 = new Main();
        ArrayList<TreadMill> list2 = new ArrayList();
        TreadMill treadMill3 = main.initTreadMill("金吉鸟", "档位跑步机", true, 2015,4,3);
        TreadMill treadMill4 = main.initTreadMill("力","吖吖跑步机",true,2016,5,3);

        list2.add(treadMill3);
        list2.add(treadMill4);

        System.out.println("我拥有" + list2.size() +"部跑步机，它们是");
        System.out.println("品牌|种类|上市时间|商城是否同款");

        for (TreadMill treadMill5 : list2) {
            if (treadMill5.isMall()) {

                System.out.println(treadMill5.getBrand() + "|" + treadMill5.getType() + "|" + treadMill5.getPublishTime());

            }

        }

        }


        public void filterMilks(ArrayList<Milk> list1){

        Calendar calendar = Calendar.getInstance();
        calendar.set(2018,4,1);
        Date compareDate = calendar.getTime();

        calendar.clear();
        calendar.set(2018,4,18);
        Date compareDate2 = calendar.getTime();

        for (Milk milk3 : list1) {

            if(milk3.getPublishTime().compareTo(compareDate)>= 0 && milk3.getPublishTime().compareTo(compareDate2)< 0){

                System.out.println(milk3.getBrand() + "|" + milk3.getKind() + "|" +  milk3.getPublishTime() +"|" + milk3.isMall());

            }

        }

        }

      public void filterTreadMills(ArrayList<TreadMill> list2){

        Calendar calendar = Calendar.getInstance();
        calendar.set(2015,6,3);
        Date compareDate = calendar.getTime();

        calendar.clear();
        calendar.set(2015,6,13);
        Date compareDate2 = calendar.getTime();

        for (TreadMill treadMill : list2){

            if(treadMill.getPublishTime().compareTo(compareDate)>= 0 && treadMill.getPublishTime().compareTo(compareDate2)<0){

                System.out.println(treadMill.getBrand() + "|" + treadMill.getType() + "|" + treadMill.getPublishTime() + "|" + treadMill.isMall());

            }

        }


    }



    /**
     * 初始化牛奶
     * @param brand 品牌
     * @param kind 种类
     * @param isMall 是否商城同款
     * @param year 年份
     * @param month 月份
     * @param day 日期
     * return
     */
    public Milk initMilk(String brand, String kind, boolean isMall, int year, int month, int day) {

        Calendar calendar1 = Calendar.getInstance();
        Milk milk3 = new Milk(brand);
        milk3.setKind(kind);
        milk3.setMall(isMall);
        calendar1.set(year, month, day);
        milk3.setPublishTime(calendar1.getTime());
        return milk3;



    }

    /**
     * 初始跑步机
     * @param brand 品牌
     * @param type 种类
     * @param isMall 是否商城同款
     * @param year 年份
     * @param month 月份
     * @param day 日期
     * return
     */

    public TreadMill initTreadMill(String brand, String type, boolean isMall, int year, int month, int day){

        Calendar calendar = Calendar.getInstance();
        TreadMill treadMill = new TreadMill(brand);
        treadMill.setType(type);
        treadMill.setMall(isMall);
        calendar.set(year,month,day);
        treadMill.setPublishTime(calendar.getTime());
        return treadMill;

    }


}

