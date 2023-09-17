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
public class Community {
    private String communityname;
    private String cityname;
     private ArrayList<House> houselist; 

    public String getCommunityname() {
        return communityname;
    }

    public void setCommunityname(String communityname) {
        this.communityname = communityname;
    }

    public ArrayList<House> getHouselist() {
        return houselist;
    }

    public void addHouseList(House house) {
        this.houselist.add(house);
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }
    
}
