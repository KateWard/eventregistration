package ca.mcgill.ecse321.eventregistration.model;

import javax.persistence.Entity;
import java.util.Set;
import javax.persistence.ManyToMany;
import ca.mcgill.ecse321.eventregistration.model.Person;
import javax.persistence.Id;

@Entity
public class Registration{
   private Set<Event> events;
   
   @ManyToMany
   public Set<Event> getEvents() {
      return this.events;
   }
   
   public void setEvents(Set<Event> eventss) {
      this.events = eventss;
   }
   
   private Set<Person> participant;
   
   @ManyToMany
   public Set<Person> getParticipant() {
      return this.participant;
   }
   
   public void setParticipant(Set<Person> participants) {
      this.participant = participants;
   }
   
   private Integer id;

public void setId(Integer value) {
    this.id = value;
}
@Id
public Integer getId() {
    return this.id;
}
}
