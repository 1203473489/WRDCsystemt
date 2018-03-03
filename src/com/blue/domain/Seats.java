
package com.blue.domain;


/**
 * 名称：桌号表 <br>
 * 功能：对类的功能进行说明 <br/>
 * <br/>
 * 
 * @since JDK 1.7
 * @see
 * @author Administrator
 */
public class Seats {
    private int seate_id;
    private int rest_id;

    /**
     * 构造方法： Seats.
     *
     */
    public Seats() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * 构造方法： Seats.
     *
     * @param seate_id
     * @param rest_id
     */
    public Seats(int seate_id, int rest_id) {
        super();
        this.seate_id = seate_id;
        this.rest_id = rest_id;
    }

    /** @return 返回 seate_id. */
    public int getSeate_id() {
        return seate_id;
    }

    /**
     * @param seate_id
     *            设置 seate_id .
     */
    public void setSeate_id(int seate_id) {
        this.seate_id = seate_id;
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

}
