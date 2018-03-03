
package com.blue.domain;


/**
 * 名称：饮品 <br>
 * 功能：对类的功能进行说明 <br/>
 * <br/>
 * 
 * @since JDK 1.7
 * @see
 * @author Administrator
 */
public class Drink {
    private int    drink_id;
    private String drink_name;
    private String drink_type;// 1-热饮；0-常温；-1 -冷饮；
    private String img_path;  // 图片路径
    private String price;     // 价格
    private String deleteflag;// 删除标记

    /**
     * 构造方法： Drink.
     *
     */
    public Drink() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * 构造方法： Drink.
     *
     * @param drink_id
     * @param drink_name
     * @param drink_type
     * @param img_path
     * @param price
     * @param deleteflag
     */
    public Drink(int drink_id, String drink_name, String drink_type, String img_path, String price,
        String deleteflag) {
        super();
        this.drink_id = drink_id;
        this.drink_name = drink_name;
        this.drink_type = drink_type;
        this.img_path = img_path;
        this.price = price;
        this.deleteflag = deleteflag;
    }

    /** @return 返回 drink_id. */
    public int getDrink_id() {
        return drink_id;
    }

    /**
     * @param drink_id
     *            设置 drink_id .
     */
    public void setDrink_id(int drink_id) {
        this.drink_id = drink_id;
    }

    /** @return 返回 drink_name. */
    public String getDrink_name() {
        return drink_name;
    }

    /**
     * @param drink_name
     *            设置 drink_name .
     */
    public void setDrink_name(String drink_name) {
        this.drink_name = drink_name;
    }

    /** @return 返回 drink_type. */
    public String getDrink_type() {
        return drink_type;
    }

    /**
     * @param drink_type
     *            设置 drink_type .
     */
    public void setDrink_type(String drink_type) {
        this.drink_type = drink_type;
    }

    /** @return 返回 img_path. */
    public String getImg_path() {
        return img_path;
    }

    /**
     * @param img_path
     *            设置 img_path .
     */
    public void setImg_path(String img_path) {
        this.img_path = img_path;
    }

    /** @return 返回 price. */
    public String getPrice() {
        return price;
    }

    /**
     * @param price
     *            设置 price .
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /** @return 返回 deleteflag. */
    public String getDeleteflag() {
        return deleteflag;
    }

    /**
     * @param deleteflag
     *            设置 deleteflag .
     */
    public void setDeleteflag(String deleteflag) {
        this.deleteflag = deleteflag;
    }

}
