/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Sergey
 */
@Named(value = "advisorBean")
@SessionScoped
public class AdvisorBean implements Serializable {

    private int id;
    private int firstName;
    private int LastName;
    
    public AdvisorBean() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFirstName() {
        return firstName;
    }

    public void setFirstName(int firstName) {
        this.firstName = firstName;
    }

    public int getLastName() {
        return LastName;
    }

    public void setLastName(int LastName) {
        this.LastName = LastName;
    }
    
    
    
}
