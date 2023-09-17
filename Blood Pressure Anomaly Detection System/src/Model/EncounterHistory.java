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
public class EncounterHistory {
    private ArrayList<Encounter> encounterlist;
    
    public EncounterHistory(){
        this.encounterlist = new ArrayList<Encounter>();
    }
    
    public void AddEncounter(Encounter EC){
        this.encounterlist.add(EC);
    }

    public ArrayList<Encounter> getEncounterlist() {
        return encounterlist;
    }
    public void removeEnhist(int index){
        this.encounterlist.remove(index);
    }
}
