package ca.mcgill.ecse321.eventregistration.model;

import javax.persistence.Entity;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.Id;

@Entity
public class RegistrationManager{
   private Set<Person> person;
   
   @OneToMany(cascade={CascadeType.ALL})
   public Set<Person> getPerson() {
      return this.person;
   }
   
   public void setPerson(Set<Person> persons) {
      this.person = persons;
   }
   
   private Set<Event> events;
   
   @OneToMany(mappedBy="registrationManager" , cascade={CascadeType.ALL})
   public Set<Event> getEvents() {
      return this.events;
   }
   
   public void setEvents(Set<Event> eventss) {
      this.events = eventss;
   }
   
   private Set<Registration> registration;
   
   @OneToMany(cascade={CascadeType.ALL})
   public Set<Registration> getRegistration() {
      return this.registration;
   }
   
   public void setRegistration(Set<Registration> registrations) {
      this.registration = registrations;
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
