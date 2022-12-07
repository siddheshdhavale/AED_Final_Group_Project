/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.EventCreator.EventCreatorDir;
import Business.Role.EventCreatorRole;
import java.util.HashSet;
import Business.Role.Role;

/**
 *
 * @author yashrevadekar
 */
public class EventCreatorOrganization extends Organization{
    
     EventCreatorDir eventcreatorlist;
    //constructor to add event maker list to Event Maker directory
    public EventCreatorOrganization()
    {
        super(Organization.Type.EventCreator.getValue());
        eventcreatorlist= new EventCreatorDir();
    }

    public EventCreatorDir getEventcreatorlist() {
        return eventcreatorlist;
    }

    public void setEventcreatorlist(EventCreatorDir eventcreatorlist) {
        this.eventcreatorlist = eventcreatorlist;
    }

    
    
    //hash map to support event maker role
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new EventCreatorRole());
       return role;
       
    }
    
}
