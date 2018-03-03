/**
 * 中国邮政新一代寄递平台
 *
 * 子系统名: 模 块 名: 文件名称: Dishes.java 创建日期: 2018年2月28日下午9:57:09 创 建 人: Administrator 版权所有: 2018 中国邮政集团公司
 * 保留所有权利
 */

package com.blue.domain;


/**
 * 名称：菜品 <br>
 * 功能：对类的功能进行说明 <br/>
 * <br/>
 * 
 * @since JDK 1.7
 * @see
 * @author Administrator
 */
public class Dishes {
    private int    disher_id;
    private String dash_name;   // 菜名
    private String img_path;    // 图片路径
    private String dish_stutas; // 1-热菜；2-凉菜；3-特色菜
    private String dishvariety; // 口味
    private String deleteflag;  // 删除标记

    /**
     * 构造方法： Dishes.
     *
     */
    public Dishes() {
        super();
        // TODO Auto-generated constructor stub
    }


    /**
     * 构造方法： Dishes.
     *
     * @param disher_id
     * @param dash_name
     * @param img_path
     * @param dish_stutas
     * @param dishvariety
     * @param deleteflag
     */
    public Dishes(int disher_id, String dash_name, String img_path, String dish_stutas,
        String dishvariety, String deleteflag) {
        super();
        this.disher_id = disher_id;
        this.dash_name = dash_name;
        this.img_path = img_path;
        this.dish_stutas = dish_stutas;
        this.dishvariety = dishvariety;
        this.deleteflag = deleteflag;
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


    /** @return 返回 disher_id. */
    public int getDisher_id() {
        return disher_id;
    }

    /**
     * @param disher_id
     *            设置 disher_id .
     */
    public void setDisher_id(int disher_id) {
        this.disher_id = disher_id;
    }

    /** @return 返回 dash_name. */
    public String getDash_name() {
        return dash_name;
    }

    /**
     * @param dash_name
     *            设置 dash_name .
     */
    public void setDash_name(String dash_name) {
        this.dash_name = dash_name;
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

    /** @return 返回 dish_stutas. */
    public String getDish_stutas() {
        return dish_stutas;
    }

    /**
     * @param dish_stutas
     *            设置 dish_stutas .
     */
    public void setDish_stutas(String dish_stutas) {
        this.dish_stutas = dish_stutas;
    }

    /** @return 返回 dishvariety. */
    public String getDishvariety() {
        return dishvariety;
    }

    /**
     * @param dishvariety
     *            设置 dishvariety .
     */
    public void setDishvariety(String dishvariety) {
        this.dishvariety = dishvariety;
    }

}
