package seveninch.tablet.pos;

/**
 * Created by geniushkg on 1/4/2016.
 */
public class Item {
    String desc,color;
    Integer c;

    public Item (String desc , Integer c){
    super();
        this.desc = desc ;
        this.c = c;
    }
    public Item (String desc , String color){
        super();
        this.desc = desc;
        this.color = color;
    }
    public Item (String desc , String color , Integer c){
        super();
        this.desc = desc;
        this.color = color;
        this.c = c;
    }

    public Integer getC() {
        return c;
    }

    public void setC(Integer c) {
        this.c = c;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
