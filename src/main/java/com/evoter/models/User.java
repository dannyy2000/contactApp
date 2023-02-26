package com.evoter.models;

import java.util.Date;
import java.util.Objects;

public class User {
    private Integer id;
    private String name;
    private String sex;
    private Integer age;
    private Integer nin;
    private String email;
    private String password;
    private boolean isAdmin;
    private boolean isSuperAdmin;
    private Date createdAt;

    public User(Integer id, String name, String sex, Integer age, Integer nin, String email, String password, boolean isAdmin, boolean isSuperAdmin, Date createdAt) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.nin = nin;
        this.email = email;
        this.password = password;
        this.isAdmin = isAdmin;
        this.isSuperAdmin = isSuperAdmin;
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNin() {
        return nin;
    }

    public void setNin(Integer nin) {
        this.nin = nin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public boolean isSuperAdmin() {
        return isSuperAdmin;
    }

    public void setSuperAdmin(boolean superAdmin) {
        isSuperAdmin = superAdmin;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return isAdmin == user.isAdmin && isSuperAdmin == user.isSuperAdmin && Objects.equals(id, user.id) && Objects.equals(name, user.name) && Objects.equals(sex, user.sex) && Objects.equals(age, user.age) && Objects.equals(nin, user.nin) && Objects.equals(email, user.email) && Objects.equals(password, user.password) && Objects.equals(createdAt, user.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, sex, age, nin, email, password, isAdmin, isSuperAdmin, createdAt);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", nin=" + nin +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", isAdmin=" + isAdmin +
                ", isSuperAdmin=" + isSuperAdmin +
                ", createdAt=" + createdAt +
                '}';
    }
}
