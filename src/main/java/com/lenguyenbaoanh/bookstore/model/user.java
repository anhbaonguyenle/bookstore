package com.lenguyenbaoanh.bookstore.model;

public class user {
    private String username;
    private String password;
    private String name;
    private String phone;
    private String address;
    private long billHistory;
    private int role; //1 is admin, 0 is user, 2 is prime admin

    public user() {
    }

    public user(String username, String password, String name, String phone, String address, long billHistory, int role) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.billHistory = billHistory;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getBillHistory() {
        return billHistory;
    }

    public void setBillHistory(long billHistory) {
        this.billHistory = billHistory;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "user{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", billHistory=" + billHistory +
                ", role=" + role +
                '}';
    }
}
