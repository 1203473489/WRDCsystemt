/**
 * 中国邮政新一代寄递平台
 *
 * 子系统名: 模 块 名: 文件名称: Order.java 创建日期: 2018年2月28日下午9:57:37 创 建 人: Administrator 版权所有: 2018 中国邮政集团公司
 * 保留所有权利
 */

package com.blue.domain;


/**
 * 名称：主订单表 <br>
 * 功能：对类的功能进行说明 <br/>
 * <br/>
 * 
 * @since JDK 1.7
 * @see
 * @author Administrator
 */
public class Order {
    private int    order_id;
    private int    oItem_id;
    private int    seat_id;    // 座位id
    private int    rest_name;  // 餐厅id
    private String order_time; // 下单时间
    private String paystatus;  // 支付状态
    private String counts;     // 用餐人数

    /**
     * 构造方法： Order.
     *
     */
    public Order() {
        super();
        // TODO Auto-generated constructor stub
    }


    /**
     * 构造方法： Order.
     *
     * @param order_id
     * @param oItem_id
     * @param seat_id
     * @param rest_name
     * @param order_time
     * @param paystatus
     * @param counts
     */
    public Order(int order_id, int oItem_id, int seat_id, int rest_name, String order_time,
        String paystatus, String counts) {
        super();
        this.order_id = order_id;
        this.oItem_id = oItem_id;
        this.seat_id = seat_id;
        this.rest_name = rest_name;
        this.order_time = order_time;
        this.paystatus = paystatus;
        this.counts = counts;
    }


    /** @return 返回 order_id. */
    public int getOrder_id() {
        return order_id;
    }

    /**
     * @param order_id
     *            设置 order_id .
     */
    public void setOrder_id(int order_id) {
        this.order_id = order_id;
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

    /** @return 返回 seat_id. */
    public int getSeat_id() {
        return seat_id;
    }

    /**
     * @param seat_id
     *            设置 seat_id .
     */
    public void setSeat_id(int seat_id) {
        this.seat_id = seat_id;
    }


    /** @return 返回 rest_name. */
    public int getRest_name() {
        return rest_name;
    }


    /**
     * @param rest_name
     *            设置 rest_name .
     */
    public void setRest_name(int rest_name) {
        this.rest_name = rest_name;
    }


    /** @return 返回 order_time. */
    public String getOrder_time() {
        return order_time;
    }

    /**
     * @param order_time
     *            设置 order_time .
     */
    public void setOrder_time(String order_time) {
        this.order_time = order_time;
    }

    /** @return 返回 paystatus. */
    public String getPaystatus() {
        return paystatus;
    }

    /**
     * @param paystatus
     *            设置 paystatus .
     */
    public void setPaystatus(String paystatus) {
        this.paystatus = paystatus;
    }

    /** @return 返回 counts. */
    public String getCounts() {
        return counts;
    }

    /**
     * @param counts
     *            设置 counts .
     */
    public void setCounts(String counts) {
        this.counts = counts;
    }

}
