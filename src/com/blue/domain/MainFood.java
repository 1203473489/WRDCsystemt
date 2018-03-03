

package com.blue.domain;


/**
 * 名称：主食表 <br>
 * 功能：对类的功能进行说明 <br/>
 * <br/>
 * 
 * @since JDK 1.7
 * @see
 * @author Administrator
 */
public class MainFood {
    private int    food_id;
    private String food_name;
    private String img_path;  // 图片路径
    private String price;     // 价格
    private String deleteflag;// 删除标记


    /**
     * 构造方法： MainFood.
     *
     */
    public MainFood() {

    }

    /**
     * 构造方法： MainFood.
     *
     * @param food_id
     * @param food_name
     * @param img_path
     * @param price
     * @param deleteflag
     */
    public MainFood(int food_id, String food_name, String img_path, String price,
        String deleteflag) {
        this.food_id = food_id;
        this.food_name = food_name;
        this.img_path = img_path;
        this.price = price;
        this.deleteflag = deleteflag;
    }

    /** @return 返回 food_id. */
    public int getFood_id() {
        return food_id;
    }

    /**
     * @param food_id
     *            设置 food_id .
     */
    public void setFood_id(int food_id) {
        this.food_id = food_id;
    }

    /** @return 返回 food_name. */
    public String getFood_name() {
        return food_name;
    }

    /**
     * @param food_name
     *            设置 food_name .
     */
    public void setFood_name(String food_name) {
        this.food_name = food_name;
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
