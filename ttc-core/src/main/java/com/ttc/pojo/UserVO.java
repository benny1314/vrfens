package com.ttc.pojo;



public class UserVO {
    /**
     * user主键ID
     */
    private Integer id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 角色ID
     */
    private Integer roleId;

    /**
     * 图片路径
     */
    private String imagePath;

    /**
     * MD5加密的盐
     */
    private String encryptionSalt;

    /**
     * user主键ID
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 用户名
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 密码
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 角色ID
     */
    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 图片路径
     */
    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath == null ? null : imagePath.trim();
    }

    /**
     * MD5加密的盐
     */
    public String getEncryptionSalt() {
        return encryptionSalt;
    }

    public void setEncryptionSalt(String encryptionSalt) {
        this.encryptionSalt = encryptionSalt == null ? null : encryptionSalt.trim();
    }
}