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
public class House {
    private int HouseNo;
    private int zipcode;
    private String Address;
    private String comname;

    public int getHouseNo() {
        return HouseNo;
    }

    public void setHouseNo(int HouseNo) {
        this.HouseNo = HouseNo;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getComname() {
        return comname;
    }

    public void setComname(String comname) {
        this.comname = comname;
    }

    public String getCtyname() {
        return ctyname;
    }

    public void setCtyname(String ctyname) {
        this.ctyname = ctyname;
    }
    private String ctyname;
}
