/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author gauri
 */
public class Person {
    private String personname;
    private int personage;
    private int personid;
    private int contact;
    House house;
    public Person(String personname, int personage, int personid, int contact,House house){
        this.personname = personname;
        this.personage = personage;
        this.personid = personid;
        this.contact = contact;
        this.house = house;
    }
    public Person(House hou){
        this.house = hou;
    }

    public String getPersonname() {
        return personname;
    }

    public void setPersonname(String personname) {
        this.personname = personname;
    }

    public int getPersonage() {
        return personage;
    }

    public void setPersonage(int personage) {
        this.personage = personage;
    }

    public int getPersonid() {
        return personid;
    }

    public void setPersonid(int personid) {
        this.personid = personid;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
}
