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
public class PatientDirectory {
    
    private ArrayList<Patient> PatientList;
 
public PatientDirectory(){
    PatientList = new ArrayList<Patient>();
}    

    public ArrayList<Patient> getPatientList() {
        return PatientList;
    } 
    public void AddPatient(Patient Pat){
        this.PatientList.add(Pat);
          
    }
    public void removepat(int index){
        this.PatientList.remove(index);
    }
    
}
