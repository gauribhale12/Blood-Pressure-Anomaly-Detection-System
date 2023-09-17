/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author gauri
 */
public class City {
    private String city;
    private ArrayList<Community> communitylist; 

    public ArrayList<Community> getCommunitylist() {
        return communitylist;
    }

    public void addCommunity(Community com) {
        this.communitylist.add(com);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
}
