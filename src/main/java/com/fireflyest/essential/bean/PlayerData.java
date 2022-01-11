package com.fireflyest.essential.bean;

/**
 * @author Fireflyest
 * 2021/12/31 23:04
 */

public class PlayerData {

    private String uuid;

    private String name;

    private String password;

    private String email;

    private long register;

    private double money;

    private int level;

    public PlayerData() {
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getRegister() {
        return register;
    }

    public void setRegister(long register) {
        this.register = register;
    }
}
