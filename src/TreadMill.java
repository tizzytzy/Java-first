import java.util.Date;

/**
 *  跑步机对象
 */

public class TreadMill {

    /* 品牌 */
    private String brand;
    // 种类
    private String kind;
    // 类型
    private String type;
    // 心率测试
    private String heartFitness;
    // 产地
    private String locality;
    // 驱动方式
    private String driveMode;
    // 跑道宽度
    private int width;
    // 上架时间
    private Date publishTime;

    // 是否商城同款
    private boolean isMall;

    public TreadMill(){

    }

    public TreadMill(String brand){

        this.brand = brand;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHeartFitness() {
        return heartFitness;
    }

    public void setHeartFitness(String heartFitness) {
        this.heartFitness = heartFitness;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getDriveMode() {
        return driveMode;
    }

    public void setDriveMode(String driveMode) {
        this.driveMode = driveMode;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }
    public boolean isMall() {
        return isMall;
    }

    public void setMall(boolean mall) {
        isMall = mall;
    }
}
