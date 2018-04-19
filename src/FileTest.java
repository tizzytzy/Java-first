import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class FileTest {

    public static void main(String[] args) {


        ArrayList<TreadMill> treadMills = new ArrayList();
        File file = new File("D:\\homework\\treadMills.txt");

            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

                String tempString = null;
                while ((tempString = bufferedReader.readLine()) != null) {

                    String[] strs = tempString.split("\\|");
                    TreadMill treadMill = new TreadMill(strs[0]);
                    treadMill.setType(strs[1]);
                    System.out.println(treadMill.getBrand() + "|" + treadMill.getType());
                    String trueStr = "是";
                    boolean isMall = false;
                    if (strs[2].equals(trueStr)) {

                        isMall = true;

                    } else {

                        isMall = false;
                    }
                    treadMill.setMall(isMall);
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-mm-dd");
                    try {
                        Date date = simpleDateFormat.parse(strs[3]);
                        treadMill.setPublishTime(date);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    treadMills.add(treadMill);
                }

                bufferedReader.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            FileTest fileTest = new FileTest();
            fileTest.filterTreadMills(treadMills);

        }

        public void filterTreadMills(ArrayList<TreadMill> list){

            Calendar calendar = Calendar.getInstance();
            calendar.set(2015,4,1);
            Date compareDate = calendar.getTime();

            calendar.clear();

            calendar.set(2016,7,1);
            Date compareDate2 = calendar.getTime();

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-mm-dd");

            File treadMillsFilterFile = new File("D:\\homework\\treadMills-filter.txt");
            if(!treadMillsFilterFile.exists()){

                try{

                    treadMillsFilterFile.createNewFile();

                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

            BufferedWriter out = null;
            try{

                out = new BufferedWriter(new FileWriter(treadMillsFilterFile));

            } catch (IOException e) {
                e.printStackTrace();
            }

            for(TreadMill treadMill : list){

                if(treadMill.getPublishTime().compareTo(compareDate) >= 0 && treadMill.getPublishTime().compareTo(compareDate2) < 0){

                    String isMall = null;
                    if (treadMill.isMall()){

                        isMall = "是";

                        }else {

                        isMall = "否";
                    }

                    String content = treadMill.getBrand() + "|" + treadMill.getType() + "|" + simpleDateFormat.format(treadMill.getPublishTime()) + "|" + isMall;

                    try {

                        out.write(content + "\n");
                    }catch (IOException e){

                        e.printStackTrace();
                    }
                    System.out.println(content);
                }

            }

            try {
                out.flush();
                out.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        }
