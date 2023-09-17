/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.time.LocalDateTime;

/**
 *
 * @author gauri
 */
public class Encounter {
    private VitalSigns VSigns;
    private LocalDateTime enconterdate;
    private boolean isPatientNormal;
    private int patientId;

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public boolean isIsPatientNormal() {
        return isPatientNormal;
    }

    public void setIsPatientNormal(boolean isPatientNormal) {
        this.isPatientNormal = isPatientNormal;
    }
    
    public Encounter(VitalSigns vitalsigns){
        this.VSigns = vitalsigns;
    }

    public VitalSigns getVSigns() {
        return VSigns;
    }

    public void setVSigns(VitalSigns VSigns) {
        this.VSigns = VSigns;
    }

    public LocalDateTime getEnconterdate() {
        return enconterdate;
    }

    public void setEnconterdate(LocalDateTime enconterdate) {
        this.enconterdate = enconterdate;
    }
    
    public boolean isPatNormal(int BP){
        if(BP < 80 || BP > 120){
            return false;
        }
        return true;
    }
    
    
}
