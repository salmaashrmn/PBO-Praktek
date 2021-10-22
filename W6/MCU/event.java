
public class event {

    String nameEvent;
    String location;
    
    public event(String nameEvent, String location){
        this.nameEvent = nameEvent;
        this.location = location;
        
    }
    
    public String getNameEvent() {
        return nameEvent;
    }

    public void setNameEvent(String nameEvent) {
        this.nameEvent = nameEvent;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
  
}
