/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author Nhatthang
 */
public class Account {
    /*
    accountID VARCHAR(50) PRIMARY KEY NOT NULL,
    password VARCHAR(35) NOT NULL,
    fullName NVARCHAR(30) NOT NULL,
    dob DATETIME,
    gender BIT DEFAULT 1,
    phone VARCHAR(20) DEFAULT '',
    address NVARCHAR(50) DEFAULT '',
    note TEXT DEFAULT ''
    */
    private String accountID;
    private String password;
    private String fullname;
    private Date dob;
    private boolean gender;
    private String phone;
    private String address;
    private String note;

    public Account(String accountID, String password, String fullname, Date dob, boolean gender, String phone, String address, String note) {
        this.accountID = accountID;
        this.password = password;
        this.fullname = fullname;
        this.dob = dob;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
        this.note = note;
    }

    public Account() {
        this.accountID = "";
        this.password = "";
        this.fullname = "";
        this.dob = new Date(1900, 1, 1);
//        this.gender = false;
        this.phone = "";
        this.address = "";
        this.note = "";
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Account{" + "accountID=" + accountID + ", password=" + password + ", fullname=" + fullname + ", dob=" + dob + ", gender=" + gender + ", phone=" + phone + ", address=" + address + ", note=" + note + '}';
    }
    
    
}
