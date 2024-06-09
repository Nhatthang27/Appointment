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
public class Contact {

    private String contactID;
    private String fullName;
    private boolean gender;
    private Date dob;
    private String address;
    private int type; // Enum-like integers for Friend, Colleague, Partner, etc.
    private String note;

    public Contact(String contactID, String fullName, boolean gender, Date dob, String address, int type, String note) {
        this.contactID = contactID;
        this.fullName = fullName;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.type = type;
        this.note = note;
    }

    public Contact() {
        this.contactID = "";
        this.fullName = "";
        this.gender = true; // Default as per SQL
        this.dob = new Date(1900 - 1900, 0, 1); // Adjust for Date constructor starting from 1900
        this.address = "";
        this.type = 0;
        this.note = "";
    }
}
