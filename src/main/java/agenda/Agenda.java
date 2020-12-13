package agenda;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

/**
 * Description : An agenda that stores events
 */
public class Agenda {
    
       private ArrayList<Event> listEvenement;
    
        public Agenda(){
        this.listEvenement=new ArrayList();
    }

    
    
    /**
     * Adds an event to this agenda
     *
     * @param e the event to add
     */
    public void addEvent(Event e) {                
                this.listEvenement.add(e);
    }

    /**
     * Computes the events that occur on a given day
     *
     * @param day the day to test
     * @return and iteraror to the events that occur on that day
     */
    public List<Event> eventsInDay(LocalDate day) {
        ArrayList <Event> listEvenementDuJour= new ArrayList() ;
        for( Event value : listEvenement) {
            if (value.isInDay(day)){
                listEvenementDuJour.add(value);

            }
        }
                return listEvenementDuJour;
    }
    
    public List<Event> findByTitle(String titre){
        ArrayList<Event> listTitre = new ArrayList<Event>() ;
        for( Event value : listEvenement) {
            if(value.getTitle()==titre){
                listTitre.add(value);

            }
        }
        
               return listTitre ;       
    }
    
    
    public boolean isFreeFor(Event event){
        for( Event value : listEvenement) {
            if (event.getStart()==value.getStart()) {
                return false;

            }
        }
        
        
        return true;
    }
}
         
                   
    
          

    
    



    
    

    
    
