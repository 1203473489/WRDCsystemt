

package com.blue.domain;


/**
 * 名称：权限表 <br>
 * 功能：对类的功能进行说明 <br/>
 * <br/>
 * 
 * @since JDK 1.7
 * @see
 * @author Administrator
 */
public class Jurisdiction {
    //
    private int    Jur_id;
    // 权限类型
    private String Jur_type;

    /** @return 返回 jur_id. */
    public int getJur_id() {
        return Jur_id;
    }

    /**
     * @param jur_id
     *            设置 jur_id .
     */
    public void setJur_id(int jur_id) {
        Jur_id = jur_id;
    }

    /** @return 返回 jur_type. */
    public String getJur_type() {
        return Jur_type;
    }

    /**
     * @param jur_type
     *            设置 jur_type .
     */
    public void setJur_type(String jur_type) {
        Jur_type = jur_type;
    }

}
