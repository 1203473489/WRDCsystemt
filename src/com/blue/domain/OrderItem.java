/**
 * 中国邮政新一代寄递平台
 *
 * 子系统名: 模 块 名: 文件名称: OrderItem.java 创建日期: 2018年2月28日下午9:58:24 创 建 人: Administrator 版权所有: 2018
 * 中国邮政集团公司 保留所有权利
 */

package com.blue.domain;


/**
 * 名称：订单详细 <br>
 * 功能：对类的功能进行说明 <br/>
 * <br/>
 * 
 * @since JDK 1.7
 * @see
 * @author Administrator
 */
public class OrderItem {
    private int    oItem_id;
    private int    dash_id;    // 菜品id
    private int    drink_id;   // 饮品id
    private int    mainFood_id;// 主食id
    private String amount;     // 菜品数量

    /**
     * 构造方法： OrderItem.
     *
     */
    public OrderItem() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * 构造方法： OrderItem.
     *
     * @param oItem_id
     * @param dash_id
     * @param drink_id
     * @param mainFood_id
     * @param amount
     */
    public OrderItem(int oItem_id, int dash_id, int drink_id, int mainFood_id, String amount) {
        super();
        this.oItem_id = oItem_id;
        this.dash_id = dash_id;
        this.drink_id = drink_id;
        this.mainFood_id = mainFood_id;
        this.amount = amount;
    }

    /** @return 返回 oItem_id. */
    public int getoItem_id() {
        return oItem_id;
    }

    /**
     * @param oItem_id
     *            设置 oItem_id .
     */
    public void setoItem_id(int oItem_id) {
        this.oItem_id = oItem_id;
    }

    /** @return 返回 dash_id. */
    public int getDash_id() {
        return dash_id;
    }

    /**
     * @param dash_id
     *            设置 dash_id .
     */
    public void setDash_id(int dash_id) {
        this.dash_id = dash_id;
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

    /** @return 返回 mainFood_id. */
    public int getMainFood_id() {
        return mainFood_id;
    }

    /**
     * @param mainFood_id
     *            设置 mainFood_id .
     */
    public void setMainFood_id(int mainFood_id) {
        this.mainFood_id = mainFood_id;
    }

    /** @return 返回 amount. */
    public String getAmount() {
        return amount;
    }

    /**
     * @param amount
     *            设置 amount .
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

}
