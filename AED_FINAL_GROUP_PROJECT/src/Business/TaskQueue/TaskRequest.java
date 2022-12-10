/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.TaskQueue;


import Business.CSO.CSO;
import Business.EventCreator.EventCreator;

import Business.FireFighter.FireFighter;
import Business.Cops.Cops;
import Business.Supplier.Item;
import Business.Supplier.Supplier;
import Business.UserCredentials.UserCredentials;
import Business.Victim.Victim;
import Business.Volunteer.Volunteer;
import java.util.Date;

/**
 *
 * @author siddh
 */
public abstract class TaskRequest {
    
private String subject;
    private UserCredentials sender;
    private UserCredentials reciever;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private EventCreator eventCreator;
    private Victim changeSeeker;
    private CSO cso;
    private Supplier supplier;
    private Item item;
    private Volunteer volunteer;
    private Cops cops;
    private FireFighter firefighter;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public UserCredentials getSender() {
        return sender;
    }

    public void setSender(UserCredentials sender) {
        this.sender = sender;
    }

    public UserCredentials getReciever() {
        return reciever;
    }

    public void setReciever(UserCredentials reciever) {
        this.reciever = reciever;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    public EventCreator getEventCreator() {
        return eventCreator;
    }

    public void setEventCreator(EventCreator eventCreator) {
        this.eventCreator = eventCreator;
    }

    public Victim getChangeSeeker() {
        return changeSeeker;
    }

    public void setChangeSeeker(Victim changeSeeker) {
        this.changeSeeker = changeSeeker;
    }

    public CSO getCso() {
        return cso;
    }

    public void setCso(CSO cso) {
        this.cso = cso;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Volunteer getVolunteer() {
        return volunteer;
    }

    public void setVolunteer(Volunteer volunteer) {
        this.volunteer = volunteer;
    }

    public Cops getCops() {
        return cops;
    }

    public void setCops(Cops cops) {
        this.cops = cops;
    }

    public FireFighter getFirefighter() {
        return firefighter;
    }

    public void setFirefighter(FireFighter firefighter) {
        this.firefighter = firefighter;
    }

  
    
    @Override
    public String toString(){
        return status;
    }
   
    
}
