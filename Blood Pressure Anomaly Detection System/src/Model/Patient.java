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
public class Patient extends Person{
    
    private VitalSigns VSgns;
    private int patientId;

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
    boolean isnorm;
    
    public Patient(String personname, int personage, int personid, int contact, House house,VitalSigns VSgns){
        super(personname, personage, personid, contact, house);
        this.VSgns=VSgns;
    }

    public boolean isIsnorm() {
        return isnorm;
    }

    public void setIsnorm(boolean isnorm) {
        this.isnorm = isnorm;
    }

    public VitalSigns getVSgns() {
        return VSgns;
    }

    public void setVSgns(VitalSigns VSgns) {
        this.VSgns = VSgns;
    }
    public boolean ISNorm(int personage){
        if(personage<50){
          if(VSgns.getBP()<80 || VSgns.getBP()>120){
              return false;    
          }
        }
        else{
            if(VSgns.getBP()<70 || VSgns.getBP()>130){
                return false;
            }
        }
        return true;
    }
}
