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
public class PersonDirectory {
    private ArrayList<Person> PersonList;
   
    
public PersonDirectory(){
    this.PersonList =new ArrayList<Person>();
}    

    public ArrayList<Person> getPersonList() {
        return PersonList;
    }

    public void setPersonList(ArrayList<Person> PersonList) {
        this.PersonList = PersonList;
    }
    
    public Person addPerson(){
      House house = new House();
      Person newPerson = new Person("",0,0,0,house);
      PersonList.add(newPerson);
      return newPerson;
      
    }
    public void removePer(int index){
       PersonList.remove(index);
    }
    
}
