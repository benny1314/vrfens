package com.ttc.entity;

public class User {
    private Integer id;

    private String userName;

    private String password;

    private Integer roleId;

    /** 图片路径 */
    private String imagePath;

    private String encryptionSalt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /** 图片路径 */
    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath == null ? null : imagePath.trim();
    }

    public String getEncryptionSalt() {
        return encryptionSalt;
    }

    public void setEncryptionSalt(String encryptionSalt) {
        this.encryptionSalt = encryptionSalt == null ? null : encryptionSalt.trim();
    }
}