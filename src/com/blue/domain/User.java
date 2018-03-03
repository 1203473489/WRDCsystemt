

package com.blue.domain;


/**
 * 名称：用户表 <br>
 * 功能：对类的功能进行说明 <br/>
 * <br/>
 * 
 * @since JDK 1.7
 * @see
 * @author Administrator
 */
public class User {
    private int    user_id;
    private String goinId;    // 登录ID
    private String tele;      // 联系电话
    private String Jur_type;  // 权限
    private String deleteflag;// 删除标记

    /**
     * 构造方法： User.
     *
     */
    public User() {

    }

    /**
     * 构造方法： User.
     *
     * @param user_id
     * @param goinId
     * @param tele
     * @param jur_type
     * @param deleteflag
     */
    public User(int user_id, String goinId, String tele, String jur_type, String deleteflag) {
        super();
        this.user_id = user_id;
        this.goinId = goinId;
        this.tele = tele;
        Jur_type = jur_type;
        this.deleteflag = deleteflag;
    }


    /** @return 返回 user_id. */
    public int getUser_id() {
        return user_id;
    }

    /**
     * @param user_id
     *            设置 user_id .
     */
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    /** @return 返回 goinId. */
    public String getGoinId() {
        return goinId;
    }

    /**
     * @param goinId
     *            设置 goinId .
     */
    public void setGoinId(String goinId) {
        this.goinId = goinId;
    }

    /** @return 返回 tele. */
    public String getTele() {
        return tele;
    }

    /**
     * @param tele
     *            设置 tele .
     */
    public void setTele(String tele) {
        this.tele = tele;
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
