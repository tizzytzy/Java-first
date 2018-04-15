import java.util.Date;

/**
 *  牛奶对象
 */

public class Milk {

    /* 品牌 */
    private String brand;
    // 种类
    private String kind;
    // 产地
    private String locality;
    // 包装方式
    private String packing;
    // 制品
    private String product;
    // 容量
    private int capacity;
    // 使用人群
    private String crowd;
    // 上架时间
    private Date publishTime;


    // 是否商城同款
    private boolean isMall;

    public Milk(){


    }
    public Milk(String brand) {

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

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getPacking() {
        return packing;
    }

    public void setPacking(String packing) {
        this.packing = packing;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getCrowd() {
        return crowd;
    }

    public void setCrowd(String crowd) {
        this.crowd = crowd;
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
