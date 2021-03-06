package com.ssmbase.basesic.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public class WxMenu implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Wx_Button_Menu.ID
     *
     * @mbg.generated
     */
    @Id
    @GeneratedValue(generator = "JDBC")//返回自增长主键
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Wx_Button_Menu.Button_Name
     *
     * @mbg.generated
     */
    private String buttonName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Wx_Button_Menu.Title_Name
     *
     * @mbg.generated
     */
    private String titleName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Wx_Button_Menu.Type
     *
     * @mbg.generated
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Wx_Button_Menu.ParentId
     *
     * @mbg.generated
     */
    private Integer parentid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Wx_Button_Menu.Is_Enable
     *
     * @mbg.generated
     */
    private Boolean isEnable;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Wx_Button_Menu.Create_Time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Wx_Button_Menu.Create_UserId
     *
     * @mbg.generated
     */
    private Integer createUserid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Wx_Button_Menu.Update_Time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Wx_Button_Menu.Update_UserId
     *
     * @mbg.generated
     */
    private Integer updateUserid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Wx_Button_Menu.OrgId
     *
     * @mbg.generated
     */
    private Integer orgid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Wx_Button_Menu
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Wx_Button_Menu
     *
     * @mbg.generated
     */
    public WxMenu(Integer id, String buttonName, String titleName, String type, Integer parentid, Boolean isEnable, Date createTime, Integer createUserid, Date updateTime, Integer updateUserid, Integer orgid) {
        this.id = id;
        this.buttonName = buttonName;
        this.titleName = titleName;
        this.type = type;
        this.parentid = parentid;
        this.isEnable = isEnable;
        this.createTime = createTime;
        this.createUserid = createUserid;
        this.updateTime = updateTime;
        this.updateUserid = updateUserid;
        this.orgid = orgid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Wx_Button_Menu
     *
     * @mbg.generated
     */
    public WxMenu() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Wx_Button_Menu.ID
     *
     * @return the value of Wx_Button_Menu.ID
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Wx_Button_Menu.ID
     *
     * @param id the value for Wx_Button_Menu.ID
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Wx_Button_Menu.Button_Name
     *
     * @return the value of Wx_Button_Menu.Button_Name
     *
     * @mbg.generated
     */
    public String getButtonName() {
        return buttonName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Wx_Button_Menu.Button_Name
     *
     * @param buttonName the value for Wx_Button_Menu.Button_Name
     *
     * @mbg.generated
     */
    public void setButtonName(String buttonName) {
        this.buttonName = buttonName == null ? null : buttonName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Wx_Button_Menu.Title_Name
     *
     * @return the value of Wx_Button_Menu.Title_Name
     *
     * @mbg.generated
     */
    public String getTitleName() {
        return titleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Wx_Button_Menu.Title_Name
     *
     * @param titleName the value for Wx_Button_Menu.Title_Name
     *
     * @mbg.generated
     */
    public void setTitleName(String titleName) {
        this.titleName = titleName == null ? null : titleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Wx_Button_Menu.Type
     *
     * @return the value of Wx_Button_Menu.Type
     *
     * @mbg.generated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Wx_Button_Menu.Type
     *
     * @param type the value for Wx_Button_Menu.Type
     *
     * @mbg.generated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Wx_Button_Menu.ParentId
     *
     * @return the value of Wx_Button_Menu.ParentId
     *
     * @mbg.generated
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Wx_Button_Menu.ParentId
     *
     * @param parentid the value for Wx_Button_Menu.ParentId
     *
     * @mbg.generated
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Wx_Button_Menu.Is_Enable
     *
     * @return the value of Wx_Button_Menu.Is_Enable
     *
     * @mbg.generated
     */
    public Boolean getIsEnable() {
        return isEnable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Wx_Button_Menu.Is_Enable
     *
     * @param isEnable the value for Wx_Button_Menu.Is_Enable
     *
     * @mbg.generated
     */
    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Wx_Button_Menu.Create_Time
     *
     * @return the value of Wx_Button_Menu.Create_Time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Wx_Button_Menu.Create_Time
     *
     * @param createTime the value for Wx_Button_Menu.Create_Time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Wx_Button_Menu.Create_UserId
     *
     * @return the value of Wx_Button_Menu.Create_UserId
     *
     * @mbg.generated
     */
    public Integer getCreateUserid() {
        return createUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Wx_Button_Menu.Create_UserId
     *
     * @param createUserid the value for Wx_Button_Menu.Create_UserId
     *
     * @mbg.generated
     */
    public void setCreateUserid(Integer createUserid) {
        this.createUserid = createUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Wx_Button_Menu.Update_Time
     *
     * @return the value of Wx_Button_Menu.Update_Time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Wx_Button_Menu.Update_Time
     *
     * @param updateTime the value for Wx_Button_Menu.Update_Time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Wx_Button_Menu.Update_UserId
     *
     * @return the value of Wx_Button_Menu.Update_UserId
     *
     * @mbg.generated
     */
    public Integer getUpdateUserid() {
        return updateUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Wx_Button_Menu.Update_UserId
     *
     * @param updateUserid the value for Wx_Button_Menu.Update_UserId
     *
     * @mbg.generated
     */
    public void setUpdateUserid(Integer updateUserid) {
        this.updateUserid = updateUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Wx_Button_Menu.OrgId
     *
     * @return the value of Wx_Button_Menu.OrgId
     *
     * @mbg.generated
     */
    public Integer getOrgid() {
        return orgid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Wx_Button_Menu.OrgId
     *
     * @param orgid the value for Wx_Button_Menu.OrgId
     *
     * @mbg.generated
     */
    public void setOrgid(Integer orgid) {
        this.orgid = orgid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Wx_Button_Menu
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", buttonName=").append(buttonName);
        sb.append(", titleName=").append(titleName);
        sb.append(", type=").append(type);
        sb.append(", parentid=").append(parentid);
        sb.append(", isEnable=").append(isEnable);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUserid=").append(createUserid);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateUserid=").append(updateUserid);
        sb.append(", orgid=").append(orgid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}