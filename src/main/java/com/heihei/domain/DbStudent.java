package com.heihei.domain;

import java.util.Date;

public class DbStudent {
    /**
    * 编号
    */
    private String id;

    /**
    * 登录名称
    */
    private String loginName;

    /**
    * 登录密码
    */
    private String loginPassword;

    /**
    * 注册时间
    */
    private Date regitTime;

    /**
    * 审核状态
    */
    private String auditType;

    /**
    * 学生姓名
    */
    private String stuName;

    /**
    * 性别
    */
    private String sex;

    /**
    * 学院
    */
    private String schoolRoom;

    /**
    * 班级
    */
    private String classRoom;

    /**
    * 联系电话
    */
    private String phone;

    /**
    * 头像
    */
    private String pic;

    /**
    * 备注
    */
    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public Date getRegitTime() {
        return regitTime;
    }

    public void setRegitTime(Date regitTime) {
        this.regitTime = regitTime;
    }

    public String getAuditType() {
        return auditType;
    }

    public void setAuditType(String auditType) {
        this.auditType = auditType;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSchoolRoom() {
        return schoolRoom;
    }

    public void setSchoolRoom(String schoolRoom) {
        this.schoolRoom = schoolRoom;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", loginName=").append(loginName);
        sb.append(", loginPassword=").append(loginPassword);
        sb.append(", regitTime=").append(regitTime);
        sb.append(", auditType=").append(auditType);
        sb.append(", stuName=").append(stuName);
        sb.append(", sex=").append(sex);
        sb.append(", schoolRoom=").append(schoolRoom);
        sb.append(", classRoom=").append(classRoom);
        sb.append(", phone=").append(phone);
        sb.append(", pic=").append(pic);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}