package com.xiaoweixin.dto;

import java.util.Date;

public class TRoleMenu {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_menu.id
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_menu.role_no
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    private String roleNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_menu.menu_no
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    private String menuNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_menu.create_time
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_menu.modify_time
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_menu.is_del
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    private Integer isDel;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_menu.id
     *
     * @return the value of t_role_menu.id
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_menu.id
     *
     * @param id the value for t_role_menu.id
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_menu.role_no
     *
     * @return the value of t_role_menu.role_no
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    public String getRoleNo() {
        return roleNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_menu.role_no
     *
     * @param roleNo the value for t_role_menu.role_no
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    public void setRoleNo(String roleNo) {
        this.roleNo = roleNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_menu.menu_no
     *
     * @return the value of t_role_menu.menu_no
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    public String getMenuNo() {
        return menuNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_menu.menu_no
     *
     * @param menuNo the value for t_role_menu.menu_no
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    public void setMenuNo(String menuNo) {
        this.menuNo = menuNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_menu.create_time
     *
     * @return the value of t_role_menu.create_time
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_menu.create_time
     *
     * @param createTime the value for t_role_menu.create_time
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_menu.modify_time
     *
     * @return the value of t_role_menu.modify_time
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_menu.modify_time
     *
     * @param modifyTime the value for t_role_menu.modify_time
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_menu.is_del
     *
     * @return the value of t_role_menu.is_del
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    public Integer getIsDel() {
        return isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_menu.is_del
     *
     * @param isDel the value for t_role_menu.is_del
     *
     * @mbggenerated Fri Sep 01 16:42:11 CST 2017
     */
    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
}