/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.EventCreator;

import java.util.ArrayList;

/**
 *
 * @author yashrevadekar
 */
public class EventCreatorDir {
    private ArrayList<EventCreator> eventCreatorDir;

    public EventCreatorDir() {
        eventCreatorDir= new ArrayList<>();
    }

    public ArrayList<EventCreator> getChangeMakerDirectory() {
        return eventCreatorDir;
    }

    public void setChangeMakerDirectory(ArrayList<EventCreator> changeMakerDirectory) {
        this.eventCreatorDir = changeMakerDirectory;
    }
    
    //add an event creator
    public EventCreator addChangeMaker(){
        EventCreator cm = new EventCreator();
        eventCreatorDir.add(cm);
        return cm;
    }
    //remove an event creator
    public void removeChangeMaker(EventCreator cm){
        eventCreatorDir.remove(cm);
    }
    
}
