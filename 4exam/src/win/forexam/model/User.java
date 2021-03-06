package win.forexam.model;

import java.util.Date;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_user.ID
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_user.login_name
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    private String loginName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_user.password
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_user.email
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_user.phone_no
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    private String phoneNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_user.create_time
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_user.modify_time
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_user.activation_key
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    private String activationKey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_user.status
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_user.channel
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    private Integer channel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_user.nick_name
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    private String nickName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_user.memo
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    private String memo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_user.ID
     *
     * @return the value of ex_user.ID
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_user.ID
     *
     * @param id the value for ex_user.ID
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_user.login_name
     *
     * @return the value of ex_user.login_name
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_user.login_name
     *
     * @param loginName the value for ex_user.login_name
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_user.password
     *
     * @return the value of ex_user.password
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_user.password
     *
     * @param password the value for ex_user.password
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_user.email
     *
     * @return the value of ex_user.email
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_user.email
     *
     * @param email the value for ex_user.email
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_user.phone_no
     *
     * @return the value of ex_user.phone_no
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_user.phone_no
     *
     * @param phoneNo the value for ex_user.phone_no
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo == null ? null : phoneNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_user.create_time
     *
     * @return the value of ex_user.create_time
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_user.create_time
     *
     * @param createTime the value for ex_user.create_time
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_user.modify_time
     *
     * @return the value of ex_user.modify_time
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_user.modify_time
     *
     * @param modifyTime the value for ex_user.modify_time
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_user.activation_key
     *
     * @return the value of ex_user.activation_key
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    public String getActivationKey() {
        return activationKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_user.activation_key
     *
     * @param activationKey the value for ex_user.activation_key
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    public void setActivationKey(String activationKey) {
        this.activationKey = activationKey == null ? null : activationKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_user.status
     *
     * @return the value of ex_user.status
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_user.status
     *
     * @param status the value for ex_user.status
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_user.channel
     *
     * @return the value of ex_user.channel
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    public Integer getChannel() {
        return channel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_user.channel
     *
     * @param channel the value for ex_user.channel
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_user.nick_name
     *
     * @return the value of ex_user.nick_name
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_user.nick_name
     *
     * @param nickName the value for ex_user.nick_name
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_user.memo
     *
     * @return the value of ex_user.memo
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    public String getMemo() {
        return memo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_user.memo
     *
     * @param memo the value for ex_user.memo
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}