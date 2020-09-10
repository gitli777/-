package com.itheima.entity;

public class Role {
    private String role_id;
    private String name;
    private String remark;

    public Role() {
    }

    public Role(String role_id, String name, String remark) {
        this.role_id = role_id;
        this.name = name;
        this.remark = remark;
    }

    /**
     * 获取
     * @return role_id
     */
    public String getRole_id() {
        return role_id;
    }

    /**
     * 设置
     * @param role_id
     */
    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String toString() {
        return "Role{role_id = " + role_id + ", name = " + name + ", remark = " + remark + "}";
    }
}
