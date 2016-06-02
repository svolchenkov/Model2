/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.entity;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Sergey
 */
@XmlRootElement
public class DashBoardEntityWS {
    
    private String first;
    private int second;

    public DashBoardEntityWS() {
        this.first = "firstConstructor";
        this.second = 1;
    }

    
    
    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    @Override
    public String toString() {
        return "ObjectWitchShow{" + "first=" + first + ", second=" + second + '}';
    }

}
