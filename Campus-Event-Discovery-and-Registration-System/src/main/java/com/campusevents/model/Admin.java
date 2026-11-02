package com.campusevents.model;
public class Admin extends User {public Admin(int id,String name,String email,String hash){super(id,name,email,hash);}public String getRole(){return "ADMIN";}}
