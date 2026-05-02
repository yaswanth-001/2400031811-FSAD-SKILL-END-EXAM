package com.klef.fsad.exam;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class CustomerAccount {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;

 private String name;
 private String description;

 @Temporal(TemporalType.DATE)
 private Date date;

 private String status;

 public CustomerAccount() {}

 public CustomerAccount(String name, String description, Date date, String status) {
  this.name = name;
  this.description = description;
  this.date = date;
  this.status = status;
 }

 public int getId() { return id; }
 public void setName(String name) { this.name = name; }
 public void setDescription(String d) { this.description = d; }
 public void setDate(Date date) { this.date = date; }
 public void setStatus(String status) { this.status = status; }
}