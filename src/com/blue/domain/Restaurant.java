

package com.blue.domain;


/**
 * 名称：餐厅表 <br>
 * 功能：对类的功能进行说明 <br/>
 * <br/>
 * 
 * @since JDK 1.7
 * @see
 * @author Administrator
 */
public class Restaurant {
    private int    rest_id;
    private String rest_name;
    private String deleteflag;


    /**
     * 构造方法： Restaurant.
     *
     */
    public Restaurant() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * 构造方法： Restaurant.
     *
     * @param rest_id
     * @param rest_name
     * @param deleteflag
     * @param memo1
     * @param memo2
     * @param memo3
     */
    public Restaurant(int rest_id, String rest_name, String deleteflag) {
        super();
        this.rest_id = rest_id;
        this.rest_name = rest_name;
        this.deleteflag = deleteflag;

    }

    /** @return 返回 rest_id. */
    public int getRest_id() {
        return rest_id;
    }

    /**
     * @param rest_id
     *            设置 rest_id .
     */
    public void setRest_id(int rest_id) {
        this.rest_id = rest_id;
    }

    /** @return 返回 rest_name. */
    public String getRest_name() {
        return rest_name;
    }

    /**
     * @param rest_name
     *            设置 rest_name .
     */
    public void setRest_name(String rest_name) {
        this.rest_name = rest_name;
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
